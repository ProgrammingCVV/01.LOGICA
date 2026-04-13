import java.util.Scanner;

public class pg_169_49
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("*******************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO Y, SI ES MÚLTIPLO DE CUATRO, DETERMINAR SI SU ÚLTIMO DÍGITO ES PRIMO.");
        System.out.println("*******************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        if(num < 0 )
        {
            num = num * (-1);
        }

        int ult_dig = num - (num / 10 * 10);

        if(num % 4 == 0)
        {
            if(ult_dig == 2 || ult_dig == 3 || ult_dig == 5 || ult_dig == 7)
            {
                System.out.println("El número escrito es múltiplo de 4 y el último dígito es un número primo.");
            }else
                {
                    System.out.println("El número escrito es múltiplo de 4 pero el último dígito NO es un número primo.");
                }
        }else
            {
                System.out.println("El número NO es múltiplo de 4.");
            }

    }
}