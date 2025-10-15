package practice.dsa.java.b.tree;

public class BinarySearchTree {
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public Node root = null;

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

	// Find the height of the tree
	public int heightOfTree(Node root) {
		if (root == null) {
			return 0;
		} else {
			int lh = 0, rh = 0;
			lh = heightOfTree(root.left);
			rh = heightOfTree(root.right);

			if (lh > rh) {
				return lh + 1;
			} else {
				return rh + 1;
			}
		}
	}

	// Print level order traversal
	public void levelOrderTraversal(Node root) {
		if(root != null) {
			//Find the height of tree
			int h = heightOfTree(root);
			
			//Iterate h times to print all values in the each level
			for(int i=1; i<=h; i++) {
				levelOrder(root, i);
			}
		}
	}
	
	public void levelOrder(Node temp, int h) {
		//Check if temp is null so it will act as break for the recursive
		if(temp == null) {
			return;
		} 
		
		if(h == 1) {
			System.out.print(temp.data+" ");
		} else {
			//We need to go left and right to print the values in that level
			levelOrder(temp.left, h-1);
			levelOrder(temp.right, h-1);
		}
	}

	public void mirrorImageOfTree(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		} else {
			mirrorImageOfTree(root.left);
			mirrorImageOfTree(root.right);
			swap(root);
		}
		
	}

	private void swap(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		} else {
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
	}
			

}
