import java.util.Scanner;

	public class Matrix {
		Scanner sc=new Scanner(System.in);
		 public int r,c;  
		 public int mat1[][];
	      public int mat2[][];
	      public int mat3[][];
		 public int[][] create()
		 {   
	   	System.out.println("Enter the no. of rows");
	   	r=sc.nextInt();
	    mat1=new int[r][];
	   	System.out.println("enter column for each row");
	   		for(int i=0;i<mat1.length;i++)
	   		{
	   			System.out.println("enter clo for"+(i+1)+"row");
	   				 c=sc.nextInt();
	   			mat1[i]=new int [c];
	   		}
	   		System.out.println("enter elements in matrix2");
	   	   	for(int k=0;k<mat1.length;k++)
	   	   	{
	   	   	  for(int m=0;m<mat1[k].length;m++)
	   	   	  {
	   	   		mat1[k][m]=sc.nextInt();
	   		  }		
	        
	   	   	}
	   		return mat1;
	  	}
	     
	       public int[][] display()
	       {
	    	 System.out.println("elements are");
	   		 for(int i=0;i<mat1.length;i++)
	   		 {
	   			for(int j=0;j<mat1[i].length;j++)
	   			{
	   				System.out.print("\t"+mat1[i][j]);
	   			}
	   			
	   			System.out.println();
	   		 }
	   		return mat1;
	       }
	       public  int[][] addition(int mat1[][],int mat2[][])
	       {
	    	   
	    	   int mat3[][]=new int[mat1.length][];
	    	   for(int i=0;i<mat3.length;i++){
	    		   mat3[i]=new int[mat1[i].length];
	    		   for(int k=0;k<mat1.length;k++)
	        	   {
	        		   for(int j=0;j<mat1[k].length;j++){
	        			mat3[i][j]=mat1[i][j]+mat2[i][j];
	        		   }
	        	   } 
	    	   }
	    	   
	    	   
	    	   return mat3;
	       }
	       
	      /* public int[][] multiplication()
	       {
	    	   for(int i=0;i<mat1.length;i++)
	    	   {
	    		   for(int j=0;j<mat1[i].length;j++)
	    		   {
	    			   for(int k=0;k<mat1.length;k++)
	    			   {
	    				 mat3[i][k]=mat3[i][k]+mat1[i][j]*mat2[j][k];  
	    			   }
	    		   }
	    	   }
	    	   return mat3;
	       }
	       
	       public int[][] transpose()
	       {
	    	   for(int i=0;i<mat1.length;i++)
	    	   {
	    		   for(int j=0;j<mat1[i].length;j++)
	    		   {
	    			mat1[i][j]=mat1[j][i];
	    		   }
	    	   }
	    	return mat1;   
	       }*/
	  }


