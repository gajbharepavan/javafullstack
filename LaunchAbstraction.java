package polymorphism;
 abstract class Aeroplane1{
	 abstract  public void fly();
	 
	 
	}
	class CargoPlane1 extends Aeroplane1{
		public void fly() {
			
			System.out.println("cargo is flying");
		}
	}
	class FighterPlane1 extends Aeroplane1{
		public void fly() {
			System.out.println("Fighterplane fly");
		}
	}
		
	class Airport1{
		
		
	 void permit(Aeroplane1 aeroplane) {
		 aeroplane.fly();
		
	}
	}

public class LaunchAbstraction {
	

	public static void main(String[] args) {
		//Aeroplane a=new Aeroplane();
		 Aeroplane aeroplane;
		 CargoPlane1 cp=new CargoPlane1();
		 FighterPlane1 fp=new FighterPlane1();
		 
		 Airport1 a=new Airport1();
		 a.permit(cp);
		 a.permit(fp);

	}

}
