import java.util.Scanner;

public class pg_167_16
{
    public static void main(String []args)
    {
        Scanner enter = new Scanner(System.in);
        int num;
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ A THREE-DIGITS INTEGER AND DETERMINE IF AT LEAST TWO OF THREE DIGITS ARE THE SAME");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
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
            dig2 = (num / 10) % 10;
            dig1 = (num / 100) % 10;
        }
        else
        {
            System.out.println("The written number doesn't have three digits. Please try again!");
        }

        System.out.println(dig1 + "-" + dig2 + "-"+ dig3);

        if(dig1 == dig2)
        {
            System.out.println("The first and second digit are the same.");
        }
        else if(dig1 == dig3)
        {
            System.out.println("The first and thrid digit are the same.");
        }
        else if(dig2 == dig3)
        {
            System.out.println("The second and third digit are the same.");
        }
        else
        {
            System.out.println("None of the digits are the same.");
        }


    }
}