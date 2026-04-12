import java.util.Scanner;

public class pg_228_24
{
    public static void main(String[] args)
        {
            Scanner enter = new Scanner(System.in);
            int num;

            System.out.println("");
            System.out.println("********************************************************");
            System.out.println("READ AN INTEGER AND DETERMINE THE SUM OF ITS EVEN DIGITS");
            System.out.println("********************************************************");
            System.out.println("");

            System.out.print("Write an integer: ");
            num = enter.nextInt();

            if(num < 0)
            {
                num = num * (-1);
            }

            int dig;
            int count = 0;

            while(num > 0)
            {
                dig = num % 10;
                num /= 10;

                if(dig % 2 == 0)
                {
                    count += dig;
                }
            }
            System.out.println("The sum of the even digits is " + count);
    }
}