package exceptions;


public class LaunchException2 {
	public static void main(String[]args) {
		try {
			System.out.println("conn est");
			int n=100;
			int d=0;
			int res=n/d;
			System.out.println(res);
		}
		catch(ArithmeticException  e) {
			System.out.println("enter non zero");
		}
			try {
				
			
			int size=4;
			int i=5;
			int [] arr=new int[size];
			int element=44;
			arr[i]=element;
			System.out.println(arr[i]);
			
		}
		//catch(ArithmeticException  e) {
		//	System.out.println("enter non zero");
			
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("enter valin index");
			
		}
		System.out.println("conn terminated");
		
	}
	

}
