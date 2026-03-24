package TestOfString;

public class HowmanytimecharRepeat {

	public static void main(String[] args) {
	      String name = "Vijay Dinanath Chaouhan";
	        
	        char[] chars = name.toCharArray();
	        
	        for (int i = 0; i < chars.length; i++) {
	            int count = 1;
	            
	            for (int j = i + 1; j < chars.length; j++) {
	                if (chars[i] == chars[j]) {
	                    count++;
	                    chars[j] = '0';  // mark as visited
	                }
	            }
	            
	            if (chars[i] != '0') {
	                System.out.println(chars[i] + " = " + count);
	            }
	        }
	    }
	
}
