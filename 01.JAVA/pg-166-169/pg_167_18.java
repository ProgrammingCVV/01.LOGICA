import java.util.Scanner;

public class pg_167_18
{
    public static void main(String[] args) 
    {
        Scanner enter = new Scanner(System.in);
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ A THREE-DIGITS INTEGER AND DETERMINE IF SOME DIGIT IS MULTIPLE OF OTTHER");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("");

        System.out.print("Write a three-digits integer: ");
        int num = enter.nextInt();

        if(num < 0)
        {
            num *= -1;
        }

        if(num > 100 && num < 999)
        {
            dig3 = num % 10;
            dig2 = (num / 10) % 10;
            dig1 = (num / 100) % 10;

            System.out.println(dig1 + "-" + dig2 + "-" + dig3);

            if(dig1 % dig2 == 0 || dig1 % dig3 == 0)
            {
                System.out.println("The first digit is multiple of others.");
            }
            else if(dig2 % dig1 == 0 || dig2 % dig3 == 0)
            {
                System.out.println("The second digit is multiple of othes.");
            }
            else if(dig3 % dig1 == 0 || dig3 % dig2 == 0)
            {
                System.out.println("The third digit is multiple of others.");
            }
            else
            {
                System.out.println("None of the digits is multiple of other.");
            }
        }
        else
            {
                System.out.println("The written number doesn't have three digits. Please try again!");
            }


    }
}