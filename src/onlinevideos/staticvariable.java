package onlinevideos;

class sta
{
	int emply;
	static int salary;
	static String ceo;
	static String cmpy_name;
	
	static // static variable declaration 
	{
		
		ceo="praveen";
		cmpy_name="seikodenki india pvt ltd";
		System.out.println("1-static");
		
		
	}
	
	public sta() /// constructor 
	{
		emply=5;
		salary=60000;
		System.out.println("In Constructor");
			
	}
	
	static 
	{
		ceo="priya";
		System.out.println("2-static");
	}
	
	public void display() /// method

{
	System.out.println("em " + emply+" : " +"sal "+ salary+" : "+ceo+":"+cmpy_name);
}

}

public class staticvariable {

	public static void main(String[] args) {
                          // object deceleration         
		
		sta prasanth=new sta();
		sta prabhu=new sta();
		
		prasanth.display();
		prabhu.display();
	
			
	}

}
