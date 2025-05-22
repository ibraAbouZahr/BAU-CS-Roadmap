import java.util.*;
public class BMI {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		int w = scan.nextInt();
		System.out.println("Enter weight in inches:");
		int i = scan.nextInt();
		double kg = (int)(w * 0.45359237);
		double h = (int)i*0.0254;
		
		double BMI = (kg/(h*h) );
		System.out.println("The BMI is: " + BMI);
		if (BMI < 18.5) {
			System.out.println("Underweight"); }
		else if (18.5 <= BMI || BMI > 24.9) {
			System.out.println("Normal"); }
		else if (25.0 <= BMI || BMI > 29.9) {
			System.out.println("overweight"); }
		else if (BMI > 30){
			System.out.println("obese");
		
		
		}
	}

}
