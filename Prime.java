package session.two;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		if (num < 2) {
			System.out.println ("Not Prime.");
			return;
		} else if (num == 2) {
			System.out.println ("Prime.");
			return;
		}
		int sqrt = (int)Math.sqrt(num);
		
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
	}
}
