package practice.dsa.java.d.coding;

public class DBinarySearch {

	static int iterations = 0;
	static int iterationsRecursion = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Binary Search Condition: Array should be ASC Order
		int[] a = { 1, 3, 4, 6, 8, 9, 10, 12, 15 };
		int find = 7;
		binarySearch(a, 0, a.length - 1, find);
		System.out.println("iterations = " + iterations);
		binarySearchRecursion(a, 0, a.length - 1, find);
		System.out.println("iterationsRecursion = " + iterationsRecursion);

	}

	private static void binarySearchRecursion(int[] a, int l, int h, int find) {
		// TODO Auto-generated method stub
		if (l <= h) {
			iterationsRecursion++;
			int m = (l + h) / 2; // Which cause the overflow issue in the binary search 
								 // l = 1000, h = 2147483647 ; (Integer.MAX_VALUE) this kind of situation will get the overflow issue.
								// To avoid this issue will use the formal -> m = (l+ (h-l))/2
			if (a[m] == find) {
				System.out.println("Element found at index = " + m);
				return;
			}
			if (a[m] < find) {
				l = m + 1;
			} else {
				h = m - 1;
			}
			binarySearchRecursion(a, l, h, find);

		} else {
			System.out.println("Element not found");
		}

	}

	private static void binarySearch(int[] a, int l, int h, int find) {
		// TODO Auto-generated method stub
		while (l <= h) {
			iterations++;
			int m = (l + h) / 2;
			if (a[m] == find) {
				System.out.println("Element found at index = " + m);
				return;
			}
			if (a[m] < find) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		System.out.println("Element not found");

	}

}
