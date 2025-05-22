
public class ZeroOneTrial {

	public static void main(String[] args) {
		
        int W = 50;

        int profit[] = new int {60, 100, 120 };
        int weight[] = new int {10, 20, 30 };

        int n = profit.length;

        System.out.println(algo(W,weight,profit,n));
	}

    public static int algo(int W, int w[], int val[], int n) {

        if(w == 0 || n == 0) {
            return 0;
            //base case
        }

        if(W < w[n-1]) {
            return algo(W, w, val, n -1);

            // if nth item is greater than knapsack size

        }
        else {
            return Math.max(algo(W, w, val , n-1), val[n-1] + algo(W,w,val,n-1));
        }
    }

}
