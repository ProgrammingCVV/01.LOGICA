import java.util.Scanner;

public class pg_227_12
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;
        int dig1, dig2, dig3;

        System.out.println("");
        System.out.println("***********************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE TRES DÍGITOS Y DETERMINAR SI TIENE EL DÍGITO 1");
        System.out.println("***********************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero de 3 dígitos: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if(num >= 100 && num <= 999)
        {
            dig1 = (num / 100) % 10;
            dig2 = (num / 10) % 10;
            dig3 = num % 10;

    //      System.out.println(dig1 + "" + dig2 + "" + dig3);

            if(dig1 == 1 || dig2 == 1 || dig3 == 1)
            {
                System.out.println("El número escrito SÍ tiene el digito 1.");
            }
            else
            {
                System.out.println("El número escrito NO tiene el dígito 1.");
            }

        }
        else
        {
            System.out.println("El número escrito no tiene 3 dígitos. Por favor intente nuevamente.");
        }
    }
}