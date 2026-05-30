
import java.util.Scanner;

public class pg_226_04
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        int num1, num2;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("READ TWO INTEGERS AND DISPLAY ALL NUMBERS BETWEEN THEM");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("");

        System.out.print("Write the first number: ");
        num1 = enter.nextInt();
        System.out.print("Write the second number: ");
        num2 = enter.nextInt();

        if(num1 < 0)
        {
            num1 *= -1;
        }
        if(num2 < 0)
        {
            num2 *= -1;
        }
/*
        for(int i = 1; i <= num1; i++)
        {
            System.out.print(i + "-");
        }
        System.out.println("");
        for(int j = 1; j <= num2; j++)
        {
            System.out.print(j + "-");
        }
 */
        int i = 1;
        int j = 1;

        while(i <= num1)
        {
            System.out.print(i + "-");
            i++;
        }
        System.out.println("");
        while(j <= num2)
        {
            System.out.print(j + "-");
            j++;
        }
    }
}