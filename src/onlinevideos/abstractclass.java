package onlinevideos;

abstract class writer
{
	public void name() {
		Number i=10;
		Number k=20;
	}
}
class pen extends writer
{
	public void show(int i) {
		System.out.println(i);
	}
}
class pencil extends writer
{
	public void display(int k) {
		System.out.println(k);
	}
}

public class abstractclass {

	public static void main(String[] args) {
	pen a = new pen();
	pencil b= new pencil();
	a.show(10);
	b.display(20);
	
    	}

}
