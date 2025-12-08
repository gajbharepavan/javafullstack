package oops;
interface demo1{
	void disp();
	static void add() {
		System.out.println("add");
	}
}
interface demo2 extends demo1{
	default void show() {
		System.out.println("showing");
	}
}
class Algebra implements demo1,demo2 {
	public void disp() {
		System.out.println("display");
	}
//	public void show() {
//		System.out.println("show");
//	}
//	
}

public class LaunchInterface {

	public static void main(String[] args) {
		
        demo2 a=new Algebra();
        a.show();
        a.disp();
        demo1.add();
	}

}
