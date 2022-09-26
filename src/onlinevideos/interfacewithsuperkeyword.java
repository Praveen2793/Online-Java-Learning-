package onlinevideos;

interface abcd
{
	void show();
	default void display()
	{
		System.out.println("In ABCD display");
	}
}

interface abcde
{
	default void display()
	{
		System.out.println("IN ABCDE");
	}
}

class abcdef implements abcd,abcde
{
	public void show()
	{
		System.out.println("In Abcd show");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		abcd.super.display();
	}
}

public class interfacewithsuperkeyword {

	public static void main(String[] args) {
       abcd a=new abcdef();
       a.show();
       a.display();
	}

}
