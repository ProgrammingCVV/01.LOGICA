import java.util.Scanner;

public class pg_166_12
{
    public static void main(String[] args)
        {
            Scanner enter = new Scanner(System.in);
            int num1, num2, dig1, dig2, dig3, dig4;

            System.out.println("");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
            System.out.println("READ TWO TWO-DIGIT INTEGERS AND DETERMINE IF THEY BOTH HAVE DIGITS IN COMMON");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
            System.out.println("");

            System.out.print("Write the first integer: ");
            num1 = enter.nextInt();

            System.out.print("Write the second integer: ");
            num2 = enter.nextInt();

            if(num1 < 0)
            {
                num1 *= -1;
            }
            if(num2 < 0)
            {
                num2 *= -1;
            }

            if(num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99)
            {
                dig4 = num2 % 10;
                dig3 = num2 / 10;
                dig2 = num1 % 10;
                dig1 = num1 / 10;

                if(dig1 == dig3 || dig1 == dig4 || dig2 == dig3 || dig2 == dig4)
                {
                    System.out.println("There are digits in common.");
                }
                else
                    {
                        System.out.println("There are not digits in common.");
                    }
            }
            else
                {
                    System.out.println("Some of written numbers doesn't have two digits. Please try again!");
                }
        }
    
}