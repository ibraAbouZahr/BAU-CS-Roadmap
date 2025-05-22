import java.util.*;
public class FunnyString {

	public static void main(String[] args) {
		
		
		
	}
	
	class Result {

	    /*
	     * Complete the 'funnyString' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts STRING s as parameter.
	     */

	    public static boolean funnyString(String s) {

	    	String r = new StringBuilder(s).reverse().toString();
	    	
	    	for(int i = 0; i < s.length(); i++) {
	    		if((Math.abs(s.charAt(i) - s.charAt(i-1)) != Math.abs(r.charAt(i) - r.charAt(i-1)))) {
	    			return false;
	    		}
	    	}
	    	return true;

	    }

	}

}
