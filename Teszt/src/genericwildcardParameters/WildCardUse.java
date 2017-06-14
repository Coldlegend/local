package genericwildcardParameters;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {
	static void printList(List<?> list) {
		for (Object l : list)
			System.out.println("[" + l + "]");
	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(15);
		printList(intList);

		List<String> strList = new ArrayList<>();
		strList.add("20");
		strList.add("25");
		printList(strList);
	}
}