package TestOfString;

public class ReverseString {

	public static void main(String[] args) {		
        String name = "Vijay Dinanath Chauhan";
        
        String reversed = new StringBuilder(name).reverse().toString();
        
        System.out.println("Original: " + name);
        System.out.println("Reversed: " + reversed);
    }
}
