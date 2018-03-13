package javaLanguage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_II {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int no_of_queries = Integer.parseInt(br.readLine());
		String input_val;
		int a, b, n, sum = 0;
		for (int i = 0; i < no_of_queries; i++) {
			input_val = br.readLine();
			sum = 0;
			a = Integer.parseInt(input_val.split(" ")[0]);
			b = Integer.parseInt(input_val.split(" ")[1]);
			n = Integer.parseInt(input_val.split(" ")[2]);
			sum = a;
			for (int j = 0; j < n; j++) {
				sum += Math.pow(2, j) * b;
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		
	}

}
