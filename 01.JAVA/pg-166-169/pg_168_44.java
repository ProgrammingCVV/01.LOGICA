import java.util.Scanner;

public class pg_168_44
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("*******************************************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE CUATRO DÍGITOS Y DETERMINAR SI EL PRIMER DÍGITO ES MULTIPLO DE ALGUNO DE LOS OTROS DÍGITOS");
        System.out.println("*******************************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero de cuatro dígitos: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if(num >= 1000 && num <= 9999)
        {
            int dig1 = (num / 1000) % 10;
            int dig2 = (num / 100) % 10;
            int dig3 = (num / 10) % 10;
            int dig4 = num - (num / 10 * 10);

            if(dig2 % dig1 == 0)
            {
                System.out.println("El primer dígito es múltiplo del segundo.");
            }
            if(dig3 % dig1 == 0)
            {
                System.out.println("El primer dígito es múltiplo del tercero.");
            }
            if(dig4 % dig1 == 0)
            {
                System.out.println("El primer dígito es múltiplo del cuarto.");
            }
            if(dig2 % dig1 != 0 && dig3 % dig1 != 0 && dig4 % dig1 != 0)
            {
                System.out.println("El número escrito NO es múltiplo de ninguno.");
            }

        }else
            {
                System.out.println("El número escrito no tiene cuatro dígitos. Intente nuevamente.");
            }


    }
}