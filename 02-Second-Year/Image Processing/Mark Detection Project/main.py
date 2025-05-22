import cv2
import numpy as np
import Utilities

widthImg = 600
heightImg = 600
questions = 5
choices = 5
ans = [1,2,0,1,4]

path = "1.jpg"
img = cv2.imread(path)

# Preprocessing

# change image size
img = cv2.resize(img,(widthImg, heightImg))
imgContours = img.copy()
imgFinal = img.copy()
imgBiggestContours = img.copy()
# Grayscale image
imgGray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
# Make image blurry
imgBlur = cv2.GaussianBlur(imgGray, (5,5),1)
# Canny edge detector
imgCanny = cv2.Canny(imgBlur, 10, 50)
# finding all countours
countours, hierarchy = cv2.findContours(imgCanny, cv2.RETR_EXTERNAL,cv2.CHAIN_APPROX_NONE)
cv2.drawContours(imgContours,countours, -1,(0,255,0),10)
# find rectangles
rectCon = Utilities.rectCountour(countours)
biggestCountour = Utilities.getCornerPoints(rectCon[0])
print(biggestCountour.shape)
gradePoint = Utilities.getCornerPoints(rectCon[1]) # second biggest countour
#print(biggestCountour)

if biggestCountour.size!= 0 and gradePoint.size != 0:
    cv2.drawContours(imgBiggestContours, biggestCountour,-1,(0,255,0),20)
    cv2.drawContours(imgBiggestContours, gradePoint, -1, (255, 0, 0), 20)
    biggestCountour = Utilities.reorder(biggestCountour)
    gradePoint = Utilities.reorder(gradePoint)

    pt1 = np.float32(biggestCountour)
    pt2 = np.float32([[0,0],[widthImg,0],[0, heightImg],[widthImg, heightImg]])
    matrix = cv2.getPerspectiveTransform(pt1,pt2)
    # getting the big countour and displaying it as an image(grades)
    imgWarpColoured = cv2.warpPerspective(img, matrix, (widthImg, heightImg))

    G1 = np.float32(gradePoint)
    G2 = np.float32([[0, 0], [325, 0], [0, 150], [325, 150]])
    matrixG = cv2.getPerspectiveTransform(G1, G2)
    # getting the second big countour and displaying it as an image(final mark bar)
    imageGradeDisplay = cv2.warpPerspective(img, matrixG, (325, 150))

    # Apply Threshold
    imgWarpGray = cv2.cvtColor(imgWarpColoured,cv2.COLOR_BGR2GRAY)
    imgThresh = cv2.threshold(imgWarpGray,170,255,cv2.THRESH_BINARY_INV)[1]

    boxes = Utilities.splitBoxes(imgThresh)
    # cv2.imshow("Test", boxes[2])
    # print(cv2.countNonZero(boxes[1]),cv2.countNonZero(boxes[2]))
    # get pixel non zero values of each box
    myPixelVal = np.zeros((questions, choices))
    countC = 0
    countR= 0

    for image in boxes:
        totalPixels = cv2.countNonZero(image)
        myPixelVal[countR][countC] = totalPixels
        # to iterate through all marks
        countC += 1
        if(countC == choices): countR += 1; countC = 0
    #print(myPixelVal)

    # finding index values of the markings
    myIndex = []
    for x in range(0,questions):
        arr = myPixelVal[x]
        myIndexVAl = np.where(arr == np.amax(arr))
        myIndex.append(myIndexVAl[0][0])


    # grading
    grading = []
    for x in range (0, questions):
        if ans[x] == myIndex[x]:
            grading.append(1)
        else: grading.append(0)
    #print(grading)
    score = (sum(grading)/questions)*100 #Final Grade
    print(score)


    # displaying answers
    imgResult = imgWarpColoured.copy()
    imgResult = Utilities.showAnswers(imgResult,myIndex,grading,ans,questions,choices)
    imgRawDrawing = np.zeros_like(imgWarpColoured)
    imgRawDrawing = Utilities.showAnswers(imgRawDrawing, myIndex, grading, ans, questions, choices)
    invMatrix = cv2.getPerspectiveTransform(pt2, pt1)
    imgInvWarp = cv2.warpPerspective(imgRawDrawing, invMatrix, (widthImg, heightImg))

    imgRawGrade = np.zeros_like(imageGradeDisplay)
    cv2.putText(imgRawGrade, str(int(score))+ "%", (70,100),cv2.FONT_HERSHEY_PLAIN, 3, (0,255,255),3)
    invMatrixG = cv2.getPerspectiveTransform(G2, G1)


    imageInvGradeDisplay = cv2.warpPerspective(imgRawGrade, invMatrixG, (widthImg, heightImg))


    imgFinal = cv2.addWeighted(imgFinal,1,imgInvWarp,1,0)
    imgFinal = cv2.addWeighted(imgFinal, 1, imageInvGradeDisplay, 1, 0)


imgBlank = np.zeros_like(img)
imgArray = ([img,imgGray,imgBlur,imgCanny],
            [imgContours,imgBiggestContours,imgWarpColoured,imgThresh],
            [imgResult,imgRawDrawing,imgInvWarp,imgFinal])
lables = [["Original", "Gray", "Blur", "Canny"],
          ["Contours","Biggest Con", "Warp", "Threshold"],
          ["Result", "Raw Drawing", "Inv Warp", "Final"]]
imageStacked = Utilities.stackImages(imgArray,0.3,lables)
cv2.imshow("Final Result" , imgFinal)
cv2.imshow("Stacked Images ", imageStacked)
cv2.waitKey(0)

