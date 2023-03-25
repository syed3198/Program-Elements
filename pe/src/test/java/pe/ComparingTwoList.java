package pe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComparingTwoList {
	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		
			list1.add("Hai");
			list1.add("Hello");
			list2.add("Hai");
			list2.add("Hell");
			
			System.out.println(list1);
			System.out.println(list2);
			System.out.println(list1.equals(list2));
			
		
		
	}

}
