import java.util.Scanner;

public class Main {

    static void patternDecrement(int number, int initialNumber) {
        System.out.print(number + " ");

        if (number > 0) {
            patternDecrement(number - 5, initialNumber);
        } else if (number <= 0 && number + 5 < initialNumber) {
            patternIncrement(number + 5, initialNumber);
        }
    }

    static void patternIncrement(int number, int initialNumber) {
        System.out.print(number + " ");

        if (number < initialNumber) {
            patternIncrement(number + 5, initialNumber);
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the beginning number of the pattern: ");
        number = scanner.nextInt();
        patternDecrement(number, number);
    }
}