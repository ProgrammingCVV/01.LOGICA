import java.util.Scanner;

public class pg_166_06
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        int num;
        boolean prime = true;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ A TWO-DIGITS INTEGER LESS THAN 20 AND DETERMINE IF IT'S A PRIME NUMBER");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("");

        System.out.print("Write a two-digis integer: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num *= -1;
        }

        if(num >= 10 && num < 20)
        {
            for(int i = 2; i < num; i++)
            {
                if(num % i == 0)
                    prime = false;
                    break;
            }
            if(prime)
            {
                System.out.println("The written number is prime.");
            }
            else
            {
                System.out.println("The written number isn't prime.");
            }
        }
        else if(num <= 9 || num >= 100)
        {
            System.out.println("The written number doesn't have two digits. Please try again!");
        }
        else
        {
            System.out.println("The written number isn't less than 20.");
        }
        
    }
}