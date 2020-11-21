import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int decimals = (number % 100) / 10;
        int ones = number % 10;

        int reversedNumber = ones * 100 + decimals * 10 + hundreds;

        System.out.println(reversedNumber);
    }
}