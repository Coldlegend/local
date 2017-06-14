package genericList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTest {

	public static void main(String[] args) {

		//Raw Type
		List list = new LinkedList();
		list.add("First");
		list.add("Second");
		List<String> strList = list;
		for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();)
			System.out.println("Item: " + itemItr.next());

		
		//Generic- recommended
		List<String> strList2 = new LinkedList<>();
		strList2.add("First");
		strList2.add("Second");
		List list2 = strList2;
		for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();)
			System.out.println("Item: " + itemItr.next());
	}
}