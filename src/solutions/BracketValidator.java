package solutions;

import java.util.Stack;

public class BracketValidator {
	public static boolean isValid(String s) {
		Stack<Character> chars = new Stack<Character>();
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				chars.push(ch);
			} else if (!chars.isEmpty() && (ch == ')' || ch == '}' || ch == ']')) {
				char left = chars.pop();
				if ((ch == ')' && left != '(') || (ch == '}' && left != '{') || (ch == ']' && left != '[')) {
					return false;
				}
			} else {
				return false;
			}
		}
		
		if (!chars.isEmpty()) {
			return false;
		}
		
		return true;
	}
}
