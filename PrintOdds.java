package session.two;

import java.util.Scanner;

public class PrintOdds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many odds: ");
		int n = sc.nextInt();
		System.out.print("Starting number: ");
		int s = sc.nextInt();
		sc.close();
		if (s % 2 == 0) s = s + 1;
		for (int i = s, c = 0; c < n; i = i + 2, c++) {
			System.out.print(i+ " ");
			if ((c+1) % 5 == 0) System.out.println();
		}
	}
}
