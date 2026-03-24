package basic;

public class Array {
	
	public static void main(String[] args) {
		int[] numbers = {4,5,6,2,8};
		
		int firstHighest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for (int num : numbers) {
			if (num > firstHighest) {
				secondHighest = firstHighest ;
			    firstHighest = num;
			}else if (num > secondHighest && num != firstHighest) {
				secondHighest = num;
			}			
		}
		System.out.println("First Highest: " +firstHighest);
		System.out.println("Second Highest: " +secondHighest);
	}

}
