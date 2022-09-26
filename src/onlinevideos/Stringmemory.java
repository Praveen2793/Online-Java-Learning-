package onlinevideos;

public class Stringmemory {
	public static void main(String[] args) {
		
//		String s="Greens";
//		String s2="Greens";
//		
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s2));
//		
//		String s1=new String("Praveen");
//		System.out.println(System.identityHashCode(s1));
//		String s3=new String("Praveen");
//		System.out.println(System.identityHashCode(s3));
		
		//Immutable String (Grabdge collection used to clear the un point value)
//		String s="Greens"; // Unpoint Value
//		System.out.println(s);
//		System.out.println(System.identityHashCode(s));
//		s="Praveen";
//		System.out.println(s);
//		System.out.println(System.identityHashCode(s));
		
		///Mutable String 
//		StringBuffer sb=new StringBuffer("Greens");
//		System.out.println(sb);
//		System.out.println(System.identityHashCode(sb));
//		sb.append(" Tech");
//		System.out.println(sb);
//		System.out.println(System.identityHashCode(sb));
//		sb.append(" java class");
//		System.out.println(sb);
		
//		String s="Praveen Kumar";
//		s=s.toLowerCase();
//		System.out.println(s);
//		s=s.toUpperCase();
//		System.out.println(s);
//		boolean eq=s.equals("praveen");
//		System.out.println(eq);
//		boolean eqi=s.equalsIgnoreCase("Praveen");
//		System.out.println(eqi);
//		boolean cont=s.contains("Praveen");
//		System.out.println(cont);
//		boolean strw=s.startsWith("Prav");
//		System.out.println(strw);
//		boolean etrw=s.endsWith("mar");
//		System.out.println(etrw);
		
		String s=" Greens Technology "
				+ ""
				+ "";
		
		int len=s.length();
		System.out.println(len);
		
		int index=s.indexOf("l");
		System.out.println(index);
		
		int lidex=s.lastIndexOf("o");
		System.out.println(lidex);
		
		String fidex=s.replaceFirst("e", "i");
		System.out.println(fidex);
		
		char charpos=s.charAt(16);
		System.out.println(charpos);
		
		String subst=s.substring(3);
		System.out.println(subst);
		
		String subseq=s.substring(3, 8);
		System.out.println(subseq);
		
		String Re=s.replace("e", "0");
		System.out.println(Re);
		
		String cont=s.concat(" Java Training");
		System.out.println(cont);
		
		String trim=s.trim();
		System.out.println(trim);
		
		
		
		
		
	}
	

}
