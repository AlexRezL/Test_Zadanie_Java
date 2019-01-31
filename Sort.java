import java.util.Scanner;

public class Sort
{
    static int size = 10;
    static long [] array = new long[size];
    static boolean isSorted = false;
    static Scanner in = new Scanner(System.in);

    public static void main(String [] args)
    {
        for (int i = 0; i < size; i++)
        {
            array[i] = in.nextLong();
        }

        while (!isSorted)
        {
            isSorted = true;
            for (int i = 0; i < size - 1; i++)
            {
                if (array[i] < array[i+1])
                {
                    isSorted = false;
                    long temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
