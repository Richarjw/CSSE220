
public class HW1 {

	/*
	 * DONE: Write a function from scratch down below here.  The function should 
	 * take 3 whole numbers (e.g. no fractions) and return true if exactly 2 of the
	 * three are even.  For example:
	 * 
	 * twoEven(3,2,6) returns true because 2 and 6 are even
	 * twoEven(2,4,6) returns false because all three are even, not just 2
	 * twoEven(3,99,100) returns false because only 100 is even
	 * 
	 * Hint: take a look at section 5.7 in your textbook for some more
	 * examples of boolean functions like AND and NOT.  The rest of chapter
	 * 5 might be good too if you're a bit confused.
	 * 
	 * Be sure to add appropriate Javadoc comments for your function
	 */
	private static boolean twoEven(int a,int b,int c) {
		/*this checks to see if each given number is even or odd.
		*it will count each number that is even and return if two values
		*are even or not.
		**/
		
		int count = 0;
		if(a%2==0)
			count++;
		if(b%2==0)
			count++;
		if(c%2==0)
			count++;
		return count==2;
		
	}
	public static void main(){
		HW1 test = new HW1();
		System.out.println(test.twoEven(3,2,6));
		//should print True
		System.out.println(test.twoEven(2,4,6));
		//should print False
		System.out.println(test.twoEven(3,99,100));
		//should print False
		
	}
	
	/*
	 * DONE: Either before or after your write your function, write
	 * a main that tests your function and shows it working.
	 * 
	 */
}
