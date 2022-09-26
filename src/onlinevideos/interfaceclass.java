package onlinevideos;

class interfaceclass implements Demo1, Demo2
{
	@Override
	public void name1() {
		// TODO Auto-generated method stub
		System.out.println("1");
		
	}
	@Override
	public void name2() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}
	@Override
	public void name4() {
		// TODO Auto-generated method stub
		System.out.println("4");
	}
	@Override
	public void name5() {
		// TODO Auto-generated method stub
		System.out.println("5");
		
	}
	
	public static void main(String[] args) {
		
		interfaceclass obj = new interfaceclass();
		obj.name1();
		obj.name2();
		obj.name4();
		obj.name5();
	}

}
