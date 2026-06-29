import java.util.Scanner;

public class pg_166_14
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ TWO TWO-DIGIT INTEGERS AND DETERMINE HOW MANY IS EQUAL THE SUM OF ALL THE DIGITS");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("");

        System.out.print("Write the first integer: ");
        num1 = enter.nextInt();

        System.out.print("Write the second integer: ");
        num2 = enter.nextInt();

        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;

        if(num1 < 0)
        {
            num1 *= -1;
        }

        if(num2 < 0)
        {
            num2 *= -1;
        }

        if(num1 > 10 && num1 < 99)
        {
            dig2 = num1 % 10;
            dig1 = num1 / 10;
        }
        else
        {
            System.out.println("The written number doesn't have two digits. Please try again!");
        }

        if(num2 > 10 && num2 < 99)
        {
            dig4 = num2 % 10;
            dig3 = num2 / 10;
        }
        else
        {
            System.out.println("The written number doesn't have two digits. Please try again!");
        }
        
        System.out.println("The sum of all the digits is " + (dig1 + dig2 + dig3 + dig4));

    }
}