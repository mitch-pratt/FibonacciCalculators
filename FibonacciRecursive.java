package practical_5;

import java.util.Scanner;

public class FibonacciRecursive {
	
	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a non negative number: ");
		n = scn.nextInt();
		n = n+1;
		
		fibonacciCache = new long[n + 1];
		
		//for(int i = 0; i <= n; i++) {
		//System.out.print(fibonacci(i) + " ");
		
		
		System.out.println(fibonacci(n));
		
	}

	private static long fibonacci(int n) {
if(n <= 1) {
	return n;
}

if(fibonacciCache[n] != 0) {
	return fibonacciCache[n];
}

		long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
		fibonacciCache[n] = nthFibonacciNumber;
		return nthFibonacciNumber;
	}

}
