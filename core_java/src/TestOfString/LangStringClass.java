package TestOfString;

public class LangStringClass {

public static void main(String[] args) {
		
		String name = "Vijay Dinanath Chauhan";
		
		System.out.println("String Lenth: " + name.length());
		System.out.println("7th character is: " + name.charAt(13));
		System.out.println("'Dina' index is: " + name.indexOf("Dina"));
		System.out.println("First 'i' position: " + name.indexOf('i'));
		System.out.println("Last 'i' position: " + name.lastIndexOf('i'));
		System.out.println("'a' is replaced by 'u': " + name.replace('a','u'));		
		System.out.println("Lowercase: " + name.toLowerCase());
		System.out.println("Uppercase: " + name.toUpperCase());
		System.out.println("Starts with 'Vijay': " + name.startsWith("Vijay"));
		System.out.println("Ends with 'han': " + name.endsWith("han"));
		System.out.println("Substring from index 6: " + name.substring(14));
	}
}
