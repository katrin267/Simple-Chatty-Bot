
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInts = 0;

        while (scanner.nextInt() != 0) {
            numberOfInts++;
        }

        System.out.println(numberOfInts);
    }
}