import java.util.Scanner;

public class pg_166_13
{
    public static void main(String[]arg)
    {
        Scanner enter = new Scanner(System.in);
        int num1, num2;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("READ TWO TWO-DIGIT INTEGERS AND DETERMINE IF THE SUM OF BOTH INTEGERS PRODUCE AN EVEN NUMBER");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("");

        System.out.print("Write the first integer: ");
        num1 = enter.nextInt();

        System.out.print("Write the second integer:");
        num2 = enter.nextInt();

        if(num1 < 0)
        {
            num1 *= -1;
        }
        if(num2 < 0)
        {
            num2 *= -1;
        }

        int sum = num1 + num2;

        if(sum % 2  == 0)
        {
            System.out.println("THE SUM OF BOTH INTEGERS (" + sum + ") PRODUCES AN EVEN NUMBER.");
        }
        else
            {
                System.out.println("THE SUM OF BOTH INTEGERS (" + sum + ") DOESN'T PRODUCE AN EVEN NUMBER.");
            }
    }
}