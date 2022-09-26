package onlinevideos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List; /// need to import 

public class collection {

	public static void main(String[] args) {
		
		List <Object> c=new ArrayList<Object>();
		List <Object> d=new LinkedList<Object>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add("Praveen");
		d.add("JAVA");
		d.add(10);
		c.size();
		System.out.println(c);
		System.out.println(c.size());
		d.addAll(c);
		System.out.println(d);
		
		for(int i=0;i<c.size();i++)
		{
			
		}

	}

}
