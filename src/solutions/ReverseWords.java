package solutions;

public class ReverseWords {
	public static String reverse(String str) {
		char[] chars = str.toCharArray();

		reverseCharacters(chars, 0, chars.length - 1);

		int front = 0;

		for (int i=0; i<chars.length; i++) {
			if (chars[i] == ' ') {
				reverseCharacters(chars, front, i-1);
				front = i + 1;
			}
		}

		reverseCharacters(chars, front, chars.length - 1);

		return String.valueOf(chars);
	}

	public static char[] reverseCharacters(char[] chars, int front, int back) {
		while (front < back) {
			char f = chars[front];
			char b = chars[back];

			chars[front] = b;
			chars[back] = f;

			front++;
			back--;
		}

		return chars;
	}
}