import java.util.Scanner;
public static void main(String[] args)
{
    Scanner enter = new Scanner(System.in);
    int dig1, dig2;

    System.out.println("");
    System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJ");
    System.out.println("READ A TWO-DIGIT INTEGER AND DETERMINE IF BOTH ARE EVEN");
    System.out.println("JVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVJVV");
    System.out.println("");

    System.out.print("Write a two digit integer: ");
    int num = enter.nextInt();

    if(num < 0)
    {
        num *= -1;
    }
    
    if(num > 0)
    {
        dig2 = num % 10;
        dig1 = num / 10;

        if(dig1 % 2 == 0 && dig2 % 2 == 0)
        {
            System.out.println("Both digits are even.");
        }
        else
        {
            System.out.println("Both digits are not even.");
        }
    }
}