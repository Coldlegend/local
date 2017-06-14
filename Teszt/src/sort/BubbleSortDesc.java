package sort;

public class BubbleSortDesc {

	public static void main(String[] args) {
		int[] input = { 1, -5, 14, 62, 0,100,11,23,3,-15 };
		doBubbleSort(input);
	}

	public static void doBubbleSort(int[] array) {
		for (int m = array.length; m >= 0; m--) {
			for (int i = 0; i < array.length - 1; i++) {
				int k = i + 1;
				if (array[i] < array[k]) {
					swapNumbers(i, k, array);
				}
			}
			printArray(array);
		}
	}

	private static void swapNumbers(int i, int k, int[] array) {
		int temp = array[i];
		array[i] = array[k];
		array[k] = temp;
		
	}
	
	private static void printArray(int[] array){
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", " );
		}
		System.out.println("\n");
	}

}