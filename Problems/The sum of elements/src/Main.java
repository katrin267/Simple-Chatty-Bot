import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfInts = 0;
        int nextInt = 0;

        do {
            nextInt = scanner.nextInt();
            sumOfInts += nextInt;
        } while (nextInt != 0);

        System.out.println(sumOfInts);
    }
}
