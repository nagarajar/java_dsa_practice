package practice.dsa.java.a.intro;

import java.util.Arrays;

public class BBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 91, 21, 31, 10, 82, 5 };
		int[] a1 = { 5, 21, 31, 50, 82, 91 }; //In case if the array is already swapped we don't have compare all elements

		bubbleSort(a);
		System.out.println("***********************************");
		bubbleSortOptimised(a1);
	}

	private static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		for(int i=0; i< n-1; i++) {	// We don't have to travel till the n, we go worst case till n-1
			for(int j=0; j<n-i-1; j++) { // Each iteration the last element will sort so no need compare again the sorted elements
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println("i value "+i);//debug
		}
		System.out.println(Arrays.toString(a));
	}
	
	private static void bubbleSortOptimised(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		for(int i=0; i< n-1; i++) {
			boolean swapped = false;
			for(int j=0; j<n-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
					swapped = true;
				}
			}
			if(!swapped) { // If no elements are swapped means its already sorted to break the loop
				System.out.println("i value "+i);//debug
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	//Time Complexity = Worst case --> O(n^2) and best case with Optimization = O(n)
	//Space Complexity (Auxiliary space/memory) = O(1)

}
