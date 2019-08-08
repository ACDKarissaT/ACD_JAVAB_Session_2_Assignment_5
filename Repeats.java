package session.two;

import java.util.Scanner;

public class Repeats {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = sc.next();
		String out = "";
		sc.close();
		
		for (int i = 0; i < word.length(); i++) {
			if (out.indexOf(word.charAt(i)) >=0);
			else {
				out += word.charAt(i);
			}
		}
		
		System.out.println(out);
	}
}
