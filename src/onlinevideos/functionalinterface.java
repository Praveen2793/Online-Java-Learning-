package onlinevideos;

interface funtional
{
	void show();
}

//without defening object directly call the method by using lamda expression

public class functionalinterface {

	public static void main(String[] args) { 
		
		funtional obj=() -> System.out.println("Lamda Expression");  
		funtional obj1=() -> System.out.println("Lamda Expression 1");
		funtional obj2=() -> System.out.println("Lamda Expression 2");
		funtional obj3=() -> System.out.println("Lamda Expression 3");
		obj.show();
		obj1.show();
		obj2.show();
		obj3.show();
	}

}
