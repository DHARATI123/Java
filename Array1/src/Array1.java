import java.util.Scanner;
public class Array1 {
	public static void main(String args[])
	{
       String str = null;
       int arr[]=new int[50];
       int n=0,ch=0;
        Scanner sc=new Scanner(System.in);
         do
         {
        System.out.println("\1-create\n2-Display\n3-Search\n4-Inseart\n5-delete");
        System.out.println("enter your choice");
        ch=sc.nextInt();
         switch(ch){
         case 1:
        	 System.out.println("how many numbers do you want in array:");
        	 n=sc.nextInt();
        	 for(int i=0;i<n;i++)
        	 {
        		 arr[i]=sc.nextInt();
        		 
        	 }
        	 break;
         case 2:
        	 System.out.println("Array elements are:");
        	 for(int i=0;i<n;i++)
        	 {
        		 System.out.println(arr[i]);
        	 }
        	 break;
         case 3:
              System.out.println("enter the no do you want:");
              int k =sc.nextInt();
              for(int i=0;i<n;i++)
              {
            	  if(k==arr[i])
            	  {
            		  System.out.println("element found is at location:"+(i+1));
   
            	  }
           
              }
        	break;
         case 4:
        	 System.out.println("enter the no and position do you want");
        	 int elt=sc.nextInt();
        	 int p=sc.nextInt();
        	 for(int i=n-1;i>=p-1;i--)
        	 {
        		 arr[i+1]=arr[i];
        		 
        	 }
			arr[p-1]=elt;
        	 System.out.println("After inserting");
        		 for(int i=0;i<n;i++){
        			 System.out.println(arr[i]+",");
        			 
        		 }
        		 System.out.println(arr[n]);
        	 
        	 
        	 break;
         case 5:
        	 System.out.println("enter the no and position want to delit ");
        	 int elt1=sc.nextInt();
            int pos=sc.nextInt();
            elt1=arr[pos-1];
            for(int i=pos-1;i<n;i++)
        	 
        		 {
        			 arr[i]=arr[i+1];
        		 }
        	 
        		n--;
        		System.out.println("after deliting");
        		for(int i=0;i<n;i++){
        			System.out.println(arr[i]+",");
        			
        		}
        		System.out.println(arr[n-2]);
        		break;
        	 }
         System.out.println("do you want to continue yes/no");
         str=sc.next();
         }
	while(str.endsWith("yes"));
         System.out.println("................THANKYOU..........."
         		+ "visit again");
         
	}
	}

