import java.util.Scanner;

public class pg_169_46
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("");
        System.out.println("*****************************************************************************");
        System.out.println("LEER  UN NÚMERO ENTERO DE DOS DÍGITOS Y, SI TERMINA EN 1, MOSTRAR EN  PATALLA");
        System.out.println("SU PRIMER DÍGITO; SI TERMINA EN 2, MOSTRAR EN PANTALLA LA SUMA DE SUS DÍGITOS");
        System.out.println("Y  SI  TERMINA  EN  3,  MOSTRAR  EN  PANTALLA  EL  PRODUCTO  DE  SUS  DÍGITOS");
        System.out.println("*****************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero de dos dígitos: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if(num >= 10 && num <= 99)
        {
            int dig1 = (num / 10) % 10;
            int dig2 = num - (num / 10 * 10);
            
            if(dig2 == 1)
            {
                System.out.println("El primer dígito del número escrito es: " +  dig1);
            }

            if(dig2 == 2)
            {
                System.out.println("La suma de los dígitos del número escrito es: " + (dig1 + dig2));
            }

            if(dig2 == 3)
            {
                System.out.println("El producto de los dígitos del número escrito es: " + dig1 * dig2);
            }

        }else
            {
                System.out.println("El número escrito no tiene dos dígitos. Intente nuevamente.");
            }




    }
}