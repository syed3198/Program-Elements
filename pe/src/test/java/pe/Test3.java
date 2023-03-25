package pe;

import java.util.ArrayList;

import java.util.Collections;



public class Test3 {
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	ArrayList<String> str=new ArrayList<String>();
	ArrayList<String> inputList=new ArrayList<String>();
	inputList.add("45");
	inputList.add("a2");
	inputList.add("33");
	/*for (int i = 0; i <=3; i++) {
		str.add(sc.nextLine());
		
	}*/
	
	System.out.println("before sorted list :"+inputList);
	Collections.sort(inputList);
	System.out.println("after sorted list :"+inputList);
}
}

