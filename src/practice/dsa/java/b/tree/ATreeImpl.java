package practice.dsa.java.b.tree;

public class ATreeImpl {
	
	static class Node {
		Object data;
		Node left;
		Node right;
		
		Node(Object data){
			this.data = data;
		}
	}

	Node root = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create this 
		/*
			    10
			   /  \
			  5    15
			 / \   / \
			3   6 12 18
		 */
		ATreeImpl t = new ATreeImpl();
		t.root = new Node(10);
		t.root.left = new Node(5);
		t.root.right = new Node(15);
		t.root.left.left = new Node(3);
		t.root.left.right = new Node(6);
		t.root.right.left = new Node(12);
		t.root.right.right = new Node(18);
		
		System.out.println(t);//package.class@HexaDecimalValue
		
		//If there is those object like it is very difficult to write like this,
		//To overcome this BST - Binary Search Tree came into picture where less than root will to left, higher than root will go to right.
		

	}

}
