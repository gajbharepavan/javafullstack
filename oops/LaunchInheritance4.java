package oops;
class Plane{
	
}
class Fighter extends Plane{
	
}
class Animal{
	public Plane sleep() {
		System.out.println("animal sleep");
		Plane p=new Plane();
		return p;
	}
	 void eats() {
		System.out.println("animal eats");
		
	}
}
class Tiger extends Animal{
	   public Fighter sleep() {
		System.out.println("tiger sleep");
		Fighter f=new Fighter();
		return f;
		
	}
	   void eats() {
		   System.out.println("tiger eats");
	   }
	
}

public class LaunchInheritance4 {

	public static void main(String[] args) {
	Animal t=new Tiger();
		t.eats();

	}

}
