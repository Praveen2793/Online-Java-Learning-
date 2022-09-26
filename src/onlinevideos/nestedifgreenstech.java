package onlinevideos;

import java.util.Scanner;

public class nestedifgreenstech {

	public static void main(String[] args) {
		System.out.println("Enter The Patient Details");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		int c=a.nextInt();
		if(b<120)
		{
		if(c<180)
			{
			System.out.println("Fit Person");
			}
			else
				System.out.println("High Sugar");
				}
		else
		{
			System.out.println("High Blood Pressure and High sugar");
		}

	}

}
