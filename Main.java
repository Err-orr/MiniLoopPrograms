// imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // variable initializations
        int num = 1;
        int sum = 0;
        int guess = 0;
        int guessAmount = 0;
        int randomNum = (int) (Math.random() * 100 + 1);
        int positive = 0;
        int negative = 0;
        // Program #4
        System.out.println("Program #4 Prime Numbers");
        System.out.println("2 3 5 7 11 13 17 19 23 29");
        System.out.println("31 37 41 43 47 53 59 61 67 71");
        System.out.println("73 79 83 89 97 101 103 107 109 113");
        System.out.println("127 131 137 139 149 151 157 163 167 173");
        System.out.println("179 181 191 193 197 199 211 223 227 229");
        // Program #1
        System.out.println("Program #1: Integer Sums");
        while (num != 0) {
            System.out.print("Please enter a number: ");
            num = scan.nextInt();
            sum += num;
        }
        System.out.println("The sum of the numbers is " + sum + ".");
        // Program #2
        System.out.println("Program #2: Guessing Game");
        while (guess != randomNum) {
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            guessAmount++;
            if (guess == randomNum) {
                System.out.println("You got it! It took you " + guessAmount + " guesses.");
            } else if (guess > randomNum){
                System.out.println("Too High.");
            } else {
                System.out.println("Too Low.");
            }
        }
        // Program #3
        System.out.println("Program #3: Counting");
        num = 1;
        sum = 0;
        guessAmount = 0;
        while (num != 0) {
            System.out.print("Please enter an integer: ");
            num = scan.nextInt();
            sum += num;
            if (num == 0) {
                System.out.println("You entered " + positive + " positive numbers.");
                System.out.println("You entered " + negative + " negative numbers.");
                System.out.println("The average of your numbers is " + (double) sum / guessAmount);
            } else if (num > 0) {
                positive++;
            } else {
                negative++;
            }
            guessAmount++;
        }
    }
}