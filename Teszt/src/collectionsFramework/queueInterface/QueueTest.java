package collectionsFramework.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> loginSequence = new LinkedList<String>();
		loginSequence.add("Harrison");
		loginSequence.add("McCartney");
		loginSequence.add("Starr");
		loginSequence.add("Lennon");
		System.out.println("The loginsequence is: " + loginSequence);
		while (!loginSequence.isEmpty())
			System.out.println("Remoiving: " + loginSequence.remove());
	}
}
