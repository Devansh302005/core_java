package Date;


import java.util.Calendar;
import java.util.Date;

public class MAINTAINANCE {
    public static void main(String[] args) {
		
    	Calendar cal = Calendar.getInstance();
    	
    	for (int i = 1; i <= 6; i++) {
    		
    		cal.add(Calendar.DATE, 30);
    		
    	    Date nextEvent = cal.getTime();
    		
    		System.out.println(nextEvent);
    	}
	} 		
}
