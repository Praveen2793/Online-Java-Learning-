package onlinevideos;

import java.util.Scanner;

public class switchexcerise {

	public static void main(String[] args) {
		System.out.println("Enter The Case Value");
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		
		switch(a)
		{
		case 1:{
			for (int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.println(i+" "+j);
				}
			}
		}
//		break;
		case 2:
		{
			System.out.println("Enter the B Value");
			int b=s.nextInt();
			
			if(a<b)
			{
				if(b<10)
				{
                   System.out.println("check");   
				}
				else
				{
					System.out.println("No check");			
				}
				
			}
			else
			{
				System.out.println(" No Compare");
			}
		}
//		break;
		case 3:
		{
			System.out.println("Enter the C Value");
			int c=s.nextInt();
			for(int i=0;i<5;i++)
			{
				if(i==2) {
					continue;
									}
				else {
					System.out.println(i);
			
				}
				}
		}
//		break;
		default:
		{
			System.out.println("No Values");
		}
		}
		

	}

}
