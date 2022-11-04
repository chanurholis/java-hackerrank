// belum solved

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer scanInt = scanner.nextInt();
        Double scanDouble = scanner.nextDouble();
        System.out.println("input string : ");
        
        String scanString = "";
        scanString += scanner.nextLine();
        scanner.close();

        System.out.println(scanString);
        System.out.println(scanDouble);
        System.out.println(scanInt);

    }
}
