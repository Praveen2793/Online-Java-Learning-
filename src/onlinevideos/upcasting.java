package onlinevideos;

class parentcastingclass
{
	public void show(int a, int b)
	{
		System.out.println(a+b);
	}
}

public class upcasting {

	public static void main(String[] args) {
		parentcastingclass obj=new parentcastingclass();
		obj.show(10, 20);

	}

}
