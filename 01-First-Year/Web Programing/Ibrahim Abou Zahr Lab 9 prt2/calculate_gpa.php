<!DOCTYPE html>
<html lang="en">
<head>
    
   
    <title>GPA Calculator</title>
</head>
<body>
    <?php
    number = $_POST['hide'];
    $total = 0;
    $weighted_grade_points = 0;
    for($i = 1; $i <= $number; $i++) {
        $course_name = $_POST['course' . $i];
        $credits = $_POST['credits' . $i];
        $grades = $_POST['grades' . $i];
        $total += $credits;
        $weighted_grade_points +=  $grades*$credits;

    }

    $GPA = $weighted_grade_points /  $total;
    echo 'Your total GPA is: ' . $i . $GPA;




?>
</body>
</html>