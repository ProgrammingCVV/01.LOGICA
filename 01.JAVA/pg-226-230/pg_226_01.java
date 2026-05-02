import java.util.Scanner;

public class pg_226_01
{
    public static void main(String[] args) {
        {
            Scanner enter = new Scanner(System.in);
            int num;
            int i = 1;


            System.out.println("");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
            System.out.println("READ AN INTEGER AND DISPLAY ALL NUMBERS BETWEEN 1 AND THE GIVEN NUMBER");
            System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJV");
            System.out.println("");

            System.out.print("Write an integer: ");
            num = enter.nextInt();

            if(num < 0)
            {
                num *= -1;
            }
/*
            while(i <= num)
            {
                System.out.print(i + ", ");
                i++;
            }
*/
            
            for(i=1; i<=num; i++)
            {
                System.out.print(i + " - ");
            }
            

        }
    }
}