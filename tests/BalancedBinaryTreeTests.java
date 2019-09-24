import org.junit.jupiter.api.Test;
import solutions.BalancedBinaryTree;
import utils.BinaryTreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BalancedBinaryTreeTests {
	@Test
	public void test() {
		BinaryTreeNode root = new BinaryTreeNode(6);
		BinaryTreeNode left = root.insertLeft(3);
		left.insertLeft(1);
		left.insertRight(4);		
		
		assertTrue(BalancedBinaryTree.isSuperBalanced(root));
	}
	
	@Test
	public void testUnbalancedLeftTree() {
		BinaryTreeNode root = new BinaryTreeNode(6);
		root.insertRight(8);
		BinaryTreeNode left = root.insertLeft(3);
		left.insertLeft(1);
		left.left.insertLeft(0);
		
		assertFalse(BalancedBinaryTree.isSuperBalanced(root));
	}
	
	@Test
	public void testUnbalancedRightTree() {
		BinaryTreeNode root = new BinaryTreeNode(6);
		root.insertLeft(4);
		BinaryTreeNode right = root.insertRight(12);
		right.insertLeft(9);
		right.insertRight(14);
		right.right.insertRight(16);
		
		assertFalse(BalancedBinaryTree.isSuperBalanced(root));
	}
}
