import java.util.Random;

public class RandomizedQuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        RandomizedQuickSort sorter = new RandomizedQuickSort();
        sorter.quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Main QuickSort function
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Randomly partition the array and get the pivot index
            int pivotIndex = randomizedPartition(arr, low, high);
            
            // Recursively sort elements before and after the partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Function to randomly select a pivot and partition the array

    private int randomizedPartition(int[] arr, int low, int high) {
        // Select a random index between low and high
        int pivotIndex = new Random().nextInt(high - low + 1) + low;
        
        // Swap the pivot with the last element to use it in the partition function
        swap(arr, pivotIndex, high);
        
        // Call partition function and return the index where the pivot is placed
        return partition(arr, low, high);
    }

    // Standard Lomuto partition scheme function

    private int partition(int[] arr, int low, int high) {
        // Use the last element as the pivot after swapping it
        int pivot = arr[high];
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j); // Swap elements to maintain the smaller section
            }
        }
        // Swap the pivot element with the element at i + 1
        swap(arr, i + 1, high);
        return i + 1; // Return the pivot index
    }

    // Utility function to swap two elements in the array

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}