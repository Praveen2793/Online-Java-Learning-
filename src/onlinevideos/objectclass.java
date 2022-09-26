package onlinevideos;

class calc
{
double num1;
double num2;        /// variables decleration
double result;
	public void perform()
	{
	result=num1+num2; //// method decleration 
}
}
public class objectclass {
	public static void main(String[] args) {
     calc obj=new calc(); /// reference declare now object know and perfome
   obj.num1=1;
   obj.num2=5;
   obj.result=obj.num1/obj.num2;
   System.out.println(obj.result);
	}

}
