import java.util.Scanner;

public class pg_166_07
{
    public static void main(String[] args) {
        {
            Scanner enter = new Scanner(System.in);
            int num;
            int i = 2;
            boolean prime = true;
            
            System.out.println("");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
            System.out.println("READ A TWO-DIGITS INTEGER AND DETERMINE IF IT'S A PRIME AND NEGATIVE NUMBER");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
            System.out.println("");

            System.out.print("Write a two-digits iteger: ");
            num = enter.nextInt();

            if(num < 0)
            {
                System.out.print(" The written number is negative");
                num *= -1;
            }
            else
                {
                    System.out.print("The written number is positive");
                }

            if(num >= 10 && num <= 99)
            {
                while( i < num)
                {
                    if(num % i == 0)
                    {
                        prime = false;
                        break;
                    }
                    i++;
                }

                if(prime)
                {
                    System.out.println(" and is prime. ");
                }
                else
                {
                    System.out.println(" and isn't prime. ");
                }
            }
            else
            {
                System.out.println(" but doesn't have two digits. Please try again!");
            }
        }
    }
}