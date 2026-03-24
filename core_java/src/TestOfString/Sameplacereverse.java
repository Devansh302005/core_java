package TestOfString;

public class Sameplacereverse {

	public static void main(String[] args) {
        String name = "Vijay Dinanath Chaouhan";
        
        char[] chars = name.toCharArray();
        
        int start = 0;
        int end = chars.length - 1;
        
        while (start < end) {
            // Swap characters
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            
            start++;
            end--;
        }
        
        // Convert back to string
        name = new String(chars);
        
        System.out.println("Reversed String: " + name);
    }
}
