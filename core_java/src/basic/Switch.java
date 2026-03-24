package basic;

public class Switch {
	
	public static void main(String[] args) {
		int number = 8;

		switch (number) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tus");
			break;
		case 3:
			System.out.println("Wen");
			break;
		case 4:
			System.out.println("Thus");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;

		default:
			 System.out.println("Sunday");;
		}
	}
}
