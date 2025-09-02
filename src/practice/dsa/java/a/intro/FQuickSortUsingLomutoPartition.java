package practice.dsa.java.a.intro;

import java.util.Arrays;

public class FQuickSortUsingLomutoPartition {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2,25,13,9,3,4,10};
		System.out.println("Before quick sort: "+Arrays.toString(a));
		quickSort(a, 0, a.length-1);
		System.out.println("After quick sort: "+Arrays.toString(a));
	}

	private static void quickSort(int[] a, int l, int h) {
		// TODO Auto-generated method stub
		if(l<h) {
			int pi = partitioning(a,l,h); 
//			System.out.println("******************** pi="+pi+"********************");
			
//			System.out.println("**************************************************");
			quickSort(a, 0, pi-1); //Left side of pivot
			quickSort(a, pi+1, h); //Right side of pivot
		}
		
	}

	private static int partitioning(int[] a, int l, int h) {
		// TODO Auto-generated method stub
		//1. take pivot element 
		int PIVOT = a[h];
		int i=l;
		
		for(int j=l; j<h; j++) {
			if(a[j]<PIVOT) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
			}
		}
		
		a[h] = a[i];
		a[i] = PIVOT;
		System.out.println("Count: "+count+++"- After partitioning: "+Arrays.toString(a));
		return i;
	}

}
