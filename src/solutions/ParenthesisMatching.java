package solutions;

public class ParenthesisMatching {
	public static int findMatch(String sentence, int index) {
		int parens_counter = 1;

		for (int i=index+1; i<sentence.length(); i++) {
			if (sentence.charAt(i) == '(')
				parens_counter++;

			if (sentence.charAt(i) == ')') {
				parens_counter--;

				if(parens_counter == 0)
					return i;
			}
		}

		return -1;
	}
}