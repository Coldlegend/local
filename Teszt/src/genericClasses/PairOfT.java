package genericClasses;

public class PairOfT<T1, T2> {
	T1 object1;
	T2 object2;

	PairOfT(T1 one, T2 two) {
		object1 = one;
		object2 = two;
	}

	public T1 getFirst() {
		return object1;
	}

	public T2 getSecond() {
		return object2;
	}
}