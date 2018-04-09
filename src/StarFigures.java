/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 4. Your pseudocode algorithm for how to break down the figure


public class StarFigures {

	public static void main(String[] args) {
		drawImageOne();
		drawBlankLines();
		drawImageTwo();
		drawBlankLines();
		drawImageThree();		

	}
	private static void drawImageThree() {
		drawbar();
		drawline();
		drawstar();
	}
	private static void drawImageTwo() {
		drawline();
		drawstar();
		drawline();
	}
	private static void drawImageOne() {
		drawline();
		drawstar();
	}
	private static void drawBlankLines() {
		System.out.println();
		System.out.println();
	}
	public static void drawline() {
		System.out.println("*****");
		System.out.println("*****");
	}
	public static void drawstar() {
		System.out.println(" * *");
		System.out.println("  *");
		System.out.println(" * *");
	}
	public static void drawbar() {
		System.out.println("  *");
		System.out.println("  *");
		System.out.println("  *");
	}

}
