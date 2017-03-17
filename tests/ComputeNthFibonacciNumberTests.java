import static org.junit.Assert.*;
import org.junit.Test;
import solutions.*;

public class ComputeNthFibonacciNumberTests {
	@Test
	public void test() {
		assertEquals(1, ComputeNthFibonacciNumber.fib(1));
		assertEquals(1, ComputeNthFibonacciNumber.fib(2));
		assertEquals(2, ComputeNthFibonacciNumber.fib(3));
		assertEquals(3, ComputeNthFibonacciNumber.fib(4));
		assertEquals(5, ComputeNthFibonacciNumber.fib(5));
		assertEquals(8, ComputeNthFibonacciNumber.fib(6));
		assertEquals(102334155, ComputeNthFibonacciNumber.fib(40));
	}
}
