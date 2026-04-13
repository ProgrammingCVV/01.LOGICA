import java.util.Scanner;
public class pg_167_16
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("**************************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE TRES DÍGITOS Y DETERMINAR SI AL MENOS DOS DE LOS TRES DÍGITOS SON IGUALES");
        System.out.println("**************************************************************************************************");
        System.out.println("");

        int num, Pd, Sd, Td;

        System.err.print("Escriba un número entero de tres dígitos: ");
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

            if (Pd == Sd || Pd == Td || Sd == Td)
            {
                System.out.println("Dos de los tres dígitos son iguales.");
            }else
            {
                System.out.println("Ninguno de los dígitos son iguales.");
            }
        }else
        {
            System.out.println("El número escrito no tiene tres dígitos.");
        }
    }
}