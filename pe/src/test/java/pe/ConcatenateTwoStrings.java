package pe;

public class ConcatenateTwoStrings {
	public static String concatenate() {
		String s1="hello";
		String s2="world";
		String s3=s1.concat(s2);
		System.out.println(s3);
		return s3;
	}
public static void main(String[] args) {
	concatenate();
}
}
