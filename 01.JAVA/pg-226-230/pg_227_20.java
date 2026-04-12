import java.util.Scanner;

public class pg_227_20
{
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("***********************************************************");
        System.out.println("READ AN INTEGER NUMBER AND DETERMINE HOW MANY DIGITS IT HAS");
        System.out.println("***********************************************************");
        System.out.println("");

        System.out.print("Write an integer number: ");
        num = enter.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        int i = 0;
        int digits = 0;

        // Usamos un bucle for para ir dividiendo el número
        for (i = num; i > 0; i /= 10) 
        {
            digits++;
        }

        // Caso especial: si el número es 0, tiene 1 dígito
        if (num == 0) 
        {
            digits = 1;
        }

        if (digits >= 10) 
        {
            System.out.println("The written number has 10 digits or more.");
        } 
        else 
        {
            System.out.println("The written number has " + digits + " digit(s).");
        }       
    }
}