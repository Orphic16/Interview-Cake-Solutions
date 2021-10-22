import org.junit.jupiter.api.Test;
import solutions.LargestStack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestStackTests {
	@Test
	public void test() {
		LargestStack l = new LargestStack();
		l.push(1);
		l.push(3);
		l.push(5);
		assertEquals(5, l.get_max());
		assertEquals(5, l.pop());

		assertEquals(3, l.get_max());
		assertEquals(3, l.pop());

		assertEquals(1, l.get_max());
		assertEquals(1, l.pop());
	}	
}
