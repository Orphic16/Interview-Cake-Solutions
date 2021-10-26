package solutions;

public class ReverseStringInPlace {
	public static String reverse(String str) {
		char[] chars = str.toCharArray();

		int front = 0;
		int back = str.length() - 1;

		while (front < back) {
			char f = chars[front];
			char b = chars[back];

			chars[front] = b;
			chars[back] = f;

			front++;
			back--;
		}

		return String.valueOf(chars);
	}
}