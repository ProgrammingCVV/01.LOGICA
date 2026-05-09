import java.util.Scanner;

public class pg_226_03
{
    public static void main(String[] args) {
        {
            Scanner enter = new Scanner(System.in);
            int num;
            int i = 1;

            System.out.println("");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
            System.out.println("READ AN INTEGER AND DISPLAY ALL ITS EXACT DIVISORS BETWEEN 1 AND THE GIVEN NUMBER");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
            System.out.println("");

            System.out.print("Write an iteger: ");
            num = enter.nextInt();

            if(num < 0)
            {
                num *= -1;
            }
/*
            while(i <= num)
            {
                if(num % i == 0)
                {
                    System.out.println(i);
                }
            i++;
            }
*/

            for(i=1; i<= num; i++)
            {
                if(num % i == 0)
                {
                    System.out.print(i + ", ");
                }
            }
                
        }
    }
}