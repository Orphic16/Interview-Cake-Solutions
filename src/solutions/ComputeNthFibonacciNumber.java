package solutions;

import java.util.HashMap;

public class ComputeNthFibonacciNumber {
	static HashMap<Integer, Integer> lookup = new HashMap<Integer, Integer>();	
	public static int fib(int n) {
		if (n==1 || n==2) {
			return 1;
		}
		
		if (lookup.containsKey(n)) {
			return lookup.get(n);
		} else {
			lookup.put(n, fib(n-1) + fib(n-2));
		}
		
		return lookup.get(n);
	}
}
