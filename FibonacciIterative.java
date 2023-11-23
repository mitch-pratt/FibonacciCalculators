package practical_5;

import java.util.Scanner;

public class FibonacciIterative {

	
	
	public int fibonacciIterative(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		int fib = 1;
		int prevFib = 1;
		
		for(int i = 2; i < n; i++) {
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		
		return fib;
		
	}
	
	public static void main(String args[]) {
		FibonacciIterative fib = new FibonacciIterative();
		
Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a non negative number: ");
		int n = scn.nextInt();
		n = n+1;
		
		System.out.println(fib.fibonacciIterative(n));
	}

}
