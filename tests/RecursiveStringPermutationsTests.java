import org.junit.jupiter.api.Test;
import solutions.RecursiveStringPermutations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveStringPermutationsTests {
	@Test
	public void test() {
		List<String> permutations1 = RecursiveStringPermutations.getPermutations("c");
		assertEquals(1, permutations1.size());

		List<String> permutations2 = RecursiveStringPermutations.getPermutations("ca");
		assertEquals(2, permutations2.size());

		List<String> permutations3 = RecursiveStringPermutations.getPermutations("cat");
		assertEquals(6, permutations3.size());

		List<String> permutations4 = RecursiveStringPermutations.getPermutations("cats");
		assertEquals(24, permutations4.size());
	}
}
