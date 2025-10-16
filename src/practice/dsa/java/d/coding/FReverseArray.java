package practice.dsa.java.d.coding;

import java.util.Arrays;

public class FReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,5,3,7,8,9};
//		System.out.println(Arrays.toString(a));
		reverseArray(a);
		reverseArrayWithoutExtraArray(a);
//		System.out.println(Arrays.toString(a));
		int[] a1 = {1,5,3,7,8,9};
		reverseArrayWithoutExtraArrayUsingRecursion(a1, a1.length-1, 0);
		System.out.println(Arrays.toString(a1));

	}

	private static void reverseArray(int[] a) {
		// TODO Auto-generated method stub
		int[] res = new int[a.length];
		int k =0;
		for(int i= a.length-1; i>=0; i--) {
			res[k]=a[i];
			k++;
		}
		System.out.println(Arrays.toString(res));
	}
	
	private static void reverseArrayWithoutExtraArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i= a.length-1, j=0; i>j; i--, j++) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
	private static void reverseArrayWithoutExtraArrayUsingRecursion(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if(i>j) {
//			System.out.println(i +" "+j);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
//			System.out.println(Arrays.toString(a));
			reverseArrayWithoutExtraArrayUsingRecursion(a, --i, ++j);
		} 
		
	}

}
