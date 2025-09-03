package practice.dsa.java.a.intro;

import java.util.Arrays;

public class GQuickSortUsingHoarePartition {
    static int count = 0;

    public static void main(String[] args) {
        // Example input array to sort using Quick Sort (Hoare Partition)
        int[] a = { 1, 2, 25, 13, 9, 3, 4, 10 };
        // int[] a = { 10, 6, 9, 15, 18, 4, 3, 21 }; // You can test with this array as well

        System.out.println("Before quick sort: " + Arrays.toString(a));
        quickSort(a, 0, a.length - 1); // Sort the entire array
        System.out.println("After quick sort: " + Arrays.toString(a));
    }

    /**
     * Recursively sorts the subarrays using Hoare's partition scheme.
     * @param a The array to sort.
     * @param l The left (start) index of the subarray.
     * @param h The right (end) index of the subarray.
     */
    private static void quickSort(int[] a, int l, int h) {
        // Base case: if the subarray has 1 or no element, it is already sorted
        if (l < h) {
            // Partition the array and get the partition index
            // All elements <= pivot will be on the left of pi, all >= pivot on the right
            int pi = partitioning(a, l, h);

            // Recursively sort the left partition (from l to pi)
            quickSort(a, l, pi);

            // Recursively sort the right partition (from pi+1 to h)
            quickSort(a, pi + 1, h);
        }
    }

    /**
     * Hoare's partitioning scheme (alternative version).
     * - Selects the first element as pivot.
     * - Uses two pointers (i, j) to scan the array from both ends.
     * - Swaps elements to ensure all elements < pivot are left and > pivot are right.
     * - Returns the final position of the pivot (where pointers cross).
     * @param a The array to partition.
     * @param l The left index of the subarray.
     * @param h The right index of the subarray.
     * @return The partition index.
     */
    private static int partitioning(int[] a, int l, int h) {
        int PIVOT = a[l]; // Select the first element as the pivot
        int i = l;        // i starts from the beginning of the subarray
        int j = h;        // j starts from the end of the subarray

        // Loop until the pointers meet
        while (i < j) {
            // Move i to the right as long as elements are less than pivot
            do {
                i++;
            } while (i <= h && a[i] < PIVOT); // Important: check array bounds!

            // Move j to the left as long as elements are greater than pivot
            while (a[j] > PIVOT) {
                j--;
            }

            // If pointers have not crossed, swap out-of-place elements
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // Place pivot in its correct sorted position (swap with j)
        a[l] = a[j];
        a[j] = PIVOT;

        // Print array status after each partition for debugging/visualization
        System.out.println("Count: " + count++ + " - After partitioning: " + Arrays.toString(a));
        return j; // Return the pivot's final position
    }

    /**
     * Hoare's original partitioning scheme (safer version).
     * - i starts before the subarray, j after.
     * - Scans inwards and swaps elements that are on the wrong side.
     * - No risk of going out of bounds in the inner loops.
     * @param a The array to partition.
     * @param l The left index of the subarray.
     * @param h The right index of the subarray.
     * @return The partition index.
     */
    private static int partitioning1(int[] a, int l, int h) {
        int PIVOT = a[l];      // Choose the first element as pivot
        int i = l - 1;         // i starts just before the subarray
        int j = h + 1;         // j starts just after the subarray

        while (true) {
            // Move 'i' to the right, stopping when a[i] >= pivot or at end
            do {
                i++;
            } while (a[i] < PIVOT);

            // Move 'j' to the left, stopping when a[j] <= pivot or at start
            do {
                j--;
            } while (a[j] > PIVOT);

            // If pointers have crossed, partitioning is done
            if (i >= j) {
                // Print state for visualization
                System.out.println("Count: " + count++ + " - After partitioning: " + Arrays.toString(a));
                return j; // Return the partition index
            }

            // Swap elements at i and j
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    /*
     * (partitioning0 is commented out. You can compare different styles.)
     */

	/*
	 * Quick Sort (Lomuto Partition) Complexity:
	 * 
	 * Time Complexity:
	 * - Average and Best Case: O(n log n)
	 * - Worst Case: O(n^2) (if the smallest/largest element is always chosen as pivot)
	 * 
	 * Space Complexity:
	 * - O(log n) auxiliary space for recursion (call stack), as recursion depth is log n for balanced partitions.
	 * - Sorting is in-place, so no extra space is used for another array.
	 */
}