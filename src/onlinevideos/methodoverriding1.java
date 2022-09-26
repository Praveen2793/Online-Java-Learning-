package onlinevideos;

class class2 extends class1
{
	
	@Override
	public void over(int b) {
		// TODO Auto-generated method stub
		super.over(b);
		}
	@Override
	public void show(int c, int d) {
		// TODO Auto-generated method stub
		super.show(c, d);
	}
	@Override
	public void display(String e) {
		// TODO Auto-generated method stub
		super.display(e);
	}
	@Override
	public void sub(int f, double g) {
		// TODO Auto-generated method stub
		super.sub(f, g);
	}
	@Override
	public void all(char m, double n) {
		// TODO Auto-generated method stub
		super.all(m, n);
	}
	public void addmul(int o,int p)
	{
		System.out.println(o*p+o+p);
	}
	public void name(String op)
	{
		System.out.println(op);
		
	}
}
	public class methodoverriding1 {
	public static void main(String[] args) 
	{
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
		class2 obj5=new class2();
		class2 obj6=new class2();
		obj5.addmul(10,20);
		obj6.name("java training");
		
	}
	}
