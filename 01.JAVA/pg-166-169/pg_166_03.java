import java.util.Scanner;

public class pg_166_03
{
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        int num;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVVJVJ");
        System.out.println("READ AN INTEGER AND DETERMINE IF IT'S NEGATIVE");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJJ");
        System.out.println("");

        System.out.print("Write an integer: ");
        num = enter.nextInt();

        if(num < 0)
        {
            System.out.println("The written number is Negative: " + num);
        }
        else
        {
            System.out.println("The written number isn't negative: " + num);
        }
    }
}