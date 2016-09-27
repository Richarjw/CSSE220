import java.util.HashMap;
//CONSIDER: 5/5

public class HashMapProblem {

	/* This function takes a HashMap of Strings to integers.  It increases the value of
	 * each integer by one.
	 * 
	 * For example:
	 * 
	 * {ab=1, xyz=5, cd=10} becomes {ab=2, xyz=6, cd=11}
	 * 
	 */
	@SuppressWarnings("boxing")
	public static void increaseHashmapValues(HashMap<String,Integer> input) {
		for(String key : input.keySet()){
			input.put(key,input.get(key)+1);
		}
			
		return;
	}
}
