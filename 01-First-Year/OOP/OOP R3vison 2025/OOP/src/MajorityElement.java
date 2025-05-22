import java.util.HashMap;
import java.util.HashSet;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Solution {
	    public int majorityElement(int[] nums) {

	    	HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
	    	
	    	// Count frequencies

	        for(int i = 0; i < nums.length; i++) {
	        	freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
	            
	        }
	        
	        for(HashMap.Entry<Integer,Integer> entry : freq.entrySet()) {
	        	if(entry.getValue() > nums.length/2) {
	        		return entry.getKey();
	        	}
	        }
	        return -1;
	    }
	}

}
