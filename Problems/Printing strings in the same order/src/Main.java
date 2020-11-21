import java.util.ArrayList;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (scanner.hasNext()) {
            names.add(scanner.next());
        }

        //Collections.reverse(names);

        for (String name : names) {
            System.out.println(name);
        }

    }
}
