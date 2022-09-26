package onlinevideos;

// method overloading (by using 5 method)

public class poly {
		
	public void sweet(byte a)
	{
		System.out.println("byte"+a);
	}
	public void sweet (int b, int c)
		{

		System.out.println(b);
		System.out.println(c);
	}
	public void sweet (String e, float f)
	{
		System.out.println(e+" "+f);
	}
    public void sweet (char a,double g)
    {
    	System.out.println(a+" "+g);
    }
    public void sweet (boolean h,int a)
    {
    	System.out.println(h+" "+" "+a);
    }
	public static void main(String[] args) {

		poly obj=new poly();
		
		obj.sweet((byte)1);
		obj.sweet(20,30);
		obj.sweet("hello world",52f);
		obj.sweet('A',52.6545d);
		obj.sweet(false,99);
		

	}

}
