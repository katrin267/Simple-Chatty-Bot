import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int num1 = a / 100;
        int num2 = a % 100 / 10;
        int num3 = a % 10;
        System.out.println(num1 + num2 + num3);
    }
}