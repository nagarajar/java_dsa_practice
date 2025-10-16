package practice.dsa.java.d.coding;

public class EMinAndMaxElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,1,2,0,57,10,87,20};
		
		int min = a[0];
		int max = a[0];
		
		for(int i=0; i< a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);
		

	}

}
