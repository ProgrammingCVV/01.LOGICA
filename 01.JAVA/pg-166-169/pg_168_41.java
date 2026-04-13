import java.util.Scanner;

public class pg_168_41
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num1 , num2;

        System.out.println("");
        System.out.println("****************************************************************************************************");
        System.out.println("LEER DOS NÚMEROS ENTEROS Y DETERMINAR SI LA DIFERENCIA ENTRE LOS DOS ES UN NÚMERO PRIMO DE UN DÍGITO");
        System.out.println("****************************************************************************************************");
        System.out.println("");

        System.out.print("Ecriba el primer número entero: ");
        num1 = entrada.nextInt();

        System.out.print("Ecriba el segundo número entero: ");
        num2 = entrada.nextInt();

        if(num1 < 0 || num2 < 0)
        {
            num1 = num1 * (-1);
            num2 = num2 * (-1);
        }

        if(num1 - num2 == 2 || num1 - num2 == 3 || num1 - num2 == 5 || num1 - num2 == 7 || num2 - num1 == 2 || num2 - num1 == 3 || num2 - num1 == 5 || num2 - num1 == 7)
        {
            System.out.println("La diferecia entre ambos números es un número primo de un dígito.");
        }else
            {
                System.out.println("La diferencia entre ambos números NO es número primo.");
            }

    }
}