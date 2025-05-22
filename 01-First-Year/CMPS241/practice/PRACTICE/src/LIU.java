import java.util.Scanner;
public class LIU {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter the time you left on Monday: ");
	int m = scan.nextInt();
	System.out.println("Please enter the time you left on Tuesday: ");
	int t = scan.nextInt();
	System.out.println("Please enter the time you left on Wednesday: ");
	int w = scan.nextInt();
	System.out.println("Please enter the time you left on Thursday: ");
	int th = scan.nextInt();
	System.out.println("Please enter the time you left on Friday ");
	int f = scan.nextInt();
	System.out.println("");

	int x = m + 3;
	int y = t + 3;
	int z = w + 3;
	int d = th + 3;
	int p = f + 3;
	int SUM = x + y + z + d +p;
	int reg = 35*7;
	double result;
	if  (SUM > 35) {
		result=(double) (10.5* (SUM - 35) + reg);
		  System.out.println("Your total weekly salary is $"+result);
		
	}else {
		 result=SUM*7;
			System.out.println("Your total weekly salary is " +  result+ "$" );
		
			
	}
	double tax=result*0.03;
System.out.println("The tax "+tax);
double net =result-tax;
System.out.println("The net salary "+net);


	

	}

}
