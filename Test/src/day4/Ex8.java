package day4;

public class Ex8 {

	public static void main(String[] args) {
		String str1 = "Red is favorite color.";
		 String str2 = "Orange is also my favorite color.";
		 // The String to check the above two Strings to see
		 // if they start with this value (Red).
		 String startStr = "Red";
		 // Do either of the first two Strings start with startStr?
		 boolean starts1 = str1.startsWith(startStr);
		 boolean starts2 = str2.startsWith(startStr);
		 // Display the results of the startsWith calls.
		 System.out.println( str1 + " starts with " +
		 startStr + "? " + starts1);
		 System.out.println(str2 + " starts with " +
		 startStr + "? " + starts2);


	}

}
