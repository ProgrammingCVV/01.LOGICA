import java.util.Scanner;

public class pg_228_28
{
    public static void main(String[] args) 
    {
        Scanner enter = new Scanner(System.in);
        int num1, num2;

        System.out.println("");
        System.out.println("**************************************************************");
        System.out.println("READ TWO INTEGER AND DETERMINE WHICH ONE HAS MORE PRIME DIGITS");
        System.out.println("**************************************************************");
        System.out.println("");

        System.out.print("Write the first integer number: ");
        num1 = enter.nextInt();

        System.out.print("Write the second integer number: ");
        num2 = enter.nextInt();

        if(num1 < 0)
        {
            num1 = num1 * (-1);
        }

        if(num2 < 0)
        {
            num2 = num2 * (-1);
        }

        int dig1 = 0;
        int count1 = 0;

        while(num1 != 0)
        {
            dig1 = num1 % 10;

            if(dig1 == 2 || dig1 == 3 || dig1 == 5 || dig1 == 7)
            {
                count1 += 1;
            }

            num1 /= 10;
        }

        int dig2 = 0;
        int count2 = 0;

        while(num2 != 0)
        {
            dig2 = num2 % 10;

            if(dig2 == 2 || dig2 == 3 || dig2 == 5 || dig2 == 7)
            {
                count2 += 1;
            }

            num2 /= 10;
        }

        if(count1 > count2)
        {
            System.out.println("The first number has more prime digits " + count1);
        }
        else if(count2 > count1)
        {
            System.out.println("The second number has more prime digits " + count2);
        }
        else
        {
            System.out.println("Both numbers have the same amount of the prime digits." + count1);
        }


    }
}