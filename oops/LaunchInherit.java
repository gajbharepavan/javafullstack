
package oops;
class app1{
	int age;
	void disp() {
		age=10;
		System.out.println("telusko is"+ age);
		
	}
}
	class App extends app1{
		
	}


public class LaunchInherit {
	public static void main(String[]args) {
		
	
	App t=new App();
	t.disp();

}
}
