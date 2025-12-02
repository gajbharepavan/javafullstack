package oops;
class Alien{
	static {
		System.out.println("sb1");
		
	}				
	static {
		System.out.println("sb2");
		
	}
	{
		System.out.println("non-static1");
		
	}
	static {
		System.out.println("sb3");
		
	}
	{
		System.out.println("non-static2");
		
	}
	
}

public class LaunchStatic1 {

	public static void main(String[] args) {
		Alien a1=new Alien();

	}

}
