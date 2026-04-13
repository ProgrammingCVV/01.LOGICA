import java.util.Scanner;

public class pg_167_26
{
    public static void main(String[] args)

    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("*********************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE CUATRO DÍGITOS Y DETERMINAR A CUÁNTO ES IGUAL LA SUMA DE SUS DÍGITOS");
        System.out.println("*********************************************************************************************");
        System.out.println("");

        int num = 0, dig1 = 0, dig2 = 0, dig3 = 0, dig4 = 0, suma = 0;

        System.out.print("Escriba un número entero de cuatro cifras: ");
        num = entrada.nextInt();

        if (num < 0) 
        {
            num = num * (-1);
        }

        if(num >= 1000 && num <= 9999)
        {
            dig1 = (num / 1000) % 10;
            dig2 = (num / 100) % 10;
            dig3 = (num / 10) % 10;
            dig4 = num - (num / 10 * 10);

            suma = dig1 + dig2 + dig3 + dig4;

            System.out.println("La suma de los dígitos es: " + suma);
        }else
        {
            System.out.println("El número escrito no tiene cuatro dígitos. Intente nuevamente.");
        }
    }
}