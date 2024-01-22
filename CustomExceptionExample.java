import java.util.Scanner;

class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String userInput = scanner.nextLine();

            // Check if the entered string is "India"
            if (!userInput.equals("India")) {
                throw new NoMatchException("Entered string does not match the expected value 'India'");
            }

            System.out.println("Entered string: " + userInput);
        } catch (NoMatchException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
