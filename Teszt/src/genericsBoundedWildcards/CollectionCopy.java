package genericsBoundedWildcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCopy {
	public static void main(String[] args) {
		List<? extends Number> intList = Collections.nCopies(5, new Integer(10));
		List<Object> objList = new ArrayList<Object>();
		for (int i = 0; i < 5; i++) {
			objList.add(i);

		}

		Collections.copy(objList, intList);
		System.out.println("The objList is: " + objList);
	}
}
