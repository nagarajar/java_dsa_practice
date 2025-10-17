package practice.dsa.java.d.coding;

public class JFindTheMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,9,10};
		int sum = 0;
		for(int i =0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum = "+sum);
		int n = a.length;
		int newLength = n+1;
		int newSum = (newLength*(newLength+1))/2;
		System.out.println("New sum = "+newSum);
		//formula for sum of n numbers
		System.out.println("Missing number = "+ (newSum-sum));
	}

}
