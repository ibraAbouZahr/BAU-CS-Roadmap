import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean Anagram(String n, String m) {
		
	      Set<Character> set1 = new HashSet<>();
	      Set<Character> set2 = new HashSet<>();
		
		if(n.length() != m.length()) {
			return false;
		}
		
		char[] arr1 = n.toCharArray();
		char[] arr2 = n.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i = 0; i < n.length(); i++) {
			set1.add(n.charAt(i));
		}
		
		for(int i = 0; i < m.length(); i++) {
			set2.add(m.charAt(i));
		}
		return Arrays.equals(arr1, arr2);
		
		  
		  
		
		

		
		
	}

}
