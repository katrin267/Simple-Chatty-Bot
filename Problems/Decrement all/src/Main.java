import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
            numbers[i]--;
            System.out.print(numbers[i] + " ");
        }
    }
}