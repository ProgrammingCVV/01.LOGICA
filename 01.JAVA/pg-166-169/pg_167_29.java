import java.util.Scanner;

public class pg_167_29
{
    public static void main (String[] args)
    {

        Scanner entrada = new Scanner(System.in);
        int num, dig1, dig2, dig3, dig4, dig5;


        System.out.println();
        System.out.println("***************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE CINCO DÍGITOS Y DETERMINAR SI ES UN NÚMERO CAPICÚA");
        System.out.println("***************************************************************************");
        System.out.println();

        System.out.print("Escriba un número entero de cinco dígitos: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if(num >= 10000 && num <= 99999)
        {
            dig1 = (num / 10000) % 10;
            dig2 = (num / 1000) % 10;
            dig3 = (num / 100) % 10;
            dig4 = (num / 10) % 10;
            dig5 = num - (num / 10 * 10);

            if(dig1 == dig5 && dig2 == dig4)
            {
                System.out.println( num + " Es un número CAPICÚA.");
            }else
                {
                    System.out.println(num + " No es un número CAPICÚA.");
                }

        }else
            {
                System.out.println("El número no tiene cinco dígitos. Intente nuevamente.");
            }
    }
}