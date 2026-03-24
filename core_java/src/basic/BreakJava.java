package basic;

public class BreakJava {


	public static void main (String[] args ) {
		for (int i = 1; i <= 100; i++) {
			if (i==50) {
				break; // exit loop when i is 50
			}	
			System.out.println("Number:" + i); 
		}
	}
	
}
