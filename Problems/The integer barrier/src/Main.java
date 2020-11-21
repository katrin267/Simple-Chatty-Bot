import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int currentNumber = scanner.nextInt();
            if (currentNumber == 0) {
                break;
            }
            sum += currentNumber;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.print(sum);
    }
}