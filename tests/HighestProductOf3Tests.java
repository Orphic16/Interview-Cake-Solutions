import static org.junit.Assert.*;
import org.junit.Test;
import solutions.*;

public class HighestProductOf3Tests {
	@Test
	public void testIncreasing() {
		int[] values = new int[]{1, 2, 3, 4, 5, 6};
		assertEquals(120, HighestProductOf3.highestProductOf3(values));
	}
	
	@Test
	public void testDecreasing() {
		int[] values = new int[]{6, 5, 4, 3, 2, 1};
		assertEquals(120, HighestProductOf3.highestProductOf3(values));
	}
	
	@Test
	public void testNegatives() {
		int[] values = new int[]{-10, -10, 1, 3, 2};
		assertEquals(300, HighestProductOf3.highestProductOf3(values));
	}
	
	@Test
	public void testNegatives2() {
		int[] values = new int[]{1, 10, -5, 1, -100};
		assertEquals(5000, HighestProductOf3.highestProductOf3(values));
	}
}
