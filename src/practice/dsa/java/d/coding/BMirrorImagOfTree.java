package practice.dsa.java.d.coding;

import practice.dsa.java.b.tree.BinarySearchTree;

public class BMirrorImagOfTree {
	public static void main(String[] args) {
		//Create the BST and insert this data
		/*
			    10
			   /  \
			  5    15
			 / \   / \
			3   6 12 18
		 */
		BinarySearchTree bst =  new BinarySearchTree();
		bst.add(10);
		bst.add(5);
		bst.add(15);
		bst.add(3);
		bst.add(6);
		bst.add(12);
		bst.add(18);
		
		System.out.println("Before Making Tree mirror image");
		bst.preOrderTraversal(bst.root);
		
		bst.mirrorImageOfTree(bst.root);
		System.out.println();
		System.out.println("After Making Tree mirror image");
		bst.preOrderTraversal(bst.root);
		
	}
}
