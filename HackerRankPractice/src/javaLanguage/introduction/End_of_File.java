package javaLanguage.introduction;

import java.util.Scanner;

public class End_of_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i > -1; i++) {
			if(sc.hasNext())
				System.out.println(i + " " + sc.nextLine());
			else {
				System.out.println(i + " " + sc.nextLine());
				break;
			}
		}
	}

}
