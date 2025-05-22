public class Zero {
    

    public static void main(String[] args) {


		

	}

    public static int algo (int W, int w[], int val[], int n ) {
        if(W == 0 || n == 0) {
            return 0;
        }

        if(W < w[n-1]) {
            return algo(W,w , val, n-1);
        }

        else {
            return Math.max(algo(W,w,val,n-1), val[n-1] + algo(W - w[n - 1],w,val,n- 1));
        }
    }

}
