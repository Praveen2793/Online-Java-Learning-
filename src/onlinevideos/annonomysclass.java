package onlinevideos;

class anno
{
	public void show()
	{
		System.out.println("IN Anno");
	}
}

public class annonomysclass {

	public static void main(String[] args) {
		anno a=new anno()
		{
			public void show() /// Anonymous class 
			{
				System.out.println("In Anno 1");
				System.out.println("In Anno 2");
			}
		};
		a.show();
	}

}
