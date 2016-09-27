package chatter;

/**
 * This runnable class should print:
 * 
 * Message 1 of 3
 * 
 * wait 2 seconds
 * 
 * Message 2 of 3
 * 
 * wait 2 seconds
 * 
 * Message 3 of 3....I'm exiting forever
 * 
 * and then it should exit
 * 
 */
public class ShortTalker implements Runnable {
	
	private String one;
	private String two;
	private String three;
	public ShortTalker(String mess1,String mess2, String mess3)
	{
		this.one = mess1;
		this.two = mess2;
		this.three = mess3;
		
	}
	public void run() {
		
			System.out.print(this.one);
			Thread.sleep(2000);
			System.out.print(this.two);
			Thread.sleep(2000);
			System.out.print(this.three);
			
		}
		
	}

	//Your awesome code goes here
}
