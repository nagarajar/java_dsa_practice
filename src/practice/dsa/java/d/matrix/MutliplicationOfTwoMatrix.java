package practice.dsa.java.d.matrix;

public class MutliplicationOfTwoMatrix {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1. Create the matrix
		int[][] a = {{1,2},{3,4}};
		int[][] b = {{5,6},{7,8}};
		
		//Row
		int row1 = a.length; // it will give the row
		//Column
		int col1 = a[0].length; // it will give the col
		
		//Row
		int row2 = b.length; // it will give the row
		//Column
		int col2 = b[0].length; // it will give the col
		System.out.println("a = "+ row1 +" * "+col1);
		System.out.println("b = "+ row2 +" * "+col2);
		
		if(col1!=row2)
			throw new Exception("Matrix size is not matching so we cant do the subtraction of matrix");
		
		//2. find the multiplication of these matrix
		// Condition for multiplication is both matrix row and column size should match col1 == row2
		// result will be c = {{6,8},{10,12}}
		int[][] c = new int[row1][col2];
		
		for(int i =0; i<row1; i++) {
			for(int j=0; j<col2; j++) {
				int sum = 0;
				for(int k=0; k<col1; k++) {
				sum += a[i][k]*b[k][j];
				}
				c[i][j] = sum;
			}
		}
		
		for(int i =0; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
