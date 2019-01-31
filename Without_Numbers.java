import java.util.Scanner;

public class Without_Numbers
{
    static String input = new String();
    static Scanner in = new Scanner(System.in);

    public static void main(String [] args)
    {
        input = in.next();
        input = input.replaceAll("[0-9]", "");
        System.out.println(input);
    }
}
