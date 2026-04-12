import java.util.Scanner;

public class pg_228_31
{
    public static void main(String[] args) 
    {
        Scanner enter= new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("");
        System.out.println("READ NUMBERS UNTL THEY WRITE 0 AND DETERMINE THE AVERAGE OF THE NUMBERS THAT END IN 5");
        System.out.println("");
        System.out.println("");

        System.out.print("Write an integer number: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        int end_5 = 0;
        int count = 0;
        int aver = 0;
        int sum = 0;

        while(num != 0)
        {
            System.out.print("Write an integer number until 0: ");
            num = enter.nextInt();

            if(num % 10 == 5)
            {
                end_5 = num;
                count += 1;
                sum += end_5;
            }
        aver = sum / count;

    System.out.println("The average of the numbers that end 5 is: " + aver);

        }
    }
}