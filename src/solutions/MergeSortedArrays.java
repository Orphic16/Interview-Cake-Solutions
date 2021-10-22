package solutions;

public class MergeSortedArrays {
	public static int[] merge(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];
		int pos1 = 0;
		int pos2 = 0;
		int pos3 = 0;

		while (pos1 < array1.length && pos2 < array2.length) {
			if (array1[pos1] < array2[pos2]) {
				result[pos3++] = array1[pos1++];
			} else {
				result[pos3++] = array2[pos2++];
			}
		}

		while (pos1 < array1.length) {
			result[pos3++] = array1[pos1++];
		}

		while (pos2 < array2.length) {
			result[pos3++] = array2[pos2++];
		}

		return result;
	}
}