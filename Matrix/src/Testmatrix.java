
	import java.util.Scanner;
	public class Testmatrix {

		public static void main(String[] args) {
			Matrix m=new Matrix();
			int mat1[][]=m.create();
			mat1 =m.display();
			int mat2[][]=m.create();
			mat2 =m.display();
			int mat3[][];
			mat3=m.addition(mat1,mat2);
			mat3=m.display();
			/*mat3=m.multiplication();
			mat3=m.display();
			mat1=m.transpose();*/
		}
	}


