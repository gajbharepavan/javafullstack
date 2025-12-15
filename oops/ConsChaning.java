package oops;
class Demo{
	private int n1;
	private int n2;
	Demo(){
		super();
		System.out.println("zero param");
	}
	Demo(int n1,int n2){
		this(n1);
		this.n1=n1;
		this.n2=n2;
		System.out.println(n1);
		System.out.println("2 param");
	}
	Demo(int n1){
		this();
		System.out.println("1 param");
		
	}
	void  disp() {
		System.out.println(n1);
		System.out.println(n2);
	}
}

public class ConsChaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo(4,5);
		d1.disp();
		

	}

}
