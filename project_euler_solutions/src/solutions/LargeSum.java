package solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


/*

Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */

public class LargeSum {

    public static void main(String[] args) {
        BigInteger total = new BigInteger("0");


        try {
            File fiftyDigitNums = new File("./src/Question13.txt");
            Scanner scanner = new Scanner(fiftyDigitNums);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                total = total.add(new BigInteger(data));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        System.out.println(total.toString().substring(0,10));
    }
}
