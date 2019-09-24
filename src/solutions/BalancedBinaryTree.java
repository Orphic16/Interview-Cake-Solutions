package solutions;

import utils.BinaryTreeNode;

import java.util.Stack;

public class BalancedBinaryTree {	
	public static boolean isSuperBalanced(BinaryTreeNode root) {
		int minLeafDepth = Integer.MAX_VALUE;
		int maxLeafDepth = Integer.MIN_VALUE;
		
		Stack<NodeInfo> nodes = new Stack<NodeInfo>();
		nodes.push(new NodeInfo(root, 0));
		
		while(!nodes.isEmpty()) {
			NodeInfo nodeInfo = nodes.pop();
			BinaryTreeNode node = nodeInfo.node;
			int depth = nodeInfo.depth;
			
			if (node.left == null && node.right == null) {
				minLeafDepth = Math.min(minLeafDepth, depth);
				maxLeafDepth = Math.max(maxLeafDepth, depth);
					
				if(maxLeafDepth - minLeafDepth > 1) {
					return false;
				}
			} else {
				if (node.left != null) {
					nodes.push(new NodeInfo(node.left, depth+1));
				}
				
				if (node.right != null) {
					nodes.push(new NodeInfo(node.right, depth+1));
				}	
			}
		}
		
		return true;
	}
	
	public static class NodeInfo
	{
		public NodeInfo(BinaryTreeNode node, int depth){
			this.node = node;
			this.depth = depth;
		}

		public BinaryTreeNode node;
		public int depth;
	}
}