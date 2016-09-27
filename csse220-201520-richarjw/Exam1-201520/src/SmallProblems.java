import java.util.ArrayList;

/**
 * Contains a set of small problems on various topics that were covered during the first 3 weeks of class.
 * Of the 7 below, CHOOSE 5 (you will not receive any extra credit for completing more than 5).
 * 
 * Once you have completed 5, edit the file "SmallProblemsTest.java" and comment out
 * the two unit tests that correspond to the 2 functions you did not implement.
 * YOU MAY NOT COMMENT OUT MORE THAN 2 OF THE & UNIT TEST METHODS.  IF YOU COMMENT
 * OUT MORE THAN 2, THAT MAY RESULT IN LOSING SOME POINTS.
 *
 * @author TODO <PUT_YOUR_NAME_HERE>.
 *         Created Dec. 14, 2014.
 */
public class SmallProblems {
	

	/**
	 * This method returns true if the first instance of the letter
	 * 'i' (case insensitive, so 'i' or 'I') comes before the first
	 * instance of the letter 'e' (or 'E').  If 'i' is not in the string
	 * but 'e' is, return false.  If neither are in the string, return true.
	 * 
	 * Examples:
	 * "receive" -> false
	 * "retrieve" -> false
	 * "skies" -> true
	 * "ie" -> true
	 * "neat" -> false
	 * "arm" -> true
	 * "" - > true
	 * 
	 * @param test
	 * @return
	 */
	public static boolean iBeforeE(String test) {
		int first = -1;
		int second = -1;
		for(int i = 0; i < test.length();i++)
		{
			if(test.charAt(i)== 'i'|| test.charAt(i)=='I' )
			{
				first = i;
				break;
			}
		}
		for(int i = 0; i < test.length();i++)
		{
			if(test.charAt(i) == 'e' || test.charAt(i)== 'E')
			{
				second = i;
				break;
			}
		}
		if(first==-1 && second ==-1)
			return true;
		
		if(first==-1)
			return false;
		if(first < second)
			return true;
		else
			return false;
	}
	
	/**
	 * Find the closest power of 2 to get the number value.  This method
	 * should return a whole number WITHOUT using the Math.log function.
	 * If number is equally between 2^x and 2^y, then return the max of x 
	 * and y; otherwise, if number is closer to 2^x than 2^y, regardless 
	 * whether x is larger or smaller, return x.
	 * 
	 * This MUST work for any power of 2 which may fit in an int data type.
	 * 
	 *  Examples:
	 *  1 -> 0    (since 2^0 == 1)
	 *  2 -> 1    (since 2^1 == 2)
	 *  3 -> 2    (since 2^1 and 2^2 are equally close, use max -- 2)
	 *  4 -> 2    (since 2^2 == 4)
	 *  5 -> 2    (since 2^2 is closer to 5 than 2^3)
	 *  6 -> 3    (since 2^2 and 2^3 are equally close, use max -- 3)
	 *  7 -> 3    (since 2^3 is closest to 7)
	 *  8 -> 3
	 *  3458392 -> 22   (since 2^22 is closest to 3458392)
	 *  
	 * @param number
	 * @return the power of 2 which makes 2 to that power the closest to "number"
	 */
	public static long closestPowerOf2(long number) {
		//started the power at 1 so the if statement can check if
		// it had already passed and is less than 0.
		int temp = 2;
		int pow = 1;
		//some arbitrary number for the for loop to keep it going.
		for(int i = 0; i < 1000; i++)
		{
			//checks if the 2^pow value is greater than number
			if(temp > number)
				break;
			temp = temp*2;
			pow++;
		}
		//checks which power is closer to the number.
		if(number-(temp/2) < temp-number)
		{
			return pow-1;
		}
		else
			return pow;
			
	}
	
	/**
	 * Returns the number of instances that "XX" appears in the input string.
	 * This is case sensitive, and can overlap.
	 * 
	 * Examples:
	 * "" -> 0
	 * "X" -> 0
	 * "XX" -> 1
	 * "XXX" -> 2
	 * "XX X" -> 2
	 * "abcXXXcbaXoXX" -> 3
	 * 
	 * @param input
	 * @return the number of times the string "XX" appears in the input string
	 */
	public static int numberOfXX(String input) {
		int count = 0;
		for(int i = 0; i < input.length()-1; i++)
		{
			if(input.charAt(i)== 'X' && input.charAt(i+1)=='X')
				count++;
		}
		return count;
	}
	
