package onlinevideos;

class outer
{
	int a;
	int b;
	static String word;
	
	public outer()
	{
		a=10;
		b=20;
		word="first";
		
	}
	public void show()
	{
	{
		System.out.print("outerclass ");
		System.out.print(a+b+":"+word);
	}
	System.out.println();
	}
	
   class inner extends outer
	{
		int c=40;
		int d=90;
		String name="second";
		
	public void display()
	{
		System.out.println("innerclass "+"name");
		System.out.println(c+d+":"+name);
	}
		}
   
	
}


public class innerdemoclass {

	public static void main(String[] args) {
		
		outer obj=new outer();
		obj.show();
		
		outer.inner obj1=obj.new inner();
		obj1.display();
		
		
			
	}

}
