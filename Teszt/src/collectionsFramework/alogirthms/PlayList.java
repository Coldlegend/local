package collectionsFramework.alogirthms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PlayList {
	public static void main(String[] args) {
		// let's create a lost of some Micheal Jackson's songs
		List<String> playList = new LinkedList<String>();
		playList.add("Rock With You - 1979");
		playList.add("Billie Jean - 1983");
		playList.add("Man In the Mirror - 1988");
		playList.add("Black Or White - 1991");
		System.out.println("The original playlist of MJ's songs");
		System.out.println(playList);

		System.out.println("\nThe reversed playlist");
		Collections.reverse(playList);
		System.out.println(playList);

		System.out.println("\nNow after shuffling the playlist");
		Collections.shuffle(playList);
		System.out.println(playList);

		System.out.println("\nSort the songs by their names");
		Collections.sort(playList);
		System.out.println(playList);

		System.out.println("Is may favourite song Black or White - 1991 present in the list?");
		String blockOrWhiteSong = "Black or White - 1991";
		int index = Collections.binarySearch(playList, blockOrWhiteSong);
		if (index >= 0)
			System.out.printf("Yes, its the %d song \n,", (index + 1));
		else
			System.out.println("No, its not there in the list  \n");
		System.out.println("\nLet me forward by two songs (rotate list)");
		Collections.rotate(playList, 2);
		System.out.println(playList);
	}
}
