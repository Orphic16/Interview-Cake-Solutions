package solutions;

public class FindInOrderedSet {
	public static boolean binarySearch(int[] values, int n) {
		return binarySearch(values, n, 0, values.length - 1);
	}
	
	public static boolean binarySearch(int[] values, int n, int minPos, int maxPos) {
		if (minPos > maxPos) {
			return false;
		}
		
		int newPos = (maxPos - minPos) / 2 + minPos;
		
		if (values[newPos] == n) {
			return true;
		} else if (values[newPos] > n) {
			return binarySearch(values, n, minPos, newPos - 1);
		} else {
			return binarySearch(values, n, newPos + 1, maxPos);
		}
	}
}
