# Modulus-Operator-in-Java
Hello. Here's an example program demonstrating how the Modulus Operator works in Java.

public class modulusOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Understanding the Modulus Operator
		int a = 42;
		double b = 42.5;
		System.out.println("Original value of A: " + a);
		System.out.println("Original value of B: " + b);
		
		System.out.println("A mod 10: " + a%10);
		System.out.println("B mod 10: " + b%10);
		System.out.println("A mod B: " + a%b);
		System.out.println("B mod A: " + b%a);
		
	}

}
