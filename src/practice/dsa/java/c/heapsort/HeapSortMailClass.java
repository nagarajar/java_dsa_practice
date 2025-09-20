package practice.dsa.java.c.heapsort;

public class HeapSortMailClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FBT - Full Binary Tree - At each level, all the nodes should be present.
		// How can we check FBT - using the No.of Nodes = 2^h - 1
		//CBT - Complete Binary Tree - If the height of the tree is h then till h-1 level it should be FBT and 
		//                             at h level node should start filling from extreme left 
		
		//Heap Sort - Criteria
		// 1. Heap - it should be Complete Binary Tree
		// 2. Convert given array to max heap
		// 3. Delete elements from the root
		
		// What is Max heap
		// Max heap is a heap in which parent is greater than the child
		
		// Check the given array is Max heap or not.
		// Conditions to check
		// 1. From the given array find out all the parents 
		// 2. Find out all children's for all those parents
		// 3. Check parent is greater than children's
		// 4. If not its not Max heap
		
		// 1.  From the given array find out all the parents 
		// Parents formula --> 0 to (n/2) - 1
		// Children's formula --> (n/2) to n-1
		
		// 2. Find out all children's for all those parents
		// If the Parent position/index is i then
		// Left Child --> 2*i + 1
		// Right Child --> 2*i + 2

	}

}
