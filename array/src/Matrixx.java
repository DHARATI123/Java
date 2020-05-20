import java.util.Scanner;
public class Matrixx {
                   public int[][]create(){
                	   Scanner sc=new Scanner(System.in);
                	   System.out.println("how many no do you want for matrix:");
                	   int r1=sc.nextInt();
                	   int c=0;
                	   int mat1[][]=new int[r1][];
                	   System.out.println("enter the col for each row");
                	   for(int i=0;i<mat1.length;i++){
                		   System.out.println("enter the col for "+(i+1)+"row");
                		   c=sc.nextInt();
                		   mat1[i]=new int[c];
                		   
                	   }
                	   return mat1;
                   }
                	   
                		 
                	   
                	   public int[][]acceptData(){
                    	   Scanner sc=new Scanner(System.in);
                    	   System.out.println("how many no do you want for matrix:");
                    	   int r1=sc.nextInt();
                    	   int c=0;
                    	   int mat1[][]=new int[r1][];
                    	   System.out.println("enter the col for each row");
                    	   for(int i=0;i<mat1.length;i++){
                    		   System.out.println("enter the col for "+(i+1)+"row");
                    		   c=sc.nextInt();
                    		   mat1[i]=new int[c];
                    		   
                    	   }
                    	   return mat1;
                   }

                	   public int[][]display(){
                    	   Scanner sc=new Scanner(System.in);
                    	   System.out.println("how many no do you want for matrix:");
                    	   int r1=sc.nextInt();
                    	   int c=0;
                    	   int mat1[][]=new int[r1][];
                    	   System.out.println("enter the col for each row");
                    	   for(int i=0;i<mat1.length;i++){
                    		   System.out.println("enter the col for "+(i+1)+"row");
                    		   c=sc.nextInt();
                    		   mat1[i]=new int[c];
                    		   
                    	   }
                    	   return mat1;
                   }

                	   public int[][]addition(){
                    	   Scanner sc=new Scanner(System.in);
                    	   System.out.println("how many no do you want for matrix:");
                    	   int r1=sc.nextInt();
                    	   int c=0;
                    	   int mat1[][]=new int[r1][];
                    	   System.out.println("enter the col for each row");
                    	   for(int i=0;i<mat1.length;i++){
                    		   System.out.println("enter the col for "+(i+1)+"row");
                    		   c=sc.nextInt();
                    		   mat1[i]=new int[c];
                    		   
                    	   }
                    	   return mat1;
                   }
                   public boolean validate(int mat1[][],int mat2[][])
                   {
                	   boolean b=true;
                	   if(mat1.length==mat2.length)
                	   {
                		   for(int i=0;i<mat1.length;i++)
                		   {
                			   if(mat1[i].length!=mat2[i].length)
                			   {
                				   b=false;
                				   break;
                				   
                			   }
                		   }
                	   }
                	   return b;
                	   
                   }
}


