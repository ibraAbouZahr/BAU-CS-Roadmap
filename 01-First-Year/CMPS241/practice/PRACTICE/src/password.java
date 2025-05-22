import java.util.*;
public class password {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Username: ");
	String Username = scan.next();
	System.out.println("Password: ");
	String Password = scan.next(); 
	Pass(Username , Password);
	
	
	}
	
	
	
	public static void Pass(String Username , String Password) {
		if ( Username.equals("anonymous") && Password.equals( "P@ssw0rd")) {
			System.out.println("Succesfully logged in"); }
		else {
			System.out.println("Wrong username or password");
			
		}
		
		
	
	}


}