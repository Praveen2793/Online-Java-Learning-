package onlinevideos;

interface namedemo
{
	void show();
	
}

interface mynamedemo
{
	void display();
}

class demoname implements namedemo,mynamedemo
{
	public void show()
	{
		System.out.println("Name Demo");
	
	}
	public void display()
	{
		System.out.println("my name demo");
	}
}

public class multipleinheritancewithinterface {

	public static void main(String[] args) {
		namedemo a=new demoname();
		mynamedemo a1=new demoname();
		a.show();
		a1.display();
		
	}

}
