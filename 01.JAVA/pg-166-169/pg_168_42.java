import java.util.Scanner;

public class pg_168_42
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;


        System.out.println("");
        System.out.println("***********************************************************************************");
        System.out.println("LEER DOS NÚMEROS ENTEROS Y DETERMINAR SI LA DIFERENCIA ENTRE AMBOS ES UN NÚMERO PAR");
        System.out.println("***********************************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer número entero: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero: ");
        num2 = entrada.nextInt();

        int resultado1 = num1 - num2;
        int resultado2 = num2 - num1;

        if(num1 < 0 || num2 < 0)
        {
            num1 = num1 * (-1);
            num2 = num2 * (-1);
        }

        if(resultado1 % 2 == 0 || resultado2 % 2 == 0)
        {
            System.out.println("La diferencia entre ambos números es un número par.");
        }else
            {
                System.out.println("La diferencia entre ambos números es un número impar.");
            }

    }
}