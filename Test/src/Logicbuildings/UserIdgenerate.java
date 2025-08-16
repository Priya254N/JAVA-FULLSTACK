package Logicbuildings;

import java.util.Scanner;

public class UserIdgenerate {

    public static String generateUserId(String firstName, String lastName, String pin, int n) {
        String smallerName;
        String longerName;

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

        char lastLetterSmaller = smallerName.charAt(smallerName.length() - 1);
        String longerNamePart = longerName;
        char digitFromLeft = pin.charAt(n - 1);
        char digitFromRight = pin.charAt(pin.length() - n);

        String userId = "" + lastLetterSmaller + longerNamePart + digitFromLeft + digitFromRight;

        StringBuilder toggledUserId = new StringBuilder();
        for (char c : userId.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledUserId.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledUserId.append(Character.toUpperCase(c));
            } else {
                toggledUserId.append(c);
            }
        }

        return toggledUserId.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        String userId = generateUserId(firstName, lastName, pin, n);
        System.out.println("Generated User ID: " + userId);

        scanner.close();
    }
}