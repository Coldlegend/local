public class InfiniteRandom {
	public static void main(String[] args) {

		int count = 0;
		while (true) {
			int data = (int) (Math.random() * 50);
			count++;
			System.out.println(data);
			if (data == 0) {
				break;
			}
		}
		System.out.println("Number of rolls: " + count);
	}
}