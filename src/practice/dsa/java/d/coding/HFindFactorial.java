package practice.dsa.java.d.coding;

public class HFindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		
		findFactorial(n);
		System.out.println(findFactorialUsingRecursive(n));

	}

	private static void findFactorial(int n) {
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i=n; i>0;i--) {
			fact=fact*i;
		}
		System.out.println(n+"! = "+fact);
		
	}
	
	private static int findFactorialUsingRecursive(int n) {

		if(n<=1) {
			return 1;
		}
		return n * findFactorialUsingRecursive(n-1);
		
	}

}
