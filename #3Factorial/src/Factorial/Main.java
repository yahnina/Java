

package Factorial;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Lena on 19.03.2017.
 */


public class Main {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Enter positive integer number:");

        try {
            a = StringScanner.reader.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input");
            return;
        }
        if (a<0) System.out.println("Please, enter positive integer value!");
        else {
        long f = Calc.factorial(a);
        System.out.println("Factorial of this number is " + f);
        }
    }
}
