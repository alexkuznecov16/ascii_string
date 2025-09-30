/*
    Description: this program provides methods to encrypt and decrypt text using ASCII codes,
    and to get input from the user.

    Feature: uses StringBuilder instead of String for better performance.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userOperation = getUserOperation(scanner);
        String userString = getUserInput(scanner);

        // Encrypting output
        if (userOperation.equals("1")) {
            String encryptedText = toAsciiString(userString);
            System.out.println("Encrypted text: " + encryptedText);
        }

        // Decrypting output
        if (userOperation.equals("2")) {
            String decryptedText = asciiToString(userString);
            System.out.println("Decrypted text: " + decryptedText);
        }

        scanner.close();
    }

    // get text input from user
    public static String getUserInput(Scanner scanner) {
        String userString;

        // loop what repeats if user entered string is empty
        while (true) {
            System.out.print("Enter text: ");
            userString = scanner.nextLine();

            if (userString.isEmpty()) {
                System.out.println("Please enter not empty text!");
            } else break;
        }

        return userString;
    }

    //
    public static String getUserOperation(Scanner scanner) {
        String userOperation;
        System.out.print("What operation do you need? (1 - encryption, 2 - decryption): ");

        while (true) {
            userOperation = scanner.nextLine();
            if (!userOperation.equals("1") && !userOperation.equals("2")) {
                System.out.println("Enter correct operation [1-2]!");
                continue;
            } else break;
        }

        return userOperation;
    }
    // convert string of chars to the string of ascii numbers divided with "%"
    public static String toAsciiString(String str) {
        StringBuilder asciiString = new StringBuilder(); // declared variable for result (encrypted string)

        // the loop iterates each char of string
        for (int i = 0; i < str.length(); i++) {
            // add into asciiString new ascii number
            asciiString.append((int) str.charAt(i));
            if (i < str.length() - 1) asciiString.append("%"); // divide numbers with "%"
        }

        return asciiString.toString();
    }

    // convert encrypted string (of ascii number) to the initial string of chars
    public static String asciiToString(String str) {
        String[] asciiNumbers = str.split("%"); // array of each ascii number
        StringBuilder decryptedString = new StringBuilder(); // declared variable for result (decrypted string)

        // the loop iterates each ascii number
        for (int i = 0; i < asciiNumbers.length; i++) {
            // add into decryptedString a value of decrypted ascii number
            int asciiValue = Integer.parseInt(asciiNumbers[i]);
            decryptedString.append((char) (asciiValue));
        }

        return decryptedString.toString();
    }
}