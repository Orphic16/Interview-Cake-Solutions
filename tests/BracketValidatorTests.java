import static org.junit.Assert.*;
import org.junit.Test;
import solutions.*;

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
	public void testInvalidChar() {
		assertFalse(BracketValidator.isValid("[{(A)}]"));
	}
}
