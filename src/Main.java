import java.util.Scanner;

public class Main {

    //this method prints a decrementing number pattern until 0 or the first negative number
    //after the values reach 0 or below, it calls for the other recursive method
    static void patternDecrement(int number, int initialNumber) {
        System.out.print(number + " ");

        if (number > 0) {
            patternDecrement(number - 5, initialNumber);
        } else if (number <= 0 && number + 5 < initialNumber) {
            patternIncrement(number + 5, initialNumber);
        }
    }

    //this recursive method prints an incrementing pattern until the initial number is hit
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