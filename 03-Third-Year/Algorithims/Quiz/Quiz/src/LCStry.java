
public class LCStry {

	public static void main(String[] args) {
		
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		int m = s1.length();
		int n = s2.length();

		System.out.println(lcs(s1, s2, m, n));

	}

	public static int lcs(String a, String b, int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}

		if (a.charAt(m - 1) == b.charAt(n - 1)) {
			return 1 + lcs(a, b, m - 1, n - 1);
		}
		
		else {
			return Math.max(lcs(a,b,m-1,n), lcs(a,b,m,n-1));
		}
	}

}
