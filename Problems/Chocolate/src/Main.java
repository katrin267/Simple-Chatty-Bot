import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int numberOfSegments = scanner.nextInt();

        if ((numberOfSegments % width == 0 || numberOfSegments % height == 0) && (width * height) >= numberOfSegments) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}