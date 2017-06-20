

package Brackets;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int count = 0;
        System.out.println("Enter text:");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        for (int i = 0; i < str.length(); i++)
        {

            if (str.charAt(i) == ')') {
                count--;
            } else if (str.charAt(i) == '(')
            {
                count++;
            }
            if (count < 0) {
                System.out.println("wrong!!!");
            }
        }

        if (count == 0) {
            System.out.println("right!!!");
        }
    }
}

