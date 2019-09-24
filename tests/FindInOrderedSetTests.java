import org.junit.jupiter.api.Test;
import solutions.FindInOrderedSet;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindInOrderedSetTests {
	@Test
	public void test() {
		int[] values = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };		
		assertTrue(FindInOrderedSet.binarySearch(values, 7));
	}
	
	@Test
	public void testLastValue() {
		int[] values = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };		
		assertTrue(FindInOrderedSet.binarySearch(values, 8));
	}
	
	@Test
	public void testFirstValue() {
		int[] values = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };		
		assertTrue(FindInOrderedSet.binarySearch(values, 1));
	}
	
	@Test
	public void testMissingValue() {
		int[] values = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };		
		assertFalse(FindInOrderedSet.binarySearch(values, 9));
	}
}
