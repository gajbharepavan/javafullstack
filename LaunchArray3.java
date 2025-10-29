package arrays;
class Alien{
	int id;
	String name;
}

public class LaunchArray3 {

	public static void main(String[] args) {
		Alien[] arr=new Alien[2];
		arr[0]=new Alien();
		arr[1]=new Alien();
		arr[0].id=1;
		System.out.println(arr[0] );
		
		
	}

}
