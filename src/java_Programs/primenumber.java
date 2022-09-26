package java_Programs;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
//
	int count=0;
		for (int n=2; n<100; n++)
		{
			boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
//			System.out.println(n+"/"+i);
		}
		
	if(flag==true)
	{
		System.out.println(n + " " +"Prime Number");
		count++;
	}
//	else
//	{
//		System.out.println("Not a Prime Number");
//	}
			}
		System.out.println("Total Prime :"+ count);
	    
//		System.out.println("Enter the Number");
//		Scanner prm=new Scanner(System.in);
//		int a=prm.nextInt();
//		if(a%1000==0)
//		{
//		System.out.println("Not a Prime Number");	
//		}
//		else 
//			System.out.println("It is a prime number");
		}		
		
	}

