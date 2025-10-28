package oops;
class Demo4{
	static int a;
	public  void disp(){
		System.out.println("parent class");
		
		
	}
}
	class Demo5 extends Demo4{
		public  void disp() {
			System.out.println("child class");
		}
	}


public class LaunchInhertiStatic {

	public static void main(String[] args) {
		Demo4 d=new Demo5();
		d.disp();
		
		

	}

}
