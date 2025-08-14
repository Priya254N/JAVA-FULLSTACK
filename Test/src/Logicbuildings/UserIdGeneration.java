package Logicbuildings;

public class UserIdGeneration {

	 public String userIdGeneration(String input1, String input2, int input3, int input4) {
	        String firstName = input1;
	        String lastName = input2;
	        String pin = String.valueOf(input3);
	        int n = input4;
	        String smallerName, longerName;
	        if (firstName.length() < lastName.length()) {
	            smallerName = firstName;
	            longerName = lastName;
	        } else if (lastName.length() < firstName.length()) {
	            smallerName = lastName;
	            longerName = firstName;
	        } else {
	            if (firstName.compareTo(lastName) < 0) {
	                smallerName = firstName;
	                longerName = lastName;
	            } else {
	                smallerName = lastName;
	                longerName = firstName;
	            }
	        }
	        StringBuilder userId = new StringBuilder();
	        userId.append(smallerName.charAt(smallerName.length() - 1));
	        userId.append(longerName);
	        userId.append(pin.charAt(n - 1));
	        userId.append(pin.charAt(pin.length() - n));
	        StringBuilder toggledUserId = new StringBuilder();
	        for (char c : userId.toString().toCharArray()) {
	            if (Character.isUpperCase(c)) toggledUserId.append(Character.toLowerCase(c));
	            else if (Character.isLowerCase(c)) toggledUserId.append(Character.toUpperCase(c));
	            else toggledUserId.append(c);
	        }
	        return toggledUserId.toString();
	    }

	    public static void main(String[] args) {
	        UserIdGeneration obj = new UserIdGeneration();
	        System.out.println(obj.userIdGeneration("Raj", "Kumar", 12345, 2));
	    }
	}