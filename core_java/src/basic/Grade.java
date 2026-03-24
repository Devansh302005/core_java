package basic;

public class Grade {
	
	public static void main(String[] args ) {
		
		int No = 63;

		if (No > 90)
		
			System.out.println("A Grade");
		
		else if ( No > 60)
			
			System.out.println( "B Grade" ); 
			
			else if ( No > 30)
				
				System.out.println("C Grade");
				 
			else if (No < 30 )
				System.out.println("Fail");
	}        
}
