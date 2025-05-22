import java.util.*;

public class Student {

	public int id;
	public double gpa;
	public String name;
	public String gender;

	public Student() {
		this.id = 0;
		this.gpa = 0.0;
		this.name = null;
		this.gender = null;
	}

	public Student(int id, double gpa, String name, String gender) {
		this.id = id;
		this.gpa = gpa;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", gpa=" + gpa + ", name=" + name + ", gender=" + gender + "]";
	}

	public boolean status() {
		if (gpa > 2) {
			return true;
		}
		return false;
	}

	public int getId() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student(201902410, 2.5, "riad", "Male");
		Student s2 = new Student();
		
		System.out.println("The student with def values");
		System.out.println("The student " + s2.name + " has not ye entered his gender has an ID of " + s2.id + " and a gpa = " + s2.gpa);

	}

}
