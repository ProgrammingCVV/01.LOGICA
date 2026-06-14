import java.util.Scanner;

public class pg_227_06
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);

        int num, dig1, dig2, dig3;
        int i = 1;
        int j = 1;
        int k = 1;
        

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ THREE-DIGITS INTEGER AND DISPLAY ALL THE NUMBERS COMPRENDED BETWEEN 1 AND EACH ONE OF THE INTEGERS");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("");

        System.out.print("Write an integer with three digits: ");
        num = enter.nextInt();


        if(num < 0)
        {
            num *= -1;
        }

        if(num >= 100 && num <= 999)
        {
            dig1 = (num / 100) % 10;
            dig2 = (num / 10) % 10;
            dig3 = num - (num / 10 * 10);

            for(i=1; i<=dig1; i++)
            {
                System.out.print(i);
            }

            System.out.println("");

            for(j=1; j<=dig2; j++)
            {
                System.out.print(j);
            }

            System.out.println("");

            for(k=1; k<=dig3; k++)
            {
                System.out.print(k);
            }

            /*

            while(i <= dig1)
            {
                System.out.print(i);
                i++;
            }
            System.out.println("");

            while(j <= dig2)
            {
                System.out.print(j);
                j++;
            }
            System.out.println("");

            while(k <= dig3)
            {
                System.out.print(k);
                k++;
            }
            */
        }
        else
        {
            System.out.println("The written number doesn't have three digits. Please try again!");
        }

    }
}