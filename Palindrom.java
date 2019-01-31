import java.util.Scanner;

public class Palindrom
{
    static String input;
    static Scanner in = new Scanner(System.in);

    public static void main(String [] args)
    {
        input = in.next();
        if (input.equals(Reverce(input))) System.out.println("It is a palindrome");
        else System.out.println("It is not a palindrome");
    }

    static String Reverce(String s)
    {
        String res = new String();
        for (int i = s.length(); i >= 1; i--)
        {
            res += s.substring(i-1, i);
        }
        return res;
    }
}
