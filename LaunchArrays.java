package arrays;

import java.util.Scanner;

public class LaunchArrays {

	public static void main(String[] args) {
		int [] arr=new int[5];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		System.out.println(arr[0]);
		Scanner scan =new Scanner(System.in);
		//System.out.println("plz enter number");
//		arr[0]=scan.nextInt();
//		arr[1]=scan.nextInt();
//		arr[2]=scan.nextInt();
//		arr[3]=scan.nextInt();
//		arr[4]=scan.nextInt();
		//System.out.println(arr[0]);
		for(int i=0;i<arr.length;i++) {
			System.out.println("plz enter number");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);  
			
		}
		
	}

}
