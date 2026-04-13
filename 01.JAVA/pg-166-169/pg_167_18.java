import java.util.Scanner;
public class pg_167_18
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("**************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE TRES DÍGITOS Y DETERMINAR SI ALGÚN DÍGITO ES MULTIPLO DE OTROS");
        System.out.println("**************************************************************************************");
        System.out.println("");

        int num, Pd, Sd, Td;

        System.out.print("Escriba un número de tres dígitos: ");
        System.out.print("");
        num = entrada.nextInt();

        if (num < 0)
        {
            num = num * (-1);
        }

        if (num >= 100 && num <= 999)
        {
            Pd = (num / 100) % 10;
            Sd = (num / 10) % 10;
            Td = num - (num / 10 * 10);

            if ((Pd % Sd == 0 || Pd % Td == 0) || (Sd % Pd == 0 || Sd % Td == 0) || (Td % Pd == 0 || Td % Sd == 0))
            {
                System.out.println("Alguno de los dígitos es multiplo de otro.");
            }else
            {
                System.out.println("Ningún dígito es multiplo de otro.");
            }
        }else
        {
            System.out.println("El número no tiene tres dígitos.");
        }

    }
}