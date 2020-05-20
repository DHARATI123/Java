import java.util.Scanner;
public class Testmatrix2 {
  public static void main(String[] args){
	  boolean b=true;
	  int matrix1[][],matrix2[][];
	  int matrix3[][];
	  Scanner sc=new Scanner(System.in);
	  int c1=0;
	  
	  System.out.println("enter the no of rows");
	  int r1=sc.nextInt();
	  
	  matrix1=new int[r1][];
	  System.out.println("enter column for each row");
	  for(int i=0;i<matrix1.length;i++){
		  System.out.println("enter the col for"+(i+1)+"row");
		  c1=sc.nextInt();
		  matrix1[i]=new int[c1];
	  }
	  
	  int c2=0;
	  System.out.println("enter the no of rows for 2");
	  int r2=sc.nextInt();
	  matrix2=new int[r2][];
	  System.out.println("enter column for each row");
	  for (int i=0;i<matrix2.length;i++){
		  System.out.println("enter lo for"+(i+1)+"row");
		  c2=sc.nextInt();
		  matrix2[i]=new int[c2];
		  
	  }
	  
	  
	  System.out.println("enter the elements in matrix1");
	  for(int i=0;i<matrix1.length;i++){
		  for(int j=0;j<matrix1[i].length;j++){
			  matrix1[i][j]=sc.nextInt();
		  }
		  System.out.println();
	  }
	  System.out.println("enter elements in matrix2");
	  for(int i=0;i<matrix2.length;i++)
	  {
		  for(int j=0;j<matrix2.length;j++){
			  matrix2[i][j]=sc.nextInt();
		  }
	  }
	  System.out.println("elements are");
	  for(int i=0;i<matrix2.length;i++){
		  for(int j=0;j<matrix2.length;j++){
			  System.out.println("\t"+matrix2[i][j]);
		  }
		  System.out.println("");
		  
		  }
	  System.out.println("==========");
	  if(matrix1.length==matrix2.length){
		  System.out.println("rows are same");
		  for(int i=0;i<matrix1.length;i++){
			  if(matrix1[i].length!=matrix2[i].length){
				  b=false;
				  break;
			  }
			  }
		  }
	  if(b){
		  System.out.println("valid");
		  System.out.println("addition");{
			  
		  }
	  }
	  else{
		  System.out.println("invalid");
	  
	  }
	  }
}
