import java.util.Scanner;

public class pg_227_19
{
    public static boolean esPrimo(int n) 
    {
        if (n <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;        
    }

    public static void main(String[] args) 
    {

        Scanner enter = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("*******************************************");
        System.out.println("READ ONE NUMBER AND DETERMINE IF IT'S PRIME");
        System.out.println("*******************************************");
        System.out.println("");

        System.out.print("Write an integer number: ");
        num = enter.nextInt();


        if (esPrimo(num)) 
        {
            System.out.println(num + " is a prime number.");
        } 
        else 
        {
            System.out.println(num + " isn't a prime number.");
        }
    }
}