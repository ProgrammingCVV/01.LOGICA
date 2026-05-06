import java.util.Scanner;

public class pg_166_10
{
    public static void main(String[] args) {
        {
            Scanner enter = new Scanner(System.in);
            int num, dig1, dig2;

            System.out.println("");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
            System.out.println("READ A TWO-DIGIT INTEGER AND DETERMINE IF BOTH DIGITS ARE THE SAME");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
            System.out.println("");

            System.out.print("Write a two-digit integer: ");
            num = enter.nextInt();

            if(num < 0)
            {
                num *= -1;
            }

            if(num >= 10 && num <=99)
            {
                dig2 = num % 10;
                dig1 = num / 10;

                if(dig1 == dig2)
                {
                    System.out.println("Both digits are the same.");
                }
                else
                {
                    System.out.println("Both digits aren't the same.");
                }
            }
            else
                {
                    System.out.println("The written number doesn't have two digits. Please try again!");
                }
        }
    }
}