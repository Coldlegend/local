package genericClasses;

public class TestPair{
	public static void main (String[] args){
		PairOfT<Integer, String> pair = new PairOfT<>(1, "a");
		System.out.println(pair.getFirst() + " " + pair.getSecond());

	}
}