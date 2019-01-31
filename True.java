import java.util.Scanner;

public class True
{
    static Scanner in = new Scanner(System.in);
    static boolean input;
    static short count = 0;

    public static void main(String [] args)
    {
        for (int i = 0; i < 4; i++)
        {
            input = in.nextBoolean();
            if (input) count++;
        }

        if (count == 2) System.out.println("True");
    }

}
