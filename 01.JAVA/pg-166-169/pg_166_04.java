import java.util.Scanner;
public class pg_166_04
{
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        int num, digit;
        int sum = 0;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ A TWO-DIGIT INTEGER AND DETERMINE THE SUM OF ITS DIGITS");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJJVJVJVJVJVJVJVJVJ");
        System.out.println("");

        System.out.print("Write an integer with two digits: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num *= -1;
        }

        if(num >= 10 && num <= 99)
        {
            digit = num % 10;
            num /= 10;
            sum = num + digit; 
            System.out.println(sum);
        }
        else
        {
            System.out.println("The written number doesn't have two digits. Please try again!");
        }

        

    }
}