package practice.dsa.java.b.tree;

public class BBinarySearchTreeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		/*
		 * Ways to print (traverse) a Binary Search Tree (BST):
		 *
		 * 1. Inorder Traversal:
		 *    - Visits left subtree, then root, then right subtree.
		 *    - Prints values in sorted (ascending) order.
		 *
		 * 2. Preorder Traversal:
		 *    - Visits root first, then left subtree, then right subtree.
		 *    - Useful for copying the tree or creating a prefix expression.
		 *
		 * 3. Postorder Traversal:
		 *    - Visits left subtree, then right subtree, then root.
		 *    - Useful for deleting the tree or creating a postfix expression.
		 *
		 * 4. Level Order Traversal (Breadth-First):
		 *    - Visits nodes level by level from top to bottom, left to right.
		 *    - Good for visually displaying the tree structure.
		 *
		 * Example in Everyday Language (like a family tree):
		 *    - Inorder:   Visit everyone in order of age (youngest to oldest).
		 *    - Preorder:  Start with the parent, then visit children.
		 *    - Postorder: Visit children first, then parent.
		 *    - Level Order: Visit everyone in each generation before moving to the next.
		 *
		 * Inorder is most common for showing BST values in order.
		 */
		
		//Print them
		System.out.println("In Order Traversal - 3, 5, 6, 10, 12, 15, 18");
		bst.inOrderTraversal(bst.root);
		System.out.println();
		System.out.println("Pre Order Traversal - 10, 5, 3, 6, 15, 12, 18");
		bst.preOrderTraversal(bst.root);
		System.out.println();
		System.out.println("Post Order Traversal - 3, 6, 5, 12, 18, 15, 10");
		bst.postOrderTraversal(bst.root);
		System.out.println();
		System.out.println("Height of the tree: "+bst.heightOfTree(bst.root));
		System.out.println("Level Order Traversal - 10, 5, 15, 3, 6, 12, 18");
		bst.levelOrderTraversal(bst.root);
		System.out.println();

	}

}
