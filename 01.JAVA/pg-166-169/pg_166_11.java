import java.util.Scanner;

public class pg_166_11
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        int num1, num2;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("READ TWO INTEGERS AND DETERMINE WHICH IS GREATER");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("");

        System.out.print("Write the first number: ");
        num1 = enter.nextInt();

        System.out.print("Write the second number: ");
        num2 = enter.nextInt();

        if(num1 > num2)
        {
            System.out.println("The first number is greater than the second.");
        }
        else
        {
            System.out.println("The second number is greater than the first.");
        }

    }
}