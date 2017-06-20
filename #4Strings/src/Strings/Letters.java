package Strings;

import java.util.InputMismatchException;

import static Strings.StringScanner.reader;

/**
 * Created by Lena on 20.03.2017.
 */



 class Letters
{
    public static int[] wordCount(String str)
    {
        boolean wordIsStarted = false;
        int words = 0;
        int chars = 0;
        for (int i = 0; i < str.length(); i++)
        {
            String symbols = " ,.!";
            if (symbols.indexOf(str.charAt(i)) >= 0)
            {
                if (wordIsStarted) {
                    words++;
                    wordIsStarted = false;
                }}

            else
            {
                chars++;
                wordIsStarted = true;
            }

        }
        if (wordIsStarted)
        {
            words++;
        }
        int[]res=new int[2];
        res[1]=words;
        res[0]=chars;
        return res;
    }
    public static void main(String[] args)
    {

        System.out.println("Enter text:");
        String str = reader.nextLine();
        int[] count=wordCount(str);
        System.out.println("Words count: " + count[1]);
        System.out.println("letters count: " + count[0]);
    }}


