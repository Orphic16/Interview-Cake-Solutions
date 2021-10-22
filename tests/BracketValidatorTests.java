import org.junit.jupiter.api.Test;
import solutions.BracketValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketValidatorTests {
	@Test
	public void test() {
		assertTrue(BracketValidator.isValid("[{()}]"));
	}
	
	@Test
	public void testUnbalanced() {
		assertFalse(BracketValidator.isValid("[[{()}]"));
	}

	@Test
	public void testUnbalanced2() {
		assertFalse(BracketValidator.isValid("[{()}]]"));
	}

	@Test
	public void testUnbalanced3() {
		assertFalse(BracketValidator.isValid("[)"));
	}
	
	@Test
	public void testInvalidChar() {
		assertFalse(BracketValidator.isValid("[{(A)}]"));
	}
}
