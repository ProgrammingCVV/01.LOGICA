import java.util.Scanner;

public class pg_166_09
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        int num, dig1, dig2;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("READ A TWO-DIGIT INTEGER AND DETERMINE IF ONE OF ITS DIGITS IS A MULTIPLE OF THE OTHER");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("");

        System.out.print("Write a two-digit integer: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num *= -1;
        }

        if(num >= 10 && num <= 99)
        {
            dig2 = num % 10;
            dig1 = num / 10;

            if(dig1 % dig2 == 0)
            {
                System.out.println("The frst digit is multiple of the second digit.");
            }
            else
            {
                System.out.println("The first digit isn't multiple of the second digit.");
            }
            if(dig2 % dig1 == 0)
            {
                System.out.println("The second digt is multiple of the first digit.");
            }
            else
            {
                System.out.println("The second digit isn't multiple of the first digit.");
            }
        }
        else
        {
            System.out.println("The written number doesn't have two digits. Please try again!");
        }

    }
}