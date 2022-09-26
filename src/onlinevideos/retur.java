package onlinevideos;

public class retur {

	int x=80;
	int y=100;
	public int comp()
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static void main(String[] args) {
		
          retur obj=new retur();
          int a=obj.comp();
          System.out.println(a);
	}

}
