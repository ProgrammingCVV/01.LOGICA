import java.util.Scanner;

public class pg_167_30
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num, dig1, dig2, dig3, dig4, dig5;

        System.out.println("");
        System.out.println("***********************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE CUATRO DÍGITOS Y DETERMINAR SI EL SEGUNDO DÍGITO ES IGUAL AL PENÚLTIMO");
        System.out.println("***********************************************************************************************");
        System.out.println("");
        
        System.out.print("Escriba un número entero de cuatro dígitos: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if(num >= 1000 && num <= 9999)
        {
            dig1 = (num / 1000) % 10;
            dig2 = (num / 100) % 10;
            dig3 = (num / 10) % 10;
            dig4 = num - (num / 10 * 10);

            if(dig2 == dig3)
            {
                System.out.println("El segundo dígito es igual al penúltimo.");
            }else
                {
                    System.out.println("El segundo dígito es diferente al penúltimo.");
                }


        }else
            {
                System.out.println("El número no tiene cuatro dígitos. Intente nuevamente.");
            }

    }
}