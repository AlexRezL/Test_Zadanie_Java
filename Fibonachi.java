import java.util.Scanner;

public class Fibonachi
{
    static private long result, last_num;
    static Scanner in = new Scanner(System.in);

    public static void main(String [] args) {
        last_num = in.nextLong();

        for (int i = 1; i <= last_num; i++)
        {
            System.out.print(Rec(i) + " ");
        }
    }

    static long Rec(long number)
    {
        if (number == 0 || number == 1) return 1L;
        return (Rec(number - 1L) + Rec (number - 2L));
    }
}
