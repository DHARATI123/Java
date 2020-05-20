package array;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		int a[],n,ecnt=0,ocnt=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("how many no. do you want");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("enter no.");
		for(int i=0;i<a.length;i++)

		{
			a[i]=sc.nextInt();

		}
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0)
			{
				ecnt++;
			}
			else
			{
				ocnt++;
			}
		}
		
		System.out.println("how many even no."+ecnt++);
		System.out.println("how many odd no"+ocnt++);
		
	}
}