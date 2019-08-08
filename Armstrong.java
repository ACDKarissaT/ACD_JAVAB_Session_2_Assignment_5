package session.two;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		String s = sc.next();
		sc.close();
		int n = Integer.parseInt(s);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += (int)Math.pow(Integer.parseInt("" + s.charAt(i)),3);
		}
		if (sum == n) {
			System.out.println("It is Armstrong.");
		} else {
			System.out.println("It is not Armstrong.");
		}
	}
}
