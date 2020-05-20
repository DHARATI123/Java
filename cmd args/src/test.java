
public class test {
	public static void main(String args[])
	{
		String s1=args[0];
		String s2=args[1];
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int sum=n1+n2;
		String str=Integer.toString(sum);
		
		System.out.println("addition is "+sum);
	}

}
