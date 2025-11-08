package exceptions;

public class LaunchException1 {

	public static void main(String[] args) {
		System.out.println("connectio established");
		try {
			
		int n=100;
		int d=0;
		int res=n/d;
		System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("enter non zero number");
		}
		
		System.out.println("connection terminated");

	}

}
