public class QuickSortLomuto {

    // Main QuickSort function
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = lomutoPartition(arr, low, high);

            // Recursively apply QuickSort to elements left of the pivot
            quickSort(arr, low, pivotIndex - 1);

            // Recursively apply QuickSort to elements right of the pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Lomuto partition function
    private int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1;       // Initialize pointer for smaller elements

        // Loop through the array to position elements around the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {  // If element is smaller than pivot
                i++;                // Move the boundary of smaller section
                swap(arr, i, j);    // Place the element on the left side
            }
        }

        // Place the pivot in its correct sorted position
        swap(arr, i + 1, high);

        // Return the index of the pivot
        return i + 1;
    }

    // Utility function to swap two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test QuickSort
    public static void main(String[] args) {
        QuickSortLomuto sorter = new QuickSortLomuto();
        
        int[] arr = {8, 7, 1, 3, 5, 6, 4};
        
        System.out.println("Original array:");
        printArray(arr);
        
        // Apply QuickSort on the entire array
        sorter.quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Utility function to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}