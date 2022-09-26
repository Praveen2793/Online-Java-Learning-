package onlinevideos;



public class wrapperclass {
	
	public static void main(String[] args) {
		int i=5;
		@SuppressWarnings("removal")
		Integer ii = new Integer(i); /// Wrapping // Boxing  
		int a=ii.intValue(); // UnWrapping // Un Boxing 
		
	
		Integer value=ii; // Auto Boxing
		
		int kkk=value; // un Auto Boxing 
		System.out.println(kkk); 
		
		float k=1; 
		Float kk = new Float(k);
		float b=kk.floatValue();
		System.out.println(b);
		
		double o=5.68;
		@SuppressWarnings("removal")
		Double oo=new Double(o);
		double c=oo.doubleValue();
		System.out.println(oo);
		
	}

}
