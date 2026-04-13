import java.util.Scanner;

public class pg_166_02
{
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        int num, lastDigit;
        int count = 0;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ A INTEGER AND DETERMINE IF IT HAS THREE DIGITS");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("");

        System.out.print("Write an integer: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num *= -1;
        }

        if(num >= 100 && num <= 999)
        {
            System.out.println("The written number has 3 digits.");
        }
        else
            {
                System.out.println("The written number doesn't have 3 digits.");
            }
/*
        while(num > 0)
        {
            lastDigit = num % 10;
            num /= 10;
            count +=1;
        }

        if(count == 3)
            {
                System.out.println("The written number has " + count + " digits.");
            }
            else
                {
                    System.out.println("The written number doesn't have three digits");
                }
*/
    }
}