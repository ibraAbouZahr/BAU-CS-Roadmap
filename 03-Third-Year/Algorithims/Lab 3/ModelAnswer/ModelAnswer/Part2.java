public class Ex1
{
	public static void main(String[] args) {
	
        
        int n=10;
        int[]C= new int[n+1];
        for (int i=0;i<=n;i++)
             C[i] = n-i;
        System.out.print("Before sorting:");
        for (int i=0;i<=n;i++)
            System.out.print(C[i]+" ");
       long before=System.currentTimeMillis();
       MERGE_SORT(C,0,C.length-1);
       long after=System.currentTimeMillis();
       long t = after - before;
        System.out.print("\nAfter sorting:");
        for (int i=0;i<=n;i++)
            System.out.print(C[i]+" ");
        System.out.println("\nfor "+ n+ " elements using merge sort " +t);


	}
public static void MERGE(int[] A, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		
		for (int i = 0; i < n1; i++) {
			L[i] = A[p + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = A[q + 1 + j];
		}
		
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		
		for (int k = p; k <= r; k++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
		}
	}
	
	public static void MERGE_SORT(int[] A, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;  
			MERGE_SORT(A, p, q);
			MERGE_SORT(A, q+1, r);
			MERGE(A, p, q, r);
		}
	}

    
}
