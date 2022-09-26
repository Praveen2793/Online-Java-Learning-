package onlinevideos;

import java.util.Scanner;

public class elseIF {
	public static void main(String[] args) {
		System.out.println("Entre the Price Rs: ");
		Scanner s=new Scanner (System.in);
	    int b=s.nextInt();
	        
	    if (b>300 && b<500)
	    	
	    {
	    	System.out.println("Can Buy :");
	    	System.out.println("Soap");
	    	System.out.println("Brush");
	    	System.out.println("Tooth Paste");
	    }
	    else if(b>500 && b<700)
	    {
	    	System.out.println("Can Buy :");
	    	System.out.println("Oil");
	    	System.out.println("Dal");
	    	System.out.println("Fruits");
	    	
	    }
	    else if (b>700 && b<1000)
	    {
	    	System.out.println("Can Buy :");
	    	System.out.println("Rice");
	    	System.out.println("Wheet");
	    	System.out.println("Flour");
	    }
	    else if(b>1000)
	    	{
	    	    System.out.println("Can Buy :");
		    	System.out.println("Soap");
		    	System.out.println("Brush");
		    	System.out.println("Tooth Paste");
		    	System.out.println("Oil");
		    	System.out.println("Dal");
		    	System.out.println("Fruits");
		    	System.out.println("Rice");
		    	System.out.println("Wheet");
		    	System.out.println("Flour");
		  	    	} 
		 else if (b<300)
    	{
    		System.out.println("No Item Avaliable in Shop");
    	}
	}

}
