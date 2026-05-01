import java.util.Scanner;

public class pg_166_08
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        int num, dig1, dig2, i, j;
        boolean prime1 = true;
        boolean prime2 = true;


        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("READ A TWO-DIGITS INTEGER AND DETERMINE IF ITS DIGITS ARE PRIMES");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("");

        System.out.print("Write a two-digits integer: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num *= -1;
        }

        if(num >= 10 && num <= 99)
        {
            dig2 = num % 10;
            dig1 = num / 10;

            System.out.println(dig1 + "  " + dig2);

            for(i = 2; i < dig1; i++)
            {
                if(dig1 % i ==  0)
                {
                    prime1 = false;
                    break;
                }
            }

            for(j = 2; j < dig2; j++)
            {
                if(dig2 % j == 0)
                {
                    prime2 = false;
                    break;
                }
            }

            if(prime1)
            {
                System.out.println("The first digit is prime ");
            }
            else
            {
                System.out.println("The first digits isn't prime ");
            }

            if(prime2)
            {
                System.out.println("and the second digit is prime ");
            }
            else
            {
                System.out.println("and the second digits isn't prime ");
            }
        }
        else
            {
                System.out.println("The written number doesn't have two digits. Please try again!");
            }
    }
}