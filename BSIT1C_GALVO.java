import java.util.Scanner;

public class BSIT1C_GALVO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Display the day");
            System.out.println("2. Display all days of the week");
            System.out.println("3. Display days depending on range");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    displaySingleDay();
                    break;
                case 2:
                    displayAllDays();
                    break;
                case 3:
                    displayDaysInRange();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void displayDay(String day) {
        System.out.println("Today is " + day + "\n");
    }
    

    private static void displaySingleDay() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sunday[1]"+ " " + "Monday[2]" + " " + "Tuesday[3]" + " " + "Wednesday[4]" + " " + "Thursday[5]" + " " + "Friday[6]" + " " + "Saturday[7]");
        System.out.print("Enter a number of day: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                displayDay("SUNDAY");
                break;
            case 2:
                displayDay("MONDAY");
                break;
            case 3:
                displayDay("TUESDAY");
                break;
            case 4:
                displayDay("WEDNESDAY");
                break;
            case 5:
                displayDay("THURSDAY");
                break;
            case 6:
                displayDay("FRIDAY");
                break;
            case 7:
                displayDay("SATURDAY");
                break;
            case 0:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 7, or 0 to exit.");
        }

    }

    private static void displayAllDays() {
        String[] daysOfWeek =  {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" + "\n" };
        System.out.println("All days of the week:");
        for (String day : daysOfWeek) {
            System.out.println(day);
        }
    }

    private static void displayDaysInRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start day index (1-7): ");
        int startDay = scanner.nextInt();
        System.out.print("Enter the end day index (1-7): ");
        int endDay = scanner.nextInt();

        if (startDay < 1 || startDay > 7 || endDay < 1 || endDay > 7 || startDay > endDay) {
            System.out.println("Invalid input. Please enter valid indices.");
            return;
        }

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Days in the specified range:");
        for (int i = startDay - 1; i < endDay; i++) {
            System.out.println(daysOfWeek[i]);
        }
    }
}