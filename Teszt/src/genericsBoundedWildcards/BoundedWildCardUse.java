package genericsBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildCardUse {

	public static Double sum(List<? extends Number> numList) {
		Double result = 0.0;
		for (Number num : numList) {
			result += num.doubleValue();
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		List<Double> doubleList = new ArrayList<Double>();

		for (int i = 0; i < 5; i++) {
			intList.add(i);
			doubleList.add((double) (i * i));
		}
		System.out.println("intList is: " + intList);
		System.out.println("Sum of intList: " + sum(intList));
		System.out.println("doubleList is: " + doubleList);
		System.out.println("Sum of doubleList is: " + sum(doubleList));
	}
}