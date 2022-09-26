package onlinevideos;


public class constructorchild {

	public constructorchild()
	{
		this(50,"JAVA CLASS");
	}
	public constructorchild(int a)
	{
		this(45,'A');
		System.out.println(45);
	}
	public constructorchild(int a,String c)
	{
		this(45);
		
		System.out.println(a+" "+c);
	}
	public constructorchild(int b,char d)
	{
		System.out.println(b+" "+d);
	}
	
	public static void main(String[] args) {
	constructorchild s=new constructorchild();

	}

}
