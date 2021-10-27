import org.junit.jupiter.api.Test;
import solutions.ReverseWords;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTests {
	@Test
	public void test() {
		assertEquals("if into the security recordings you go only pain will you find",
				ReverseWords.reverse("find you will pain only go you recordings security the into if"));
	}

	@Test
	public void reverseCharactersTest() {
		char[] word = "abcdefg".toCharArray();
		ReverseWords.reverseCharacters(word, 0, 6);

		assertEquals('g', word[0]);
		assertEquals('f', word[1]);
		assertEquals('e', word[2]);
		assertEquals('d', word[3]);
		assertEquals('c', word[4]);
		assertEquals('b', word[5]);
		assertEquals('a', word[6]);
	}
}
