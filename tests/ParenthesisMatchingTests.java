import org.junit.jupiter.api.Test;
import solutions.ParenthesisMatching;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParenthesisMatchingTests {
	@Test
	public void test() {
		assertEquals(79, ParenthesisMatching.find_match("Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.", 10));

		assertEquals(7, ParenthesisMatching.find_match("(((())))", 0));
		assertEquals(6, ParenthesisMatching.find_match("(((())))", 1));
		assertEquals(5, ParenthesisMatching.find_match("(((())))", 2));
		assertEquals(4, ParenthesisMatching.find_match("(((())))", 3));

		assertEquals(-1, ParenthesisMatching.find_match("(", 0));
	}
}
