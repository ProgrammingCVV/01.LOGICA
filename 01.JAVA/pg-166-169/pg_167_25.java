import java.util.Scanner;

public class pg_167_25
{
    public static void main (String[] args)

    {

        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("**************************************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE TRES DÍGITOS Y DETERMINE SI ALGUNO DE LOS DÍGITOS ES IGUAL A LA SUMA DE LOS OTROS DOS");
        System.out.println("**************************************************************************************************************");
        System.out.println("");


        int num = 0, dig1 = 0, dig2 = 0, dig3 = 0, suma1 = 0, suma2 = 0, suma3 = 0;

        System.out.print("Escriba un número entero de tres dígitos: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if(num >= 100 && num <= 999)
        {
            dig1 = (num / 100) % 10;
            dig2 = (num / 10) % 10;
            dig3 = num - (num / 10 * 10);

            suma1 = dig1 + dig2;
            suma2 = dig1 + dig3;
            suma3 = dig2 + dig3;

            if(dig1 == suma3)
            {
                System.out.println("El " + dig1 +  " es igual a la suma de los otros dígitos.");
            }else
                {
                    System.out.println("El " + dig1 + " No es igual a la suma de los otros dígitos.");
                }
            if(dig2 == suma2)
            {
                System.out.println("El " + dig2 +  " es igual a la suma de los otros dígitos.");
            }else
                {
                    System.out.println("El " + dig2 + " No es igual a la suma de los otros dígitos.");
                }

            if(dig3 == suma1)
            {
                System.out.println("El " + dig3 +  " es igual a la suma de los otros dígitos.");
            }else
                {
                    System.out.println("El " + dig3 + " No es igual a la suma de los otros dígitos.");
                }
        }else
            {
                System.out.println("El número escrito no tiene tres dígitos. Intente nuevamente.");
            }

    }
}