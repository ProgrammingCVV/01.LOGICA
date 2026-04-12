import java.util.Scanner;

public class pg_227_18
{
    public static void main(String[] args) 
    {
        Scanner enter = new Scanner(System.in);

        int num1, num2;

        System.out.println("");
        System.out.println("*****************************************************************************************************");
        System.out.println("READ TWO INTEGER NUMBERS AND DISPLAY ALL THE MULTIPLES OF FIVE BETWEEN THE SMALLER AND THE LARGER ONE");
        System.out.println("*****************************************************************************************************");
        System.out.println("");

        System.out.print("Write the first integer number: ");
        num1 = enter.nextInt();
        System.out.println("");

        System.out.print("Write the second integer number: ");
        num2 = enter.nextInt();
        System.out.println("");

        if(num1 < 0)
        {
            num1 = num1 * (-1);
        }

        if(num2 < 0)
        {
            num2 = num2 * (-1);
        }

        int i = 0;
        int smaller = Math.min(num1, num2);
        int larger = Math.max(num1, num2);

        for(i = smaller; i <= larger; i++)
        {
            if(i % 5 == 0)
            {
                System.out.println(i); 
            } 
        }
    }
}