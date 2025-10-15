package practice.dsa.java.d.coding;

import java.util.Scanner;
import java.util.Stack;

public class ABalancedParentheses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String input = sc.next();
		
		System.out.println(" is Balanced Parentheses ? "+ isBalanced(input));
	}

	private static boolean isBalanced(String input) {
		// TODO Auto-generated method stub
		char[] a = input.toCharArray();
		Stack<Character> s = new Stack<Character>();
		for(int i=0; i< a.length ; i++) {
			if(a[i]=='(' || a[i]=='{' || a[i]=='[') {
				s.push(a[i]);
			} else {
				if(s.isEmpty() ||
				   (a[i]==')' && s.pop() != '(') ||
				   (a[i]==']' && s.pop() != '[') ||
				   (a[i]=='}' && s.pop() != '{') 	
				) {
					return false;
				}
					
			}
		}
		return s.isEmpty();
	}
}
