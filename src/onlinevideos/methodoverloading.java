package onlinevideos;

class casio
{
	public void casio (int a, int b)
	{
		System.out.println(a+b);
	}
	public void casio (int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public void casio (double a, double b)
	{
		System.out.println(a+b);
	}
}

public class methodoverloading {

	public static void main(String[] args) {

		casio obj=new casio();
		
		obj.casio(1.2,2.2);
				
 
	}

}
