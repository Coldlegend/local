package collectionsFramework.dequeInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class SplQueue {
	private Deque<String> splQ = new ArrayDeque<>();

	public void addInQueue(String costumer) {
		splQ.addLast(costumer);
	}

	public void removeFront() {
		splQ.removeFirst();
	}

	public void removeBack() {
		splQ.removeLast();

	}

	public void printQueue() {
		System.out.println("Special queue contains: " + splQ);
	}
}
