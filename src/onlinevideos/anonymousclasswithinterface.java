package onlinevideos;

interface abc
{
	void show();
}

public class anonymousclasswithinterface {

	public static void main(String[] args) {
		abc a=new abc()
				{
			public void show() // Interface with Anonymous class by using object creation 
			{
				System.out.println("In Inter1");
				System.out.println("In Inter2");
			}
				};
				a.show();
				

	}

}
