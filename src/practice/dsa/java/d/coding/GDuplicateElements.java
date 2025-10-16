package practice.dsa.java.d.coding;

import java.util.HashSet;
import java.util.Set;

public class GDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,1,4,5,2,4,9,5};
		
		Set<Integer> s = new HashSet<>();
		
		//Print duplicates
		for(int i=0; i<a.length; i++) {
			if(!s.add(a[i])) {
				System.out.println("Duplicate elemenent = "+a[i]);
			}
		}
		//remove duplicates
		System.out.println(s);
		
		

	}

}
