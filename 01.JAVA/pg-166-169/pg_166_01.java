import java.util.Scanner;

public class pg_166_01 
{
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);
        System.out.println("");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("READ AN INTEGER AND DETERMINE IF IT'S LAST NUMBER IS FOUR");
        System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
        System.out.println("");

        System.out.print("Write an integer: ");
        int num = enter.nextInt();
        int four = 4;

        if(num < 0)
        {
            num *= -1;
        }
        
        if(num % 10 == 4)
        {
            System.out.println("The last digit of your number is " + four);
        }
            else
                {
                    System.out.println("The last digit of your number ISN'T " + four);
                }
    }   
}
