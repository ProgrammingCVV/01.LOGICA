import java.util.Scanner;

public class pg_228_23
{
    public static void main (String[] args)
    {
        Scanner enter = new Scanner(System.in);
        int num, dig;

        System.out.println("");
        System.out.println("************************************************************************************");
        System.out.println("READ AN INTEGER NUMBER AND DETERMINE IF THE SUM OF IT'S DIGITS IS A PRIME NUMBER TOO");
        System.out.println("************************************************************************************");
        System.out.println("");

        System.out.print("Write an integer number java: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        int count = 0;

        while(num > 0)
        {
            dig = num % 10;
            count += dig;
            num /= 10;
        }

        boolean es_primo = true;

        if(count <= 1) 
        {
            es_primo = false;
        }
        else
            {
                int i = 2;

                while (i * i <= count)
                {
                    if (count % i == 0)
                    {
                        es_primo = false;
                    }
                    i += 1;
                }
                if (es_primo)
                {
                    System.out.println("The sum of the digits is " + count + " and it's a prime number.");
                }
                else
                {
                    System.out.println("The sum of the digits is " + count + " and it isn´t a prime number.");
                }

            }
        }
}