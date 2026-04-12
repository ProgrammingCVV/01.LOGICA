import java.util.Scanner;

class pg_228_25
{
    public static void main (String[] args)
    {
        Scanner enter = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("******************************************************");
        System.out.println("READ AN INTEGER AN DETERMINE THE AVERAGE OF ITS DIGITS");
        System.out.println("******************************************************");
        System.out.println("");

        System.out.print("Write an integer number: ");

        num = enter.nextInt();

        if (num < 0)
        {
            num = num * (-1);
        }

        int dig; 
        float aver;
        float sum = 0;
        float count = 0;

        while(num > 0)
        {
            dig = num % 10;
            num /= 10;
            count += 1;
            sum += dig;
        
        }

aver = sum / count;
System.out.println("The average of the writen digits is: " + aver);
    }
}