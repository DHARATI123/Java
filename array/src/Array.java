import java.util.Scanner;
public class Array {
	public static void main(String args[])
	{
		int even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("how many no do you want");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter no in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Elements in array are\n");
		  for (int i:arr)
		  {
			  if(i%2==0){
				  even++;
				  
				  
			  }
			  else{
			
			  
			  odd++;


			  }
			  }
		  System.out.println("even no are :"+even);
		  System.out.println("odd no are:"+odd);
		 System.out.println("elements in reverse order are");
		  for(int i=arr.length-1;i<=0;i--)
		  {
			  System.out.println(arr[i]);
		  }
	    
	}
 

	}
	
