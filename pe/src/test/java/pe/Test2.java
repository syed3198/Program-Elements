package pe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Test2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		String str="syed3198";
		str.replaceAll("[^A-Z0-9]", "");
		System.out.println(str);
	}
}

/*
 * long milliseconds = 1000000;
 * 
 * // us of toSeconds() // to convert milliseconds to minutes long seconds =
 * TimeUnit.MILLISECONDS.toSeconds(milliseconds);
 * System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");
 * 
 * // use of toMinutes() // to convert milliseconds to minutes long minutes =
 * TimeUnit.MILLISECONDS.toMinutes(milliseconds);
 * System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");
 * List <Long>s=new ArrayList<>(); s.add(seconds); s.add(minutes);
 * System.out.println(s);
 */