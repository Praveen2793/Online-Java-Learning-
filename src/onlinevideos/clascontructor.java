package onlinevideos;

class add
{
	int num1;
	int num2;
	int result;
	
	public add() /// contructor // allocate the memory // not return anything 
		{ 
		num1=4;
		num2=5;
		System.out.println("first contructor");
		}
	public add(int a)
	{
		num1=a;
		num2=a;
		System.out.println("second contrcutor");
				
	}
	public add (double b,double c)
	{
		num1=(int)b;
		num2=(int)c;
			System.out.println("third contructor");
	}	
		public add (int num1,int num2,int num3)
		{
			this.num1=num1;
			this.num2=num2;
			result=num3;
			System.out.println("fourth constructor");
				
	}
}

public class clascontructor {

	public static void main(String[] args) {

		add obj=new add(1,2,3);
		
		obj.result=obj.num1+obj.num2;
		
		System.out.println(obj.result);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
			
	}

}
