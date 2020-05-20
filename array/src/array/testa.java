package array;

import java.util.Scanner;

public class testa{

	public static void main(String[] args) {
		int a[],n;
		Scanner sc=new Scanner (System.in);
		System.out.println("how many no. do you want");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("enter no.");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
		
