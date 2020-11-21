import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        int numberOfSameInts = 1;

        while (i <= num) {
            for (int j = 1; j <= numberOfSameInts; j++) {
                System.out.print(numberOfSameInts + " ");
                i++;
                if (i > num) {
                    break;
                }
            }
            numberOfSameInts++;
        }
    }
}