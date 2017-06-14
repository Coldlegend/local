package collectionsFramework.hashMapClass;

import java.util.HashMap;
import java.util.Map;

public class SpellChecker {
	public static void main(String[] args) {
		Map<String, String> misspeltWords = new HashMap<String, String>();
		misspeltWords.put("calender", "calendar");
		misspeltWords.put("tomatos", "tomatoes");
		misspeltWords.put("existance", "existence");
		misspeltWords.put("aquaintence", "acquaintence");
		String sentence = "Buy a calender for the year 2014";
		System.out.println("This given sentence is: " + sentence);
		for (String word : sentence.split("\\W+")) {
			if (misspeltWords.containsKey(word)) {
				System.out.println("The correct spelling for " + word + 
						" is: " + misspeltWords.get(word));
			}
		}
	}
}
