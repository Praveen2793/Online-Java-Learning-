package onlinevideos;

interface cda
{
	void show();
	default void display()
	{
		System.out.println("Default Method");
	}
	default void name()
	{
		System.out.println("Default method 2");
	}
}
/// In interface we can define method by using default keyword
class method implements cda
{
	public void show()
	{
		System.out.println("In Show Method");
	}
	public void display()
	{
		System.out.println("Default method override");
	}
}


public class defaultmethod {

	public static void main(String[] args) {
		cda a=new method();
		a.show();
		a.display();
		a.name();
		

	}

}
