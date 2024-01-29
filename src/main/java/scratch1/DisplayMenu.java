package scratch1;

import java.io.File;
import java.util.Scanner;

public class DisplayMenu {
    private static final String DATA_FOLDER_PATH = "C:/Users/Mark Costales/Desktop/dev/mobility-profiles/data";

    public static String displayMenu() {
        File folder = new File(DATA_FOLDER_PATH);
        File[] files = folder.listFiles(File::isFile);

        if (files == null || files.length == 0) {
            System.out.println("No files found in the directory.");
            return null;
        }

        System.out.println("\nChoose a file:");
        for (int i = 0; i < files.length; i++) {
            System.out.println((i + 1) + ") " + files[i].getName());
        }

        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            try {
                System.out.print("Enter the number of the file you want to choose (0 to exit): ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 0 && choice <= files.length) {
                    if (choice == 0) {
                        return null;
                    } else {
                        return files[choice - 1].getName();
                    }
                } else {
                    System.out.println("Invalid choice. Please enter a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public static void main(String[] args) {
        String selectedFile = displayMenu();
        if (selectedFile != null) {
            System.out.println("You selected: " + selectedFile);
        } else {
            System.out.println("Exiting program.");
        }
    }
}
