package onlinevideos;

class class1
{
	public void over(int b)
	{
		System.out.println(b);
	}
	public void show(int c, int d)
	{
		System.out.println(c+d);
	}
	public void display(String e)
	{
		System.out.println(e);
	}
	public void sub(int f,double g)
	{
		System.out.println(f-g);
	}
	public void all(char m, double n)
	{
		System.out.println(""+m+" "+n);
	}
}
public class methodoverriding {

	public static void main(String[] args) {

		class1 obj =new class1();
		class1 obj1=new class1();
		class1 obj2=new class1();
		class1 obj3=new class1();
		class1 obj4=new class1();
		obj.over(22);
		obj1.show(20,20);
		obj2.display("Method Overriding");
		obj3.sub(10,10.55d);
		obj4.all('A',55.55);
		
	}

}
