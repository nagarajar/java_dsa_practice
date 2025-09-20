package practice.dsa.java.c.insertionsort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {14, 6, 7, 0, 3, 11};
		System.out.println(Arrays.toString(a));
		insertionSort(a);
	}

	private static void insertionSort(int a[]) {
		// TODO Auto-generated method stub
		for(int i=1; i<a.length; i++) {
			int key = a[i];
			int j = i-1;
			
			while(j>=0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
			System.out.println(Arrays.toString(a));
		}
	}

}
