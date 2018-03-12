package javaLanguage;

import java.util.Scanner;

public class JavaStdinandStdoutI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//Example Code
		String str = sc.next();
		int value = sc.nextInt();
		
		System.out.println("myString is: " + str);
		System.out.println("myInt is: " + value);
		
		
		//Task Code
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		
		System.out.println(value1 + "\n" + value2 + "\n" + value3);
	}

}
