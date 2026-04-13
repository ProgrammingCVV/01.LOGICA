import java.util.Scanner;

public class pg_167_27
{
    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("*****************************************************************************");
        System.out.println("ESCRIBA UN NÚMERO ENTERO DE 4 DÍGITOS Y DETERMINE CUANTOS DÍGITOS PARES TIENE");
        System.out.println("*****************************************************************************");
        System.out.println("");

        int num = 0, dig1 = 0, dig2 = 0, dig3 = 0, dig4 = 0, sumaPar1 = 0, sumaPar2 = 0, sumaPar3 = 0, sumaPar4 = 0, resultado = 0;

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

            if(dig1 % 2 == 0)
            {
                sumaPar1 += 1;
            }

            if(dig2 % 2 == 0)
            {
                sumaPar2 += 1;
            }
            
            if(dig3 % 2 == 0)
            {
                sumaPar3 += 1;
            }

            if(dig4 % 2 == 0)
            {
                sumaPar4 += 1;
            }

            resultado = sumaPar1 + sumaPar2 + sumaPar3 + sumaPar4;

            if(resultado > 0)
            {
                System.out.println("Hay " + resultado + " dígitos pares.");
            }else
                {
                    System.out.println("No hay dígitos pares.");
                }

        }else
            {
                System.out.println("El número escrito no tiene cuatro dígitos. Intente nuevamente.");
            }


    }
}