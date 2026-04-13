import java.util.Scanner;
public class pg_167_22
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("*****************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE TRES DÍGITOS Y DETERMINAR SI EL PRIMER DÍGITO ES IGUAL AL ÚLTIMO");
        System.out.println("*****************************************************************************************");
        System.out.println("");

        int num1 = 0;
        
        System.out.print("Escriba un número entero de tres dígitos: ");
        num1 = entrada.nextInt();
        System.out.println("");

        if (num1 < 0) 
        {
            num1 = num1 * (-1);
        }

            if (num1 >= 100 && num1 <= 999) 
            {
                int primer_Digito = (num1 / 100) % 10;
                int ultimo_Digito = num1 - (num1 / 10 * 10);

                if (primer_Digito == ultimo_Digito) 
                {
                    System.out.println("El primer dígito es igual al último dígito.");
                }
                else
                {
                    System.out.println("El primer dígito es diferente al último dígito.");
                }
            }
            else
            {
                System.out.println("El número escrito no tiene 3 dígitos. Intente nuevamente.");
            }
    }
}