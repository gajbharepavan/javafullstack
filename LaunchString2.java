package strings;

public class LaunchString2 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer("hello");
		sb1.append("hello");
		System.out.println(sb1);
		sb1.append("a");
		sb1.append("aaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(sb1);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		StringBuilder sb=new StringBuilder();
		sb.append("hello");
		System.out.println(sb); 
	}
	}


