import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class x {

	public static void main(String[] args) {
		int[] numbers = IntStream.iterate(2, n -> n * 2).limit(10).toArray();
		System.out.println(Arrays.toString(numbers));
		System.out.println("Hello");
	}

}