	/**
	 * Takes an ArrayList of integers.
	 * 
	 * Returns an ArrayList that for each integer in the original ArrayList, counts 
	 * down that integer from the value to 0.
	 * 
	 * Examples:
	 * [1,3] yields [1,0,3,2,1,0]
	 * [2,2,0,0] yields [2,1,0,2,1,0,0,0]  NOTE: 0 is printed once
	 * [] yields []
	 * [2,4,6,8] yields [2,1,0,4,3,2,1,0,6,5,4,3,2,1,0,8,7,6,5,4,3,2,1,0]
	 * 
	 * You can either MODIFY the ArrayList that is passed in
	 * OR construct a new ArrayList and return that.  Either
	 * is fine.
	 * 
	 * @param original - list of integers to be counted down
	 * @return ArrayList with values counted down
	 */
	public static ArrayList<Integer> countDownX(ArrayList<Integer> list) {
		ArrayList<Integer> arg = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++)
		{
			for(int k = 0;k < list.get(i)+1; k++)
			{
				arg.add(list.get(i)-k);
			}
		}
		return arg;
	}
	
	/**
	 * Takes two arrays of strings, and returns a single integer array containing
	 * the length of each string in first the str1 array and then the str2 array.
	 * 
	 * Examples:
	 * str1 = {"Hello", "abc", "defg", "r"}
	 * str2 = {"bye", "jkl", "l", ""}
	 * 
	 * result = {5, 3, 4, 1, 3, 3, 1, 0}
	 * ____________________________________________
	 * str1 = {"", "", "4"}
	 * str2 = {"i8", "", "", "", "o9"}
	 * 
	 * result = {0, 0, 1, 2, 0, 0, 0, 2}
	 * 
	 * @param str1 an array of strings
	 * @param str2 another array of strings
	 * @return an integer array containing the length of each string array starting
	 * with str1 first
	 */
	public static int[] strLengths(String[] str1, String[] str2) {
		int k = str1.length + str2.length;
		int[] arg = new int[k];
		int start = 0;
		for(int i = 0; i < str1.length;i++)
		{
			arg[i] = str1[i].length();
		}
		for(int j = 0; j < str2.length; j++)
		{
			arg[str1.length+j]= str2[j].length();
		}
		return arg;
	}
	
	/**
	 * Returns a new array with every other value swapped with its neighbor.
	 * You can assume that the incoming array always has an even number
	 * of values. You may NOT alter the contents of the original array
	 * that is sent as a parameter.  If you do, you will lose credit.
	 * 
	 * Examples:
	 * {1, 2, 3, 4, 5, 6} -> {2, 1, 4, 3, 6, 5}
	 * {} -> {}
	 * {6, 0} -> {0, 6}
	 * {4, 111, 7509, 0} -> {111, 4, 0, 7509}
	 * 
	 * @param array
	 * @return
	 */
	public static int[] swapper(int[] array) {
		int[] arg = new int[array.length];
		for(int i = 0; i <= (array.length/2)-1; i++)
		{
			arg[2*i] = array[(2*i)+1];
			arg[(2*i)+1]= array[2*i];
		}
		return arg;
	}
	
	/**
	 * Returns the "equilibrium point" of the array.  The equilibrium point
	 * is when the sum of all the elements from array index 0 up to (but not
	 * including) the point is equal to the sum of all the elements from 
	 * the index after that point to the end of the array.  The value at
	 * the equilibrium point does not matter, and should not be factored in
	 * the solution.
	 * 
	 * You may assume that there is ALWAYS an equilibrium point, but if the 
	 * array is empty, return -1.
	 * 
	 * Examples:
	 * {2, 1, 4, 999, 1, 4, 2} -> 3   (since 2+1+4 == 1+4+2)  do not use 999
	 * {14, 6, 9, 5} -> 1             (since 14 == 9 + 5)     do not use 6
	 * {} -> -1
	 * {1, 2, 3, 4, 5, 1, 2, 3, 4} -> 4
	 * {10, 18, 33, 3, 5, 6, 4, 2, 8} -> 2   (since 10+18 == 3+5+6+4+2+8)
	 * {1, 1, 1, 1, 3} -> 3   (since 1+1+1 == 3)  do not use value 1 at index 3 
	 * 
	 * @param array
	 * @return
	 */
	public static int equilibrium(int[] array) {
		int before = 0;
		int after = 0;
		int equ = -1;
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j <= i-1; j++)
			{
				before = before + array[j];
			}
			for(int k = i+1; k < array.length; k++)
			{
				after = after + array[k];
			}
			//System.out.println(before);
			//System.out.println(after);
			if(before == after)
			{
				equ = i;
				break;
			}
			before = 0;
			after = 0;
		}
		return equ;
	}
}

