package onlinevideos;

class AAA
{
	public void show (int a,int b)
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
	}
}
class BBB extends AAA
{
//  public void sub (int a, int b)
//
//{System.out.println(a-b);
//	  }
//}
//class CCC extends BBB
//{
//	public void mul (int a, int b)
//	{System.out.println(a*b); 
//	  }
}

public class inheritanceexcerise {

	public static void main(String[] args) {
		AAA obj = new AAA ();
		obj.show(20,30);

	}

}
