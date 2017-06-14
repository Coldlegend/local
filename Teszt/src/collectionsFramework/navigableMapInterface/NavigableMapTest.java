package collectionsFramework.navigableMapInterface;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
	public static void main(String[] args) {
		NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();
		examScores.put(80, "Sophia");
		examScores.put(75, "Isabella");
		examScores.put(20, "Eva");
		examScores.put(0, "Mary");
		examScores.put(95, "Emma");

		System.out.println("The data in the map is: " + examScores);
		System.out.println("The data desc order is: " + examScores.descendingMap());
		System.out.println("Details of those who passed the exam: " + examScores.tailMap(40));
		System.out.println("The lowest score is: " + examScores.firstEntry());

	}

}