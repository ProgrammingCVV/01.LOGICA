import java.util.Scanner;

public class pg_228_30
{
    public static void main(String[] args) 
    {
        Scanner enter = new Scanner(System.in);
        int num;

        System.out.println("");
        System.out.println("*************************************************************************");
        System.out.println("READ AN INTEGER AND SHOW ON THE SCREEN ALL NUMERIC COMPONENTS OF THIS ONE");
        System.out.println("*************************************************************************");
        System.out.println("");

        System.out.print("Write an integer number: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        System.out.print("The numeric components of the written number are: ");

        int i = 0;

        for(i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + ", ");
            }

        }
    }
}