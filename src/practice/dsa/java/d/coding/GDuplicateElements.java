package practice.dsa.java.d.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,2,3,1,4,5,2,4,9,5};
		
		Set<Integer> s = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		//Print duplicates
		for(int i=0; i<a.length; i++) {
			if(!s.add(a[i])) {
				duplicates.add(a[i]);
			}
		}
		//remove duplicates
		System.out.println(duplicates);
		System.out.println(s);
		
		findDuplicateUsingPlanJava(a);
		
	}
	
	public static void findDuplicateUsingPlanJava(int[] a) {
		int[] duplicateArray = new int[a.length];
		int k = 0;
		for(int i=0; i<a.length; i++) {
			boolean isDuplicate = false;
			for(int j=0; j<i; j++) {
				if(a[i]==a[j]) {
					isDuplicate = true;
					break;
				}
			}
			
	        // If it's a duplicate, check if we already added it to result
	        if (isDuplicate) {
	            boolean alreadyInResult = false;
	            for (int m = 0; m < k; m++) {
	                if (duplicateArray[m] == a[i]) {
	                    alreadyInResult = true;
	                    break;
	                }
	            }
	            if (!alreadyInResult) {
	                duplicateArray[k++] = a[i];
	            }
	        }
		}
		duplicateArray = Arrays.copyOf(duplicateArray, k);
		System.out.println(Arrays.toString(duplicateArray));
	}

}
