import org.junit.jupiter.api.Test;
import solutions.MakingChange;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakingChangeTests {
	@Test
	public void test() {
		int[] denominations = new int[]{1, 2, 3 };
		ArrayList<String> list = MakingChange.permutate(4, denominations);
		
		assertEquals(4, list.size());
		assertEquals("3 1", list.get(0));
		assertEquals("2 2", list.get(1));
		assertEquals("2 1 1", list.get(2));
		assertEquals("1 1 1 1", list.get(3));
	}
	
	@Test
	public void test8() {
		int[] denominations = new int[]{1, 5, 10, 25, 100 };
		ArrayList<String> list = MakingChange.permutate(8, denominations);
		
		assertEquals(2, list.size());
		assertEquals("5 1 1 1", list.get(0));
		assertEquals("1 1 1 1 1 1 1 1", list.get(1));
	}
	
	@Test
	public void test12() {
		int[] denominations = new int[]{1, 5, 10, 25, 100 };
		ArrayList<String> list = MakingChange.permutate(12, denominations);
		
		assertEquals(4, list.size());
		assertEquals("10 1 1", list.get(0));
		assertEquals("5 5 1 1", list.get(1));
		assertEquals("5 1 1 1 1 1 1 1", list.get(2));
		assertEquals("1 1 1 1 1 1 1 1 1 1 1 1", list.get(3));
	}
	
	@Test
	public void test24() {
		int[] denominations = new int[]{1, 5, 10, 25, 100 };
		ArrayList<String> list = MakingChange.permutate(24, denominations);
		
		assertEquals(9, list.size());
		assertEquals("10 10 1 1 1 1", list.get(0));
		assertEquals("10 5 5 1 1 1 1", list.get(1));
		assertEquals("10 5 1 1 1 1 1 1 1 1 1", list.get(2));
		assertEquals("10 1 1 1 1 1 1 1 1 1 1 1 1 1 1", list.get(3));
		assertEquals("5 5 5 5 1 1 1 1", list.get(4));
		assertEquals("5 5 5 1 1 1 1 1 1 1 1 1", list.get(5));
		assertEquals("5 5 1 1 1 1 1 1 1 1 1 1 1 1 1 1", list.get(6));
		assertEquals("5 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1", list.get(7));
		assertEquals("1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1", list.get(8));
	}
	
	@Test
	public void test25() {
		int[] denominations = new int[]{1, 5, 10, 25, 100 };
		ArrayList<String> list = MakingChange.permutate(25, denominations);
		
		assertEquals(13, list.size());
		assertEquals("25", list.get(0));
		assertEquals("10 10 5", list.get(1));
		assertEquals("10 10 1 1 1 1 1", list.get(2));
		assertEquals("10 5 5 5", list.get(3));
		assertEquals("10 5 5 1 1 1 1 1", list.get(4));
		assertEquals("10 5 1 1 1 1 1 1 1 1 1 1", list.get(5));
		assertEquals("10 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1", list.get(6));
		assertEquals("5 5 5 5 5", list.get(7));
		assertEquals("5 5 5 5 1 1 1 1 1", list.get(8));
		assertEquals("5 5 5 1 1 1 1 1 1 1 1 1 1", list.get(9));
		assertEquals("5 5 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1", list.get(10));
		assertEquals("5 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1", list.get(11));
		assertEquals("1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1", list.get(12));
	}	
	
	@Test
	public void testCount() {
		int[] denominations = new int[]{1, 2, 3 };		
		assertEquals(4, MakingChange.count(4, denominations));
	}
	
	@Test
	public void testCount8() {
		int[] denominations = new int[]{1, 5, 10, 25, 100 };		
		assertEquals(2, MakingChange.count(8, denominations));
	}
	
	@Test
	public void testCount12() {
		int[] denominations = new int[]{1, 5, 10, 25, 100 };		
		assertEquals(4, MakingChange.count(12, denominations));
	}
	
	@Test
	public void testCount24() {
		int[] denominations = new int[]{1, 5, 10, 25, 100 };
		assertEquals(9, MakingChange.count(24, denominations));
	}
	
	@Test
	public void testCount25() {
		int[] denominations = new int[]{1, 5, 10, 25, 100 };
		assertEquals(13, MakingChange.count(25, denominations));
	}
}
