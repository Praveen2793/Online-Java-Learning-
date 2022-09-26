package onlinevideos;

import java.util.ArrayList;
import java.util.LinkedList;

public class arraylist {

	public static void main(String[] args) {
    
//		ArrayList al= new ArrayList ();
//		al.add(123);
//		al.add("praveen");
//		al.add("XXX");
//		al.add(123);
//		al.add("praveen");
//		al.add("XXX");
//		System.out.println(al.get(5));
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println(al);
		
//		System.out.println(al.get(6));
//		
//		boolean i=al.isEmpty();
//		System.out.println(i);
//		
//		al.remove(6);
//		System.out.println(al);
//		
//		al.clear();
//		
//		boolean a=al.isEmpty();
//		System.out.println(a);
		
//		al.add(3,1000);
//		System.out.println(al);
//		al.set(3,5000);
//		System.out.println(al);
//		al.remove(3);
//		System.out.println(al.indexOf(10));
//		System.out.println(al.lastIndexOf(10));
//		System.out.println(al.size());
//		System.out.println(al.subList(5, 10));
//		System.out.println(al.contains(50));
		
//		System.out.println(al);
//		LinkedList<Integer> ll=new LinkedList<Integer>();
//		ll.addAll(al);
//		System.out.println(ll);
//		ll.add(456);
//		ll.add(556);
//		System.out.println(ll);
//		ll.removeAll(al);
//		System.out.println(ll);
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==60)
			{
				al.remove(i);
			}
		}
		System.out.println(al);
		
	}

}
