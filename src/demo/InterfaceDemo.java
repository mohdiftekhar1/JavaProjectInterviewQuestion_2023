package demo;

public class InterfaceDemo implements MyInterface {

	
	@Override
	public void demo() {
		
		System.out.println("This is the implementation of the demo method");
		
	}
	
	public static void main(String[] args) {


		MyInterface obj = new InterfaceDemo();
	
		System.out.println(obj.num);

	}


}
