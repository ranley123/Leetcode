import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * @since: June 30th 2018
 * @level: easy
 * @order: 819
 * Find the most common word which is not in the banned list within a given string. Meanwhile, 
 * eliminate the capital letters into lower case
 * there is only one answer
 */
public class TheMostCommonWords {
	public String mostCommonWord(String paragraph, String[] banned) {
		Map<String, Integer> words = new HashMap<>();
		paragraph = paragraph.replaceAll("\\pP", "");
		paragraph = paragraph.toLowerCase();
		String[] things = paragraph.split(" ");

		for(String thing: things) {
			if(!hasWord(banned, thing)) {
				if(words.containsKey(thing)) {
					words.put(thing, words.get(thing) + 1);
				}
				else {
					words.put(thing, 1);
				}
			}
		}
		return get(words);
		/*
		 * Check if it is in the banned list:
		 * check after putting in the map via iterator
		 * check before putting in the map
		 */
		
	}
	//if have time try to do this way
	public Map<Integer, String> inverse(Map<String, Integer> map) {
		Set<Entry<String, Integer>> entries = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		HashMap<Integer, String> words = new HashMap<>();
		Entry<String, Integer> entry = null;
		while(iterator.hasNext()) {
			entry = (Entry<String, Integer>) iterator.next();
			String word = entry.getKey();
			int times = entry.getValue();
			//if the same times occurs, then it will be replaced 
			words.put(times, word);
		}
		return words;
	}

	public String get(Map<String, Integer> map) {
		Set<Entry<String, Integer>> entries = map.entrySet();
		String word = null;
		int max = 0;
		Entry<String, Integer> entry = null;
		
		if(entries != null) {
			Iterator<Entry<String, Integer>> iterator = entries.iterator();
			while(iterator.hasNext()) {
				entry = (Entry<String, Integer>) iterator.next();
				int times = entry.getValue();
				if(times > max) {
					word = entry.getKey();
					max = times;
					
				}
			}	
		}
		return word;
	}

	public boolean hasWord(String[] banned, String word) {
		for(String thing: banned) {
			if(thing.equals(word)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		TheMostCommonWords thing = new TheMostCommonWords();
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		System.out.println(thing.mostCommonWord(paragraph, banned));
	}


}
