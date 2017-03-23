package solutions;

public class Shuffle {
	public static void inplaceShuffle(int[] array) {
		for(int i=array.length-1; i>=0; i--) {
			int index = (int)(Math.random() * i + 1);
			int temp = 	array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}
}
