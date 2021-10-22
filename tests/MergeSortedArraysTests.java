import org.junit.jupiter.api.Test;
import solutions.MergeSortedArrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortedArraysTests {
	@Test
	public void test() {
		int[] array1 = new int[]{1, 3, 5};
		int[] array2 = new int[]{2, 4, 6, 7};

		int[] result = MergeSortedArrays.merge(array1, array2);

		assertEquals(7, result.length);
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
		assertEquals(3, result[2]);
		assertEquals(4, result[3]);
		assertEquals(5, result[4]);
		assertEquals(6, result[5]);
		assertEquals(7, result[6]);
	}

	@Test
	public void test_first_list_higher() {
		int[] array1 = new int[]{2, 4, 6, 7};
		int[] array2 = new int[]{1, 3, 5};

		int[] result = MergeSortedArrays.merge(array1, array2);

		assertEquals(7, result.length);
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
		assertEquals(3, result[2]);
		assertEquals(4, result[3]);
		assertEquals(5, result[4]);
		assertEquals(6, result[5]);
		assertEquals(7, result[6]);
	}
}
