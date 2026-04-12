import java.util.Scanner;

public class pg_227_21
{
    public static void main(String[]args)
    {

        Scanner enter = new Scanner(System.in);
        int num = 0;

        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("READ AN INTEGER NUMBER AND DETERMINE HOW MUCH THE SUM OF ITS DIGITS IS");
        System.out.println("**********************************************************************");
        System.out.println();

        System.out.print("Write an integer number: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        int digits, sum = 0;

        for(; num > 0; num = num / 10)
        {
            digits = num % 10;
            sum += digits;
        }

        System.out.println("The sum of the digits is "+ sum);

        
    }
}