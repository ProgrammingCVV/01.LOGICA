import java.util.Scanner;

public class pg_228_26
{
    public static void main (String[] args)
    {
        {
            Scanner enter = new Scanner(System.in);

            int num; 

            System.out.println("");
            System.out.println("************************************************");
            System.out.println("READ AN INTEGER AND DETERMINE THE GREATEST DIGIT");
            System.out.println("************************************************");
            System.out.println("");

            System.out.print("Write an integer number: ");
            num = enter.nextInt();

            if(num < 0)
            {
                num = num * (-1);
            }

            int dig= 0;
            int greater = 0;

            while(num != 0)
            {
                dig = num % 10;

                if(dig > greater)
                    {
                        greater = dig;
                    }
                
                num /= 10;
            }
            
            System.out.println("The greater number is " + greater);
        }
    }
}