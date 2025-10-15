package practice.dsa.java.d.matrix;

public class SubtractionOfTwoMatrix {

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
		
		if(row1!=row2 && col1!=col2)
			throw new Exception("Matrix size is not matching so we cant do the subtraction of matrix");
		
		//2. find the subtraction of these matrix
		// Condition for sum and sub is both matrix row and column size should match now a=2*2, b=2*2
		// result will be c = {{6,8},{10,12}}
		int[][] c = new int[row1][col1];
		
		for(int i =0; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				c[i][j] = a[i][j]-b[i][j];
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
