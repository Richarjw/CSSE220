import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * MOST OF THESE PROBLEMS SHOULD BE DONE INDIVIDUALLY
 * One of them you can do with a partner 
 * 
 * Some practice problems with 2d arrays and hashmaps
 * Actually includes 6 regular problems and one bonus problem
 *
 * @author hewner.
 *         Created Dec 31, 2013.
 *  note: I had a struggle with the hashmap questions. I lost them because I was ignorant and forgot to svn it earlier. 
 */

public class SixMapAnd2DArrayHomework {
	
	/**
	 * Given one string, return the most common character.
	 * 
	 * Example:
	 *   mostCommonCharacter("aaab") returns 'a'
	 *   mostCommonCharacter("abcbcdc") returns 'c'
	 * 
	 * You can assume that your string will not be empty and that
	 * one character will be more common than all the others (i.e. there
	 * won't be a tie for the most common character)
	 * 
	 * Your solution should use hashmaps, NOT nested for loops.
	 * You'll need one for loop though.
	 *
	 * @param input - string to find most common character of
	 * @return most common character
	 * 
	 */
	public static char mostCommonCharacter(String input) {
		int highest = 0;
		char commonChar = 'z';
		HashMap<Character, Integer> character = new HashMap<Character,Integer>();
		for(int i = 0; i < input.length(); i++)
		{
			char let = input.charAt(i);
			if(character.containsKey(let))
			{
				int temp = character.get(let);
				character.put(let,temp + 1)
			}
			else
			{
				character.put(let,1);
			}
		}
		for(Map.Entry<Character,Integer> entry : character.entrySet())
		{
			int test = (int) entry.getValue();
			if(test >highest)
			{
				highest = (int) entry.getValue();
				commonChar = (char) entry.getKey();
			}
			
		}
		return commonChar;

		
	}
	
