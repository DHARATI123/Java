
public class Testcommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[args.length];
		int sum=0,avg=0;
		for (int i=args.length-1;i>=0;i--)
		{
			arr[i]=Integer.parseInt(args[i]);
			sum=sum+arr[i];
			
		}
		System.out.println("sum of"+sum);
		System.out.println("average is"+(avg=sum/args.length));
        for(int i=0;i<args.length;i++)
        {
        	if(arr[i]>avg)
        	{
        		System.out.println(args[i]);
        	}
        }
        	
        	
        	
    
	}

}
