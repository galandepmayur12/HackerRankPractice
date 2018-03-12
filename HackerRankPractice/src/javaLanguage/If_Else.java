
package javaLanguage;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number % 2 != 0) {
			System.out.println("Weird");
		} else {
			if(number > 0 && number < 5) {
				System.out.println("Not Weird");
			} else if (number <= 20 && number >= 6) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
			
		}
	}

}

