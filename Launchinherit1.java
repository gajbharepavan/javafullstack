
package oops;
class Alien1{
	int age;
	void disp() {
		age=10;
		System.out.println("telusko is"+ age);
		
	}
}
	class Apple extends Alien1{
		
	}


public class Launchinherit1{
	public static void main(String[]args) {
		
	
	 Apple t=new Apple();
	t.disp();

}
}


