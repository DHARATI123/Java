import java.util.Scanner;
public class Testmatrix {

	public static void main(String[] args) {
			
		
			
		// TODO Auto-generated method stub
		Matrixx m=new Matrixx();
		int mat1[][]=m.create();
		int mat2[][]=m.create();
		int mat3[][];
		Scanner sc=new Scanner(System.in);
		boolean b=m.validate(mat1, mat2);
		if(b)
		{
			System.out.println("Valid.....");
			mat1=m.acceptData();
			mat2=m.acceptData();
			
			mat3=m.addition();
			display(mat1);
			display(mat2);
			display(mat3);
			
		}
		else{
			System.out.println("Add not possible");
			
		}
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				
			}
		}

	}

	private static void display(int[][] mat1) {
		// TODO Auto-generated method stub
		
	}

}
