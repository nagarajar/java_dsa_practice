package practice.dsa.java.a.intro;

import java.util.Arrays;

/*
 * Merge Sort:
 * - A classic divide-and-conquer sorting algorithm.
 * - Time Complexity: O(n log n)
 * - Space Complexity: O(n) (due to auxiliary arrays used during merging)
 * - Algorithm is stable and not in-place (uses extra space for merging).
 */

public class DMergeSort {

    public static void main(String[] args) {
        int[] a = {8,1,3,9,6,7,5,12,4,18,2};
        System.out.println("Before merge sort: " + Arrays.toString(a));
        
        mergeSort(a, 0, a.length - 1);
        
        System.out.println("After merge sort: " + Arrays.toString(a));
    }

    // Recursively divides the array and sorts halves
    private static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;          // Find the middle index
            mergeSort(a, l, mid);           // Sort left half
            mergeSort(a, mid + 1, r);       // Sort right half
            merge(a, l, mid, r);            // Merge sorted halves
        }
    }

    // Merges two sorted sub arrays into one sorted array
    private static void merge(int[] a, int l, int mid, int r) {
        // 1. Calculate sizes of two sub arrays.
        // n1 = mid - l + 1 is the size of the left sub array.
        //     - left sub array includes indices l to mid (both inclusive), so size is (mid - l + 1)
        // n2 = r - mid is the size of the right sub array.
        //     - right sub array includes indices (mid + 1) to r, so size is (r - mid)
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // 2. Create temporary arrays for left and right sub arrays
        int[] la = new int[n1];
        int[] ra = new int[n2];

        // 3. Copy data to temp arrays
        // a[l + i] copies elements from the original array starting at index l
        // to make the left sub array la[0 ... n1-1]
        for (int i = 0; i < n1; i++) {
            la[i] = a[l + i]; // la[0] = a[l], la[1] = a[l+1], ..., la[n1-1] = a[mid]
        }
        // a[mid + 1 + j] copies elements from the original array starting at index mid+1
        // to make the right sub array ra[0 ... n2-1]
        for (int j = 0; j < n2; j++) {
            ra[j] = a[mid + 1 + j]; // ra[0] = a[mid+1], ra[1] = a[mid+2], ..., ra[n2-1] = a[r]
        }

        // 4. Merge the temp arrays back into original array a[l...r]
        // i and j are indices for la[] and ra[] respectively.
        // k = l because we want to start merging back into the original array at index l,
        // which is the start of the current portion being merged.
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (la[i] < ra[j]) {
                a[k++] = la[i++];
            } else {
                a[k++] = ra[j++];
            }
        }

        // 5. Copy remaining elements, if any
        while (i < n1) {
            a[k++] = la[i++];
        }
        while (j < n2) {
            a[k++] = ra[j++];
        }
    }

    /*
     * --- Time Complexity Analysis ---
     * Merge Sort divides the array into halves recursively (log n levels, since the array is halved each time).
     * At each level of recursion, merging the sub-arrays takes O(n) time (since every element is processed once per level).
     * Therefore, total time complexity is O(n log n).
     *
     * --- Space Complexity Analysis ---
     * For each merge operation, temporary arrays are created to hold the left and right parts being merged.
     * The total extra memory used across all merges at any point is O(n), since each element is only copied once per merge level.
     * Thus, the auxiliary space complexity is O(n).
     * (Note: The input array itself is not counted as auxiliary space.)
     */
}