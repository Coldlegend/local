package genericMethods;

import java.util.ArrayList;
import java.util.List;

public class UtilitiesTest {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(30);
		System.out.println("The original list: " + intList);
		Utilities.fill(intList, 50);
		System.out.println("The list after Utilities.fill() called: " + intList);
	}
}