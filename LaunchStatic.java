package oops;
class Demo2{
	static int a,b,c;
	int x,y,z;
	static {
		System.out.println("static initilization");
		a=10;
		b=20;
		c=30;
		
	}
	 static void disp(){
		System.out.println("a :" +a);
		System.out.println("b :" +b);
		System.out.println("c :" +c);
		
	}
	{
		System.out.println("non static ");
		x=44;
		y=45;
		z=46;
		
	}
	Demo2(){
		System.out.println("constructor");
		
		
	}
	void disp2() {
		System.out.println("a :" +a);
		System.out.println("b:" +b);
		System.out.println("c :" +c);
		System.out.println("x :" +x);
		System.out.println("y :" +y);
		System.out.println("z :" +z);
		
		
	}
}

public class LaunchStatic {

	public static void main(String[] args) {
		
		Demo2.disp();
		Demo2 d2=new Demo2();
		d2.disp2();
		

	}

}
