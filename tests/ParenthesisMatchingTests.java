import org.junit.jupiter.api.Test;
import solutions.ParenthesisMatching;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParenthesisMatchingTests {
	@Test
	public void test() {
		assertEquals(79, ParenthesisMatching.findMatch("Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.", 10));

		assertEquals(7, ParenthesisMatching.findMatch("(((())))", 0));
		assertEquals(6, ParenthesisMatching.findMatch("(((())))", 1));
		assertEquals(5, ParenthesisMatching.findMatch("(((())))", 2));
		assertEquals(4, ParenthesisMatching.findMatch("(((())))", 3));

		assertEquals(-1, ParenthesisMatching.findMatch("(", 0));
	}
}
