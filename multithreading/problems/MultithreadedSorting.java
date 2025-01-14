import java.util.Arrays;

// Thread class to sort a portion of the array
class SortThread extends Thread {
    private int[] array; // Array that this thread will sort

    // Constructor to initialize the array
    public SortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        // Sort the array using Arrays.sort()
        Arrays.sort(array);
    }

    // Method to get the sorted array after the thread finishes
    public int[] getSortedArray() {
        return array;
    }
}

public class MultithreadedSorting {
    public static void main(String[] args) {
        // Array to be sorted
        int[] array = {12, 3, 5, 2, 8, 1, 15, 10, 7, 6, 9, 11, 4, 14, 13};
        System.out.println("Original Array: " + Arrays.toString(array));

        // Split the array into two halves
        int mid = array.length / 2; // Calculate the midpoint
        int[] left = Arrays.copyOfRange(array, 0, mid); // First half
        int[] right = Arrays.copyOfRange(array, mid, array.length); // Second half

        // Create threads to sort each half
        SortThread leftSorter = new SortThread(left); // Thread to sort the left half
        SortThread rightSorter = new SortThread(right); // Thread to sort the right half

        // Start the threads to begin sorting concurrently
        leftSorter.start();
        rightSorter.start();

        try {
            // Wait for both threads to finish their execution
            leftSorter.join(); // Wait for leftSorter to finish
            rightSorter.join(); // Wait for rightSorter to finish
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle thread interruption
        }

        // Merge the two sorted halves into a single sorted array
        int[] sortedArray = merge(leftSorter.getSortedArray(), rightSorter.getSortedArray());
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    // Method to merge two sorted arrays into one sorted array
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length]; // Final merged array
        int i = 0, j = 0, k = 0; // Index pointers for left, right, and result arrays

        // Merge elements while both arrays have remaining elements
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) { // If current element in left is smaller
                result[k++] = left[i++]; // Add it to the result and move left pointer
            } else { // If current element in right is smaller or equal
                result[k++] = right[j++]; // Add it to the result and move right pointer
            }
        }

        // Copy remaining elements from the left array, if any
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy remaining elements from the right array, if any
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result; // Return the merged array
    }
}

