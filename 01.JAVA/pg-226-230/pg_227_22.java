import java.util.Scanner;

public class pg_227_22
{
    public static void main(String []args)
    {
        Scanner enter = new Scanner(System.in);
        int num;

        System.out.println("");
        System.out.println("**********************************************************************");
        System.out.println("WRITE AN INTEGER NUMBER AND DETERMINE HOW MAY TIMES IT HAS THE DIGIT 1");
        System.out.println("**********************************************************************");
        System.out.println("");
        
        System.out.print("Write an integer number j: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        int dig = 0;
        int sum = 0;
        while(num > 0)
        {
            dig = num % 10;
            num /= 10;

            if(dig == 1)
            {
                sum += dig;
            }
        }
        System.out.println("There are " + sum + " digits 1");
    }

}