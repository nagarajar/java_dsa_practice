package practice.dsa.java.b.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root = null;

	public void add(int data) {
		Node n = new Node(data);

		if (root == null) {
			root = n;
		} else {
			Node temp = root;

			while (true) {
				if (data < temp.data) {
					if (temp.left == null) {
						temp.left = n;
						return;
					} else {
						temp = temp.left;
					}
				} else {
					if (temp.data == data) {
						return;
					}

					if (temp.right == null) {
						temp.right = n;
						return;
					} else {
						temp = temp.right;
					}
				}
			}
		}
	}

	// Ascending Order
	public void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
	}

	// First root then its left and right
	public void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	// First left then right then its root
	public void postOrderTraversal(Node root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data + " ");
		}
	}

}
