package oops;
class Dog{
	private int id;
	private String name;
	

Dog(int id,String name) {
	this.id=id;
	this.name=name;
	
	
}
Dog(){
	int  id;
	
}
int getId() {
	return id;
}
}

public class constructor {

	public static void main(String[] args) {
		Dog d1=new Dog(1,"sheru");
		System.out.println(d1.getId());
		Dog d2=new Dog();
		System.out.println(d2.getId());
		
		

	}

}
