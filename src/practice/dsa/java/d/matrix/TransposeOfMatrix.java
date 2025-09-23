package practice.dsa.java.d.matrix;

public class TransposeOfMatrix {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1. Create the matrix
		int[][] a = {{1,2,3},{4,5,6}};
		//Row
		int row1 = a.length; // it will give the row
		//Column
		int col1 = a[0].length; // it will give the col
		
		System.out.println("a = "+ row1 +" * "+col1);
		
		//2. find the Transpose of matrix
		// Condition for row will convert into col and col will convert into row
		// result will be c = {{6,8},{10,12}}
		int[][] c = new int[col1][row1];
		
		for(int i =0; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				c[j][i] = a[i][j];
			}
		}
		
		for(int i =0; i<col1; i++) {
			for(int j=0; j<row1; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
