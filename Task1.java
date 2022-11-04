import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int myInt1 = myScanner.nextInt();
        int myInt2 = myScanner.nextInt();
        int myInt3 = myScanner.nextInt();

        myScanner.close();
        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt3);
    }
}