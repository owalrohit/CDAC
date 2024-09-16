package in.cdac;

import java.util.Scanner;

public class AirplaneSeatManagerUtil {
    private static Scanner scanner = new Scanner(System.in);
    // Method to take input from user
    public static int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    // Display menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Book a seat");
        System.out.println("2. Cancel a booking");
        System.out.println("3. Check seat availability");
        System.out.println("4. Display seating chart");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
}
