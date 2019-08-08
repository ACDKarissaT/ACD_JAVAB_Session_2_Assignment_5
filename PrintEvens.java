package session.two;

public class PrintEvens {
	public static void main(String[] args) {
		for (int i = 0; i < 200; i = i + 2) {
			System.out.print(i + " ");
			if (i % 20 == 0 && i != 0) System.out.println();
		}
	}
}
