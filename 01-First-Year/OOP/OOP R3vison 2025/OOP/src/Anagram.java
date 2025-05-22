import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Solution {
		 public boolean isAnagram(String s, String t) {
	    
	    HashMap <Character, Integer> s1 = new HashMap<Character, Integer>();	
	    HashMap <Character, Integer> s2 = new HashMap<Character, Integer>();	
	    
	    for(int i = 0 ; i < s.length(); i++) {
	    	char currentChar = s.charAt(i);
	    	
	    	if(s1.containsKey(currentChar)) {
	    		s1.put(currentChar, s1.get(currentChar) + 1);
	    	}
	    	else {
	    		s1.put(currentChar, 1);
	    	}
	    }
	    
	    for(int i = 0 ; i < t.length(); i++) {
	    	char currentChar = t.charAt(i);
	    	
	    	if(s2.containsKey(currentChar)) {
	    		s2.put(currentChar, s2.get(currentChar) + 1);
	    	}
	    	else {
	    		s2.put(currentChar, 1);
	    	}
	    }
	    
	   return s1.equals(s2);
	    }
	  
	        
	    }
	}


