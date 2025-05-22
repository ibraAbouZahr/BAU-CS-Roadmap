
public class BestTimeToBuyAndSell {

	public static void main(String[] args) {
		
		
		

	}
	
	class Solution {
	    public int maxProfit(int[] prices) {
	    	
	    	int min = Integer.MAX_VALUE;
	    	int maxProfit = 0;
	    	int minIndex = 0;
	    	int maxIndex = 0;
	    	
	    	for(int i = 0 ; i < prices.length; i++) {
	    		if(min > prices[i]) {
	    			min = prices[i];
	    			
	    		}
	    		int potential = prices[i] - min;
	    		
	    		if(potential > maxProfit ) {
	    			maxProfit = potential;
	    		}
	    		
	    	}
	    	return maxProfit;
	    	
	  
	  
	        
	    }
	}

}
