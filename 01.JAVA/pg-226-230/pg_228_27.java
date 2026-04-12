import java.util.Scanner;

public class pg_228_27
{
    public static void main(String[] args) 
    {
        Scanner enter = new Scanner(System.in);
        int num1, num2;

        System.out.println("");
        System.out.println("****************************************************");
        System.out.println("READ TWO INTEGERS AND FIND WHICH ONE HAS MORE DIGITS");
        System.out.println("****************************************************");
        System.out.println("");

        System.out.print("Write the first number: ");
        num1 = enter.nextInt();

        System.out.print("Write the second number: ");
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

        while(num1 > 0)
        {
            dig1 = num1 % 10;
            count1 += 1;
            num1 /= 10;
        }
        System.out.println(count1);

        int dig2 = 0;
        int count2 = 0;

        while(num2 > 0)
        {
            dig2 = num2 % 10;
            count2 += 1;
            num2 /= 10;
        }
        System.out.println(count2);

        if(count1 > count2)
        {
            System.out.println("The first number has more digits than the second one with " + count1 + " digits.");
        }
        else if(count2 > count1)
        {
            System.out.println("The second number has more digits than the first one with " + count2 + " digits.");
        }
        else
        {
            System.out.println("Both have the same number of " + count1 + " digits.");
        }

    }
}