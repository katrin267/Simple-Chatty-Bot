import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        do {
            num = scanner.nextInt();
            if (num == 0) break;

            System.out.println(num % 2 == 0 ? "even" : "odd");
        } while (scanner.hasNext());

    }
}