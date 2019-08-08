package session.two;

public class StringFunctions {
	public static void main(String[] args) {
		String s = "Hello World!";
		char c = s.charAt(2);
		String s1 = s.concat("Good bye.");
		String s2 = s1.substring(12);
		System.out.println("s.charAt(2) = " + c);
		System.out.println("s.concat(\"Good bye.\") = "+ s1);
		System.out.println("s1.substring(12) = " + s2);
		System.out.println("s.equals(s2) = " + s.equals(s1));
		System.out.println("s.compareTo(s2) = " + s.compareTo(s2));
		System.out.println("s.contains(\"u\".subSequence(0, 1) = " + s.contains("u".subSequence(0, 1)));
		System.out.println("s.indexOf(!) = " + s.indexOf((int)'!'));
		System.out.println("s1.replace(' ', ':') = " + s1.replace(' ', ':'));
		System.out.println("s1.toLowerCase() = " + s1.toLowerCase());
	}
}
