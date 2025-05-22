import java.util.*;
public class Ex4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double [] array = new double [10];
	System.out.println("Enter 10 elements in the array: ");
	for(int i = 0; i < 10 ; i++) {
		System.out.println("a["+(i+1)+"]");
		array[i] = scan.nextInt();
	}
	double mean = calculateMean(array);
	System.out.println(calculateStdDev(array,  mean));
	}
public static double calculateMean(double array[]) {
	double sum = 0.0;
	for(int i = 0; i < 10 ; i++) {
		 sum = array[i]+ sum;
	}
	double mean = sum/10;
	
	
	return mean;
}
public static double calculateStdDev(double[]array, double mean) {
	double standard_deviation = 0;
	for(int i = 0; i < array.length ; i++) {
		standard_deviation += Math.pow(array[i] - mean, 2);
		
	}
	double k = Math.sqrt(standard_deviation/array.length) ;
	return k;
}
}
