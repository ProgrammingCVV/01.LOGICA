import java.util.Scanner;
public class pg_168_43
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;


        System.out.println("");
        System.out.println("*****************************************************************************************************************************");
        System.out.println("LEER DOS NÚMEROS ENTEROS Y DETERMINAR SI LA DIFERENCIA ENTRE LOS DOS ES UN NÚMERO DIVISOR EXACTO DE ALGUNO DE LOS DOS NÚMEROS");
        System.out.println("*****************************************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer número entero: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero: ");
        num2 = entrada.nextInt();

        int dif = num1 - num2;
        
        if(num1 < 0  || num2 < 0)
        {
            num1 = num1 * (-1);
            num2 = num2 * (-1);
        }

        if(num1 % dif == 0 || num2 % dif == 0)
        {
            System.out.println("La diferencia entre ambos números es un divisor exacto de alguno de los dos números escritos.");
        }else
            {
                System.out.println("La diferencia entre ambos números NO es un divisor exacto de alguno de los dos números escritos.");
            }
    }
}