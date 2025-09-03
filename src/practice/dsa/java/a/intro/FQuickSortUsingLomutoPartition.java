package practice.dsa.java.a.intro;

import java.util.Arrays;

public class FQuickSortUsingLomutoPartition {
    static int count = 0;

    public static void main(String[] args) {
        // Example usage of Quick Sort with Lomuto partition scheme
        int[] a = {1, 2, 25, 13, 9, 3, 4, 10};
        System.out.println("Before quick sort: " + Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println("After quick sort: " + Arrays.toString(a));
    }

    /**
     * Recursively applies quick sort to the subarrays.
     * @param a The array to sort
     * @param l The starting index of the subarray
     * @param h The ending index of the subarray
     */
    private static void quickSort(int[] a, int l, int h) {
        // Base case: if the subarray has less than 2 elements, do nothing
        if (l < h) {
            // Partition the array and get the pivot position (after partition)
            int pi = partitioning(a, l, h);

            // Recursively sort the left subarray (elements less than pivot)
            quickSort(a, l, pi - 1);

            // Recursively sort the right subarray (elements greater than pivot)
            quickSort(a, pi + 1, h);
        }
    }

    /**
     * Lomuto partitioning:
     * - Chooses the last element as the pivot.
     * - Places all elements less than pivot to its left,
     *   and all greater elements to its right.
     * @param a The array to partition
     * @param l Starting index
     * @param h Ending index (pivot)
     * @return The final position/index of the pivot
     */
    private static int partitioning(int[] a, int l, int h) {
        // 1. Choose the last element as the pivot
        int PIVOT = a[h];

        // 2. 'i' tracks the position where next smaller element than pivot should go
        int i = l;

        // 3. Traverse from 'l' to 'h-1'
        //    If an element is less than pivot, swap it with element at index 'i' and increment 'i'
        for (int j = l; j < h; j++) {
            if (a[j] < PIVOT) {
                // Swap a[j] with a[i] so that all elements less than pivot are moved to the left
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }
        }

        // 4. After all elements are processed, swap the pivot with the element at index 'i'
        //    so that pivot is in its correct sorted position
        a[h] = a[i];
        a[i] = PIVOT;

        // Print the array after every partition step for visualization
        System.out.println("Count: " + count++ + " - After partitioning: " + Arrays.toString(a));

        // 5. Return the index of pivot (which is now at its correct position)
        return i;
    }
}

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