package sort;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		int k;
		int n = array.length;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
					swapNumbers(i, k, array);
				}
			}
			printNumbers(array);
		}
	}

	private static void swapNumbers(int i, int k, int[] array) {
		int temp = array[i];
		array[i] = array[k];
		array[k] = temp;
	}

	private static void printNumbers(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] input = { 23, 52, 17, 65, 23, 100, 5, 0 };
		bubbleSort(input);
	}
}
