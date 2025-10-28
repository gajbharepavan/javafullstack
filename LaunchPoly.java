package polymorphism;
class Aeroplane{
	public void takingOff() {
		System.out.println("Aerolane taking off");
	}
	public void fly() {
		System.out.println("aeroplane flying");
	}
	
}
class CargoPlane extends Aeroplane{
	public void takingOff() {
		System.out.println("cargo takingofff");
	}
	public void fly() {
		System.out.println("cargo fly");
	}
}
class FighterPlane extends Aeroplane{
	public void fly() {
		System.out.println("fighter flying");
	}
	public void takingOff(){
		System.out.println("fighter flying");
	}
}
class Airport{
	public void permit(Aeroplane aeroplane) {
		aeroplane.takingOff();
		aeroplane.fly();
	}
}

public class LaunchPoly {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		Airport a=new Airport();
		a.permit(cp);
		a.permit(fp);
		
	}

}
