package solutions;

import java.util.Stack;

public class LargestStack {
	private Stack<Integer> s = new Stack<>();
	private Stack<Integer> max_stack = new Stack<>();

	public void push(int number) {
		s.push(number);
		if (max_stack.isEmpty() || number >= max_stack.peek()) {
			max_stack.push(number);
		}
	}

	public int pop() {
		int number = s.pop();
		if (max_stack.peek() == number) {
			max_stack.pop();
		}

		return number;
	}

	public int get_max() {
		return max_stack.peek();
	}
}
