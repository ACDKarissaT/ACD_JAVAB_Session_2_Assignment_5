package session.two;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		String num = String.valueOf(sc.nextInt());
		sc.close();
		int l = num.length();
		for (int i = 0; i < l/2; i++) {
			if (num.charAt(i) != num.charAt(l-1-i)) {
				System.out.println("Not a palindrome.");
				return;
			}
		}
		System.out.println("Palindrome.");
	}
}
