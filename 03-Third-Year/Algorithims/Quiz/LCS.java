public class LCS {
    
    public static void main(String[] args) {
		

	}

    public static int lcs(String a , String b, int n , int m) {

        if( m == 0 || n == 0) {
            return 0;
        }

        if(a.charAt(n-1) == b.charAt(m - 1)) {
            return 1 + lcs(a,b,n,m);
        }

        else {
            return Math.max(lcs(a,b,n-1,m), lcs(a,b,n,m-1));
        }

    }
}
