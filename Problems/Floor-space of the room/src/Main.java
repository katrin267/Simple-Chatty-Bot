import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();

        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(square);
                break;
            case "rectangle":
                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                System.out.println(a1 * b1);
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(r * r * 3.14);
                break;
            default:
                break;
        }
    }
}