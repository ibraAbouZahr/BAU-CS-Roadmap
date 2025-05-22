
public class sorting {

    public static void main(String[] args) {
      // int A[]={13,4,27,11,17};
        int n1=100000;
        int[]A= new int[n1+1];
        for (int i=0;i<=n1;i++)
             A[i] = n1-i;
    
      long before1=System.currentTimeMillis();
       bubblesort(A);
      long after1=System.currentTimeMillis();
      long t1 = after1 - before1;
           System.out.println("for "+ n1+ " elements using bubble sort " +t1);

  
               int n4=100000;
        int[]D= new int[n4+1];
        for (int i=0;i<=n4;i++)
             D[i] = n4-i;
      long before4=System.currentTimeMillis();
        SelectionSort(D);
       long after4=System.currentTimeMillis();
       long t4 = after4 - before4;
       System.out.println("for "+ n4+ " elements using Selection sort " +t4);
     }
public static void bubblesort(int[]A)
   {
int tmp;
for (int i=0;i<A.length-1;i++)
       {
for(int j=A.length-1;j>=i+1;j--)
if(A[j]<A[j-1])
   {
tmp=A[j];
A[j]=A[j-1];
A[j-1]=tmp;
               }
       }
   }
  
	public static void SelectionSort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
	
}
