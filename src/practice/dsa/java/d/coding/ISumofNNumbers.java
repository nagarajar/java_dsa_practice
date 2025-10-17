package practice.dsa.java.d.coding;

public class ISumofNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i =0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum = "+sum);
		int n = a.length;
		//formula for sum of n numbers
		System.out.println("Sum = n*(n+1)/2 = "+((n*(n+1))/2));

	}

}
