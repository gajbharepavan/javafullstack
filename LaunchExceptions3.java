package exceptions;
class Alpha{
	public void calc() throws ArithmeticException {
		
	
	System.out.println("conn est");
	try{
		int n=100;
	
	int d=0;
	int res =n/d;
	System.out.println(res);
	System.out.println("conn after");
	//System.out.println("enter non zero ");
	//System.out.println("handeled in aplha ");
	}
	catch(ArithmeticException e) {
		System.out.println("enter non zero ");
		System.out.println("handeled in aplha ");
		//throw e;
		
		
	}
	finally {
		
	
	System.out.println("conn termi");
	}
	
	
	}
	
}

public class LaunchExceptions3 {

	public static void main(String[] args) {
		try{
			Alpha a=new Alpha();
		
		     a.calc();
		}
		catch(ArithmeticException  e) {
			System.out.println("enter non zero ");
			System.out.println("handeled in main");
			throw e;
			
		}
		//System.out.println("conn termi");
		

	}

}
