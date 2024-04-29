import java.util.Scanner;

public class FourDigitInteger {
    public boolean isOdd(int number) {
        return !(number % 2 == 0);
    }

    public boolean isPalindrome(int number) {
        String string = Integer.toString(number);
        if ((string.substring(0, 1).equals(string.substring(3, 4))) && (string.substring(1, 2).equals(string.substring(2, 3)))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPerfectSquare(int number) {
        int i;
        for (i = 31; i < 100; i++) {
            if ((i * i) == number) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is odd: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        keyboard.close();
        FourDigitInteger test = new FourDigitInteger();
        if (test.isOdd(number)) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is not odd.");
        }
        if (test.isPalindrome(number)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        if (test.isPerfectSquare(number)) {
            System.out.println("The number is a perfect square.");
        } else {
            System.out.println("The number is not a perfect square.");
        }
    }
}
