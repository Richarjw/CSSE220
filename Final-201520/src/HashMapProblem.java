import java.util.ArrayList;
import java.util.HashMap;

/**
 * A single HashMap problem worth 5 points
 * 
 * @author wilkin
 *
 */
public class HashMapProblem {
	
	
	/**
	 * Using an ArrayList of Strings, we want to track the letter count for
	 * every word.  To do this, we will map an integer (the letter count) to
	 * an array list of words for each of the respective letter counts.
	 * 
	 * For Example:
	 * Given the ArrayList: ["Hello", "there", "how", "are", "you", 
	 *                       "doing", "I". "am", "fantastic"]
	 * The HashMap would contain:
	 * 		{(1, ["I"]), (2, ["am"]), (3, ["how", "are", "you"]), 
	 *       (5, ["Hello", "there", "doing"]), (9, ["fantastic"])}
	 * 
	 * You may assume that all the words in the ArrayList are unique, that is
	 * a particular word only appears in the list once.
	 * 
	 * @param words an ArrayList of individual words as Strings
	 * @return a HashMap that maps word letter count to an ArrayList of words which
	 *         contain that many letters
	 */
	public static HashMap<Integer, ArrayList<String>> letterCountToWords(ArrayList<String> words) {
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer,ArrayList<String>>();
		String longestWord = "";
		for(int i = 0;i < words.size();i++){
			if(words.get(i).length()>longestWord.length())
				longestWord = words.get(i);
		}
		for(int i = 1;i <longestWord.length()+1;i++){
			ArrayList<String> temp = new ArrayList<String>();
			for(int j = 0; j<words.size();j++){
				if(words.get(j).length()==i){
					temp.add(words.get(j));
					map.put(i,temp);
				}
			}
		}
		
		
		return map;
	}
}
