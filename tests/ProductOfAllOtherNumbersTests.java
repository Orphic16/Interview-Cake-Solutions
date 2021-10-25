import org.junit.jupiter.api.Test;
import solutions.ProductOfAllOtherNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductOfAllOtherNumbersTests {
	@Test
	public void test() {
		int[] result = ProductOfAllOtherNumbers.findProduct(new int[]{1, 7, 3, 4});
		assertEquals(84, result[0]);
		assertEquals(12, result[1]);
		assertEquals(28, result[2]);
		assertEquals(21, result[3]);
	}
}
