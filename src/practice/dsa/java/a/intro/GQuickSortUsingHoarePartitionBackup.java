package practice.dsa.java.a.intro;

import java.util.Arrays;

public class GQuickSortUsingHoarePartitionBackup {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 25, 13, 9, 3, 4, 10 };
//		int[] a = { 10, 6, 9, 15, 18, 4, 3, 21 };
		System.out.println("Before quick sort: " + Arrays.toString(a));
		quickSort(a, 0, a.length - 1);
		System.out.println("After quick sort: " + Arrays.toString(a));

	}

	private static void quickSort(int[] a, int l, int h) {
		// TODO Auto-generated method stub
		if (l < h) {
			int pi = partitioning(a, l, h);
			quickSort(a, l, pi);
			quickSort(a, pi + 1, h);
		}
	}

//	private static int partitioning0(int[] a, int l, int h) {
//		// TODO Auto-generated method stub
//		int PIVOT = a[l];
//		int i = l;
//		int j = h;
//
//		while (i < j) {
//			
//			while (a[i] <  PIVOT) {
//				i++;
//			}
//
//			while (a[j] > PIVOT) {
//				j--;
//			}
//
//			if (i < j) {
//				int temp = a[i];
//				a[i] = a[j];
//				a[j] = temp;
//			}
//		}
//
//		a[l] = a[j];
//		a[j] = PIVOT;
//		System.out.println("Count: " + count++ + " - After partitioning: " + Arrays.toString(a));
//		return j;
//	}
	
	private static int partitioning1(int[] a, int l, int h) {
        int PIVOT = a[l];              // Select first element as pivot
        int i = l - 1;                 // Start i before the array
        int j = h + 1;                 // Start j after the array
        
        while (true) {
            // Find element on left side greater than or equal to pivot
            do {
                i++;
            } while (a[i] < PIVOT);
            
            // Find element on right side less than or equal to pivot
            do {
                j--;
            } while (a[j] > PIVOT);
            
            // If pointers crossed, return the correct partition point
            if (i >= j) {
                System.out.println("Count: " + count++ + " - After partitioning: " + Arrays.toString(a));
                return j;
            }
            
            // Swap elements that are in the wrong partition
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
	
	private static int partitioning(int[] a, int l, int h) {
	    int PIVOT = a[l];
	    int i = l;
	    int j = h;

	    while (i < j) {
	        do {
	            i++;
	        } while (i <= h && a[i] < PIVOT); // check i <= h!

	        while (a[j] > PIVOT) {
	            j--;
	        }

	        if (i < j) {
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	    }

	    a[l] = a[j];
	    a[j] = PIVOT;
	    System.out.println("Count: " + count++ + " - After partitioning: " + Arrays.toString(a));
	    return j;
	}

}
