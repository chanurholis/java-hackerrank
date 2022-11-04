import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // int myInt = scanner.nextInt();

        // scanner.close();

        // if (Integer.toString(myInt) != null) {
        //     System.out.println("Good Job");
        // } else {
        //     System.out.println("Wrong Answer");
        // }

        Scanner n = new Scanner(System.in);
        String s = String.valueOf(n);
        if (s instanceof String){
            System.out.println("Good job");
        } else { 
            System.out.println("Wrong answer");
        }
    }
}
