
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int numberOfDays = 0;
        int currentHeight = 0;
        while (currentHeight < height) {
            numberOfDays++;
            currentHeight += up;
            if (currentHeight >= height) {
                break;
            }
            currentHeight -= down;
        }

//        int dayUp = up - down;
//        int numberOfDays = (height - up) / dayUp + 1;
        System.out.println(numberOfDays);

    }
}
