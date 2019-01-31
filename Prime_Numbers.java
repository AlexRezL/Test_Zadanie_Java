import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Prime_Numbers
{
    static Scanner in = new Scanner(System.in);
    static  int number;
    public static void main(String [] args)
    {
        number = in.nextInt();

        for (int i = 1; i <= number; i++)
        {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    static boolean isPrime(int num)
    {
        for (int i = 2; i < sqrt(num) + 1; i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
