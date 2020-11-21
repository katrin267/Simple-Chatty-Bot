import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else {
                String textOut = "";
                if (i % 3 == 0) {
                    textOut = "Fizz";
                }

                if (i % 5 == 0) {
                    textOut += "Buzz";
                }
                System.out.println(textOut);
            }
        }
    }
}