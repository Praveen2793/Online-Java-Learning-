package onlinevideos;

//class B
//{
//	public int show(int ... a)
//	{
//		int sum=0;
//		for(int n : a)
//		{
//			sum=sum+n;
//				}
//		return sum;
//	}
//}
class HH
{
	public int add(int ... m)
	{
		int sum=0;
	for(int i : m)
	{
		sum= sum + i;
	}
	return sum;
		}
}

public class variablelengthargumentsvargas {

	public static void main(String[] args) {
		
		HH obj=new HH();
		
		System.out.println(obj.add(1,2,3));

	}

}
