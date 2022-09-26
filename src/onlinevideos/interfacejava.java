package onlinevideos;

interface java
{
	void show();
	void name();
}
class java1 implements java
{
	public void show()
	{
		System.out.println("Sub Calss");
	}

	@Override
	public void name() {
		System.out.println("IN Java2");
		
	}
}
class java2 extends java1
{
	public void name()
	{
		
	}
}



public class interfacejava {

	public static void main(String[] args) {
		
		java obj=new java1();
	    obj.name();

	}

}
