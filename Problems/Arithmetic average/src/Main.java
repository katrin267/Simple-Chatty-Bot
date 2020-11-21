import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        int numberOfDivs = 0;
        int sum = 0;

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0) {
                numberOfDivs++;
                sum += i;
            }
        }

        System.out.println((double) sum / numberOfDivs);
    }
}