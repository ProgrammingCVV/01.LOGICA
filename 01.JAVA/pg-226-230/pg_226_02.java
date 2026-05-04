import java.util.Scanner;

public class pg_226_02
{
    public static void main(String[]args)
    {
        Scanner enter = new Scanner(System.in);
        int num, i;

        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ AN INTEGER AND DISPLAY ALL EVEN NUMBERS BETWEEN ONE AND THE GIVEN NUMBER");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("");
        
        System.out.print("Write an integer: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num *= -1;
        }
/*
        for(i=1; i<=num; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + ", ");
            }
        }
*/
        i= 1;
        while(i <= num)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + "-");
            }
        i++;
        }
    }
}