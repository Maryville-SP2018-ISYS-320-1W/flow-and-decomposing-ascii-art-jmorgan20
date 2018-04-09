/*
  	ISYS 320
  	Name(s):jason morgan
  	  	Date: 
*/

// 1. Your predicted output done with main this is message one this is message two  done with message two

public class Tricky {
	public static void main(String[] args) {
		message1();
		message2();
		System.out.println("Done with main.");
	}

	public static void message1() {
		System.out.println("This is message1.");
	}

	public static void message2() {
		System.out.println("This is message2.");
		message1();
		System.out.println("Done with message 2.");
	}
}

// 3. Were you correct? Explain any differences
// no, I did not notice that the message1 and2 were also before the done with
// main.
