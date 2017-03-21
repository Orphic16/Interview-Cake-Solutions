import static org.junit.Assert.*;
import org.junit.Test;
import solutions.*;

public class FindInOrderedSetTests {
	@Test
	public void test() {
		int[] values = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };		
		assertTrue(FindInOrderedSet.binarySearch(values, 7));
	}
	
	@Test
	public void testMissingValue() {
		int[] values = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };		
		assertFalse(FindInOrderedSet.binarySearch(values, 9));
	}
}
