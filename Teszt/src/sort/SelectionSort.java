package sort;

public class SelectionSort {

	public static int[] doSelectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
				int smallerNumber = array[index];
				array[index] = array[i];
				array[i] = smallerNumber;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 43, 6423, 135, 7, 6, 35, 431, 0 };
		int[] array2 = doSelectionSort(array1);
		for (int i : array2) {
			System.out.print(i);
			System.out.println("\n");
		}
	}
}
