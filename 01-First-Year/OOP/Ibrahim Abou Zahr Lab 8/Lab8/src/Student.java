
public class Student extends Person {
	private int numCourses;
	private String[] courses;
	private int[] grades;
	
	
	Student(int numCourses, String[] courses,int[] grades,String name, String address) {
		super(name,address);
		this.numCourses = numCourses;
		this.courses = courses;
		this.grades = grades;
		
	}
	public void addCourses() {
		
		numCourses++;
		for(int i = 0; i < numCourses ; i++) {
			
			
		}
	}
	public void printGrades() {
		for(int i = 0; i < numCourses; i++) {
			for(int j = 0; j < numCourses; j++) {
			System.out.println(courses[i] + grades[j]);
		}
	}
		}
	public int getAverageGrades() {
		int sum = 0;
		for(int i = 0; i < numCourses ; i++) {
			 sum = sum + grades[i]; 
		}
		return sum/numCourses;
	}

}
