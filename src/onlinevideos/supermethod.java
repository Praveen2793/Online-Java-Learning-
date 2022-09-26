package onlinevideos;
class A1
{
int a=10;
int b=10;
public A1()
{
//	super();
	System.out.println("in A1");
}
public A1(int i)
{
//	super();
  System.out.println("in int A1");
}
}
class B extends A1
{
	public B()
	{
//		super(1);
		System.out.println("in B");
	}
	public B(int i)
	{
//		super();
		System.out.println("in int B");
	}
}


public class supermethod {

	public static void main(String[] args) {
	
		A1 obj=new A1();
		

	}

}
