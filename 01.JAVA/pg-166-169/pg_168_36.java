import java.util.Scanner;

public class pg_168_36
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num, suma;

        System.out.println("");
        System.out.println("************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE 4 DÍGITOS Y DETERMINAR SI TIENE MÁS DIGITOS PARES O IMPARES");
        System.out.println("************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero de 4 digitos: ");

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

            if(dig1 % 2 == 0)
            {
                dig1 = 1;
            }else
                {
                    dig1 = 0;
                }
            
            if(dig2 % 2 == 0)
            {
                dig2 = 1;
            }else
                {
                    dig2 = 0;
                }

            if(dig3 % 2 == 0)
            {
                dig3 = 1;
            }else
                {
                    dig3= 0;
                }

            if(dig4 % 2 == 0)
            {
                dig4 = 1;
            }else
                {
                    dig4 = 0;
                }

            suma = dig1 + dig2 + dig3 + dig4;

                if(suma == 2)
                {
                    System.out.println("El número escrito tiene la misma cantidad de dígitos pares que impares.");
                }

                else if(suma >= 3)
                {
                    System.out.println("El número escrito tiene más dígitos pares");

                }else
                    {
                        System.out.println("El número escrito tiene más dígitos impares.");
                    }
        }else
        {
            System.out.println("El número escrito no tiene 4 dígitos. Intenete nuevamente.");
        }

    }
}