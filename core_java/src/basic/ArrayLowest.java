package basic;

public class ArrayLowest {
	
	public static void main(String[] args) {
        int[] numbers = {0, 90, 20, 75, 5};

        int firstLowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < firstLowest) {
                secondLowest = firstLowest;
                firstLowest = num;
            } else if (num < secondLowest && num != firstLowest) {
                secondLowest = num;
            }
        }

        System.out.println("First Lowest: " + firstLowest);
        System.out.println("Second Lowest: " + secondLowest);
    }

}
