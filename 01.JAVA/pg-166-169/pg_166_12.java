import java.util.Scanner;
public class pg_166_12
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("******************************************************************************");
        System.out.println("LEER DOS NÚMEROS ENTEROS DE DOS DÍGITOS Y DETERMINAR SI TIENEN DÍGITOS COMUNES");
        System.out.println("******************************************************************************");
        System.out.println("");

        int num1 = 0;
        int num2 = 0;

        int Pd1 = 0;
        int Sd1 = 0;

        int Pd2 = 0;
        int Sd2 = 0;

        System.out.print("Escriba el primer número entero de dos dígitos: ");
        System.out.print("");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero de dos dígitos: ");
        System.out.print("");
        num2 = entrada.nextInt();

        if (num1 >= 10 && num1 <= 99)
        {
            Pd1 = (num1 / 10)% 10;
            Sd1 = num1 -(num1 / 10 * 10);

            if (num2 >= 10 && num2 <= 99)
            {
                Pd2 = (num2 / 10) % 10;
                Sd2 = num2 - (num2 / 10 * 10);

                if (Pd1 == Pd2 || Sd1 == Pd2 || Sd2 == Pd1 || Sd2 == Sd1)
                {
                    System.out.println("Los números escritos tienen dígitos comunes.");
                }else
                {
                    System.out.println("Los números escritos NO tienen dígitos comunes.");
                }
            }else
            {
                System.out.println("Alguno de los dos números escritos no tene dos dígitos y el programa no podrá continuar su ejecución!");
            }
        }else
        {
            System.out.println("¡Alguno de los dos números escritos no tene dos dígitos y el programa no podrá continuar su ejecución!");
        }
    }
}