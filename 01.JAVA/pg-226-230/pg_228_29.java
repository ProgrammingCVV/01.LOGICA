import java.util.Scanner;

public class pg_228_29
{
    public static void main(String[] args) 
    {
        Scanner enter = new Scanner(System.in);
        int num;

        System.out.println("");
        System.out.println("*********************************************");
        System.out.println("READ AN INTEGER AND DETERMINE ITS FIRST DIGIT");
        System.out.println("*********************************************");
        System.out.println("");

        System.out.print("Write an integer number: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        int dig = 0;

        while(num > 0)
        {
            dig = num % 10;
            num /= 10;
        }
        System.out.println("The first digit of the written number is "+ dig);
    }
}