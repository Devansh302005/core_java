package basic;

public class Continue {
	
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			
			if(i%2==0) {
				continue;// skip Odd numbers				
			}
			System.out.println("Even Number: " +i);
		}
	}
}