	/**
	 * 
	 * Reverses (i.e. exchanges the keys and values) a hashmap which 
	 * may contain multiple keys with the same value.  Because of this,
	 * the values of the reversed map will be a list.
	 * 
	 * 
	 * For example:
	 * {1=A,2=A,3=B} yields {A=[1,2], B=[3]}
	 * 
	 * The initial hashmap maps Integers to Strings.
	 * The reversed hashmap will map Strings to ArrayLists of Integers/
	 * 
	 * @param initialMap the HashMap to be reversed
	 * @return a copy of the hashmap with keys and values exchanged
	 */
	public static HashMap<String,ArrayList<Integer>> reverseHashmap(HashMap<Integer,String> initialMap) {
		HashMap<String, ArrayList<Integer>> map = new  HashMap<>();
		for(Map.Entry entryTop : initialMap.entrySet())
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			String newKeyset = (String) entryTop.getValue();
			for(Map.Entry entry : initialMap.entrySet())
			{
				if (entry.getValue() == entryTop.getValue()) {
                    list.add((Integer) entry.getKey());
                    map.put(newKeyset, list);

			}
			}
		}
		return map;
		
		
	}
	
	/**
	 * THIS PROBLEM CAN BE DONE WITH A PARTNER.  It's a little tricky.
	 * If you do work with a partner, be sure to note in a comment
	 * who you worked with.
	 * 
	 * Given a map of people to their mothers, returns the common
	 * female ancestor of two people (tracking only the mother's line).
	 * 
	 * So for example, imagine a family tree (mothers only) that looks like this:
	 * 
	 *    E-+---\        G
	 *   /   \   \      / \
	 *  A    B    C    H   I
	 *      / \
	 *     D   F
	 * 
	 * So B is the mother of D and F.  E is D and F's maternal grandmother, etc.
	 * 
	 * This would be represented in a map like this:
	 * 
	 * {E=null,A=E,B=E,C=E,D=B,F=B,G=null,H=G,I=G}
	 *  
	 * getCommonMother(map,D,F) yields B
	 * getCommonMother(map,D,C) yields E
	 * getCommonMother(map,E,F) yields E
	 * getCommonMother(map,D,I) yields null (because D and I are not related)
	 *  
	 * @param motherMap map of a person's name to their mother's name
	 * @param person1 
	 * @param person2
	 * @return common female ancestor of both people, or null if no common ancestor exists
	 */
	public static String getCommonMother(HashMap<String,String> motherMap, String person1, String person2) {
		
		return null;
	}
	
	/**
	 * 
	 * Given a square array, determines if is diagonal
	 * That is, returns true if all values in the array are 0 
	 * except the main diagonal.  The main diagonal is entries of the form
	 * data[i][j] where i == j.  Elements on the main
	 * diagonal can be 0 or any other number.
	 * 
	 * Examples:
	 * {{1,0,0},
	 *  {0,2,0}
	 *  {0,0,3}} yields true
	 *  
	 * {{1,0,9},
	 *  {0,2,0},
	 *  {0,0,3}} yields false because 0,2 is nonzero
	 * 
	 * {{0,0,0},
	 *  {0,0,0},
	 *  {0,0,3}} yields true because there can be 0
	 *                  entries on the diagonal if desired
	 * @param data input array
	 * @return true if it is diagonal, false otherwise
	 */
	public static boolean isDiagonal(int[][] data) {
		
		for(int i = 0;i < data.length;i++)
		{
			for(int j = 0; j<data[i].length;j++)
			{
				if ((j!=i)&&(data[i][j]!=0))
						return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * Given a 2D array populated with a sequence of characters 
	 * that wrap from the rightmost position to the leftmost position 
	 * on the next row, find the length the longest sequence of repeated 
	 * characters. 
	 * 
	 * For example
	 * 
	 * abba
	 * dafa
	 * 
	 * Has a longest sequence of 2 for the 2 repeated
	 * bs
	 * 
	 * 2 Bs yield the longest repeat sequence here. Note that the As do not 
	 * follow after each other and hence, do not get considered.
	 * 
	 * The array is considered to "wrap" 
	 * from the rightmost position to the leftmost
	 * position on the next line.
	 * 
	 * For example:
	 * 
	 * abcdd
	 * ddefg
	 * 
	 * Is considered to have a longest sequence of 4
	 * because the two ds on the right "wrap around"
	 * to connect with the two ds on the next line 
	 * 
	 * @param data
	 * @return the length of the longest sequence
	 */

	public static int longestRepeatSequence(char[][] data) {
		int count = 1;
		int longest = 1;
		for(int i = 0; i < data.length; i++)
			for(int j= 0; j < data[i].length; j++)
			{
				//System.out.println(count);
				//System.out.println(longest);
				if(j==data[i].length-1&&i!= data.length-1&&data[i][j] == data[i+1][0])
					count++;
				else if(j!= data[i].length-1&&data[i][j] == data[i][j+1])
					count++;
				else if(count>longest){
					longest = count;
					count=1;
			}
			}
		return longest;
	}
	
	
	/**
	 * Given A specific starting position and distance
	 * returns a 10x10 character array with all positions
	 * that are less than or equal to that manhattan distance 
	 * from the starting position marked with an x.
	 * 
	 * Recall the manhattan distance is the distance
	 * in terms of number of direct steps North South East West.
	 *
	 * You can compute the manhanttan distance with this formula
        * distance = |x1 - x2| + |y1 - y2|
	 * 
	 * Unmarked cells should be filled with a period '.'
	 * 
	 * For example, given row=1,col=1,distance 1
	 * .x........
	 * xxx.......
	 * .x........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * 
	 * For example, given row=1,col=6,distance 2
	 * .....xxx..
	 * ....xxxxx.
	 * .....xxx..
	 * ......x...
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........
	 * ..........

	 * 
	 * @param row starting position row
	 * @param col starting position col
	 * @param distance
	 * @return new 10x10 char array with correct squares marked
	 */
	public static char[][] distanceArray(int row, int col, int distance) {
		char[][] arg = new char[10][10];
		for(int i = 0; i < arg.length; i++)
			for(int j = 0; j < arg[i].length; j++)
			{
				if(Math.abs(row-i)+Math.abs(col -j)<= distance)
				{
					arg[i][j] = 'x';
				}
				else
					arg[i][j] = '.';
			}
		return arg;
	}
	
	/**
	 * BONUS: Extra credit problem
	 * 
	 * Feel free to skip this one if you don't have time.
	 * It's a little harder.
	 * 
	 * You are given a map indicating the elevation of
	 * a small area like a desk.  A ball is placed on the desk.
	 * The ball will roll downhill going north south east or west.
	 *
	 * The ball always starts at position 1,1
	 *
	 * It will always choose the path of steepest descent.
	 * It will eventually come to rest when it is at a position
	 * where all neighboring positions are higher/equal.  
	 * Return the elevation of that position.
	 * 
	 * You can assume that map will be such that the ball
	 * will always come to rest without moving through an edge
	 * 
	 * You can assume there will always be one steepest
	 * position for the ball to go to
	 * 
	 * For example, in an array like this:
	 * 9999
	 * 9549
	 * 9999 yields 4
	 * The ball would start in 1,1 (5) rolls to 4 and stops
	 * 
	 * 99999999999
	 * 98711111199
	 * 96999999999
	 * 95444444399
	 * 99999999999 yields 4
	 * The ball starts at 8, follows steepest decent to 6
	 * Then at the first 4 there is no lower position so it
	 * stops
	 * 
	 * @param map map indicating elevation
	 * @return height where the ball stops
	 */
	public static int ballRestElevation(int[][] map) {
		return 0;
	}
}