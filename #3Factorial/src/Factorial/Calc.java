package Factorial;

import java.math.BigInteger;

/**
 * Created by Lena on 19.03.2017.
*/
public class Calc {

    public static long factorial(long n)
    {long f=1;
        for (int i=2; i<=n; i++)
        {f=i*f;
        }
   return f;
    }
}