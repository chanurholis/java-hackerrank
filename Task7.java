import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            int space = 15;
            int spaceDiff = space - s1.length();
            String countSpace = "";
            for (int j = 0; j < spaceDiff; j++) {
                countSpace += " ";
            }
            System.out.println(s1 + countSpace + String.format("%03d", x));
        }

        System.out.println("================================");
    }
}
