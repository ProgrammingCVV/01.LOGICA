import java.util.Scanner;
public class pg_166_15
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        int num;
        int dig1, dig2, dig3;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ A THREE-DIGITS INTEGER AND DETERMINE THE SUM OF ITS DIGITS");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("");

        System.out.print("Write a three-digits integer: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num *= -1; 
        }

        if(num > 100 && num < 999)
        {
            dig3 = num % 10;
            dig2 = num % 100 / 10;
            dig1 = num / 100 % 10;

            int sum = dig1 + dig2 + dig3;

            System.out.println("The sum of all digits is: " + sum);
        }
        else
        {
            System.out.println("The written number doesn't have three digits. Please try again!");
        }

        

    }
}