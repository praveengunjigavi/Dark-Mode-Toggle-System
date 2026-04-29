import java.util.Scanner;

public class DarkModeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Default theme: Light Mode
        Theme theme = new Theme(false);
        ThemeManager manager = new ThemeManager(theme);

        int choice;

        do {
            System.out.println("\n--- Dark Mode Toggle System ---");
            theme.displayTheme();

            System.out.println("1. Toggle Theme");
            System.out.println("2. Apply Theme");
            System.out.println("3. Save Preference");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.toggleTheme();
                    break;
                case 2:
                    manager.applyTheme();
                    break;
                case 3:
                    manager.savePreference();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        scanner.close();
    }
}
