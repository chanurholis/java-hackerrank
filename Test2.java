import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.sound.sampled.BooleanControl;

public class Test2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Test2.main()");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        typeCounter(sentence);

        bufferedReader.close();
    }

    public static void typeCounter(String sentence) {
        String[] arraySentence = sentence.split(" ");

        int strCount = 0;
        int intCount = 0;
        int doubleCount = 0;
        for (String sente : arraySentence) {
            Integer.parseInt("12");
            if (isInt(sente)) {
                intCount++;
            } else if (isDouble(sente)) {
                doubleCount++;
            } else {
                strCount++;
            }
        }

        System.out.println("string: " + strCount);
        System.out.println("integer: " + intCount);
        System.out.println("double: " + doubleCount);
    }

    public static boolean isInt(String strNum) {
        try {
            Integer.parseInt(strNum);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isDouble(String strNum) {
        try {
            Double.parseDouble(strNum);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
