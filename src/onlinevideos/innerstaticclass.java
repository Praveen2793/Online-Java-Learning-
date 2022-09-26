package onlinevideos;

class A 
{
	public void A1()  /// method of A1
	{
	System.out.println("class A"); /// member class 
	}
	class B 
	{
		public void B1() /// method of B1
		{
			System.out.println("class B"); /// member class
		}
	}
	static class c
	{
		public void C1( ) /// method of c1
		{
			System.out.println("class C (Static)"); /// static class 
		}
	}

}


public class innerstaticclass {

	public static void main(String[] args) {

		A obj3=new A(); /// A1 Method calling 
		obj3.A1();
		
		A.B obj4=obj3.new B(); /// B1 method calling 
		obj4.B1();
		 
		A.c obj5=new A.c(); /// C1 method calling 
		obj5.C1();
		
	}

}
