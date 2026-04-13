import java.util.Scanner;

public class pg_169_50
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("*****************************************************************************************************");
        System.out.println("#1. LEER UN NÚMERO ENTERO MAYOR O IGUAL QUE 100 Y, SI ES MÚLTIPLO DE 4, MOSTRAR EN PANTALLA SU MITAD.");
        System.out.println("#2.     SI     ES     MÚLTIPLO     DE     5,     MOSTRAR     EN     PANTALLA     SU     CUADRADO.    ");
        System.out.println("#3.    Y    SI    ES    MÚLTIPLO    DE    6,    MOSTRAR    EN    PANTALLA    SU    PRIMER    DÍGITO. ");
        System.out.println("*****************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero menor o igual que 100: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if(num <= 100)
        {
            if(num % 4 == 0)
            {
                System.out.println("#1. La mitad del número escrito es: " + (num / 2));
            }else
                {
                    System.out.println("#1. El número escrito no es múltiplo de 4.");
                }

            if(num % 5 == 0)
            {
                System.out.println("#2. El cuadrado del número escrito es: " + (Math.pow(num,2)));
            }else
                {
                    System.out.println("#2. El número escrito no es múltiplo de 5.");
                }

            if(num % 6 == 0)
            {
                System.out.println("#3. El primer dígito del número escrito es:" + ((num / 10) % 10));
            }else
                {
                    System.out.println("#3. El número escrito no es múltiplo de 6.");
                }
        }else
            {
                System.out.println("El número escrito no es menor que 100.");
            }

    }
}