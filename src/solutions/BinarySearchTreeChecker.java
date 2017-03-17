package solutions;

import utils.BinaryTreeNode;

public class BinarySearchTreeChecker {
	public static boolean isBst(BinaryTreeNode root) {
		return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isBst(BinaryTreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}
		
		if (root.value < min || root.value > max) {
			return false;
		}
		
		return isBst(root.left, min, root.value) && isBst(root.right, root.value, max);
	}
}