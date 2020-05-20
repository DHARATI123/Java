
public class Reverse {
	public static void main(String args[]){
		int arr[]=new int[args.length];
		for(int i=args.length-1;i>=0;i--)
		{
			arr[i]=Integer.parseInt(args[i]);
			System.out.println("Reverse no are"+arr[i]);
		}
	}
	

}
