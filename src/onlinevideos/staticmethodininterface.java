package onlinevideos;

interface num
{
	void show();
	static void display()
	{
		System.out.println("Static Method Display");
	}
	static void show1()
	{
		System.out.println("Static Method Show1");
	}
	default void show2()
	{
		System.out.println("Static Method Show2");
	}
}
class num1 implements num
{
	public void show()
	{
		System.out.println("Not static show");
	}
	public void show2()
	{
		System.out.println("Not Static Show2");
	}
}

public class staticmethodininterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        num.display();
        num.show1();
        num a=new num1();
        a.show();
        a.show2();
	}

}
