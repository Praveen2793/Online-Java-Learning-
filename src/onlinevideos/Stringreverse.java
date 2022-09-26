package onlinevideos;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		System.out.println("Enter The Word");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		
		for(int i=a.length()-1;i>=0;--i)//654321
		{
			System.out.print(a.charAt(i));//
		}
			

	}

}
