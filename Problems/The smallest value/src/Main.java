import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long factor = 1;
        int out = 1;

        while (factor <= num) {
            out++;
            factor *= out;
        }

        System.out.println(out);
    }
}