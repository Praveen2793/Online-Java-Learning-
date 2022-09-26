package onlinevideos;

import java.util.Scanner;

public class Armdemo {
 static int ans;
	public static void main(String[] args) {
		System.out.println("Enter the Value");
		Scanner s= new Scanner (System.in);
		
		int a=s.nextInt();//1634
		
		int b=a;//1634
		
		while(a>0)
		{
			int c=a%10;//4
		   ans=ans+c*c*c*c;
		   a=a/10;
		}
	
		if (ans==b)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Non Armstrong Number");
		}
		System.out.println(ans);
		}
	
	
	
}
