import java.util.Scanner;

public class pg_226_05
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        int num1, num2;
        int i = 1;
        int j = 1;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
        System.out.println("READ TWO INTEGERS AND DISPLAY ALL NUMBERS ENDED IN 4 COMPRENDS BETWEEN THEM");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJJVJVJVJV");
        System.out.println("");

        System.out.print("Write the first integer: ");
        num1 = enter.nextInt();

        System.out.print("Write the second integer: ");
        num2 = enter.nextInt();

        if(num1 < 0)
        {
            num1 *= -1;
        }

        if(num2 < 0)
        {
            num2 *= -1;
        }


        while(i <= num1)
        {
            if(i % 10 == 4)
                {
                System.out.print(i + ", ");
                }
        i++;

        }

        System.out.println("");
        
        while(j <= num2)
        {
            if(j % 10 == 4)
            {
                System.out.print(j + ", ");
            }
        j++;
            
        }
    }
}