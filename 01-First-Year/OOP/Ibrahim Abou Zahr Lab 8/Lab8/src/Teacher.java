import java.util.Arrays;

public class Teacher extends Person {
	private int numCourses;
	private String[] courses;
	
	
	public Teacher(String name, String address) {
		super(name,address);
	}


	
	public String toString() {
		return "Teacher [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + "]";
	}
	

}
