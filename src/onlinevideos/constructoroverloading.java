package onlinevideos;

class Constructor
{
	public Constructor(int a)
	{
		System.out.print(a+" " );
	}
	public Constructor(String b)
	{
		System.out.print(b+" ");
	}
	public Constructor (String c, int a)
	{
	System.out.print(c+" "+a);	
	}
}

public class constructoroverloading {

	public static void main(String[] args) {
	
		Constructor obj = new Constructor(27);
		Constructor obj1=new Constructor ("People In JAVA Class");
		Constructor obj2=new Constructor ("Constructor over loading", 0000);
		
	}

}
