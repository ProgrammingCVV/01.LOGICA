import java.util.Scanner;

public class pg_167_17
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);

        int num;
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ A THREE-DIGITS INTEGER AND DETERMINE THE POSITION OFTHE DIGIT WITH HIGHER VALUE ");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("");

        System.out.print("Write a three-digits integer: ");

        num = enter.nextInt();

        if(num < 0)
        {
            num *= -1;
        }

        if(num > 100 && num <999)
        {
            dig3 = num % 10;
            dig2 = (num / 10) % 10;
            dig1 = (num / 100) % 10;
        }
        else
            {
                System.out.println("The written number doesn't have three digits. Please try again!");
            }
        
        if(dig1 > dig2 && dig1 > dig3)
        {
            System.out.println("The first digit is higher than the others.");
        }
        else if(dig2 > dig1 && dig2 > dig3)
        {
            System.out.println("The second digit is higher than the others.");
        }
        else if(dig3 > dig1 && dig3 > dig2)
        {
            System.out.println("The third digit is higher than the others.");
        }
        else
            {
                System.out.println("All digits or two digits are the same.");
            }
    }
}