package onlinevideos;

interface name /// interface has been intilazied 
{
	void show();
}
class name1 implements name /// interface class has called by using implements command 
{
	public void show()
	{
		System.out.println("name1");
	}
}

public class interface1 {

	public static void main(String[] args) {
		
		name a=new name1();
		a.show();

	}

}
