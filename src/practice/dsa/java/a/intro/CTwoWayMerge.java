package practice.dsa.java.a.intro;

import java.util.Arrays;

public class CTwoWayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conditions for two way merge
		// 1. Input: Both arrays must already be sorted
		int[] a = {3,5,7,8};
		int[] b = {2,4,6,9,13,14};
		
		// 2. Prepare lengths and result array
		int m = a.length, n=b.length;
		int[] c = new int[m+n];
		
		// 3. Merge arrays a[] and b[] into c[]
		int i=0, j=0, k=0;
		// Compare elements from both arrays and add the smaller one
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				c[k]=a[i];
				i++;
			} else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		
		// 4. Copy any remaining elements from a[]
		while(i<m) {
			c[k]=a[i];
			i++;
			k++;
		}
		
		// Copy any remaining elements from b[]
		while(j<n) {
			c[k]=b[j];
			j++;
			k++;
		}
		
        // Print the original and merged arrays
        System.out.println("a[] = " + Arrays.toString(a));
        System.out.println("b[] = " + Arrays.toString(b));
        System.out.println("Merged c[] = " + Arrays.toString(c));
        
        /*
         * Time Complexity: O(m + n)
         *   - Every element from both arrays is processed once.
         *
         * Space Complexity: O(m + n)
         *   - A new array of size m + n is used for merging (auxiliary space).
         */
		
	}

}
