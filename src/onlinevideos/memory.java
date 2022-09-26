package onlinevideos;

public class memory {

	public static void main(String[] args) {
		int a=20;
		System.out.println(System.identityHashCode(a));
//		int a=30;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a+a));
		
	}

}
