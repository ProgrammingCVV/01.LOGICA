import java.util.Scanner;

public class pg_168_45
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("");
        System.out.println("**************************************************************************************************");
        System.out.println("#1. LEER UN NÚMERO ENTERO DE DOS DÍGITOS Y, SI ES PAR, MOSTRAR EN PANTALLA LA SUMA DE SUS DÍGITOS;");
        System.out.println("#2.   SI    ES   PRIMO   Y   MENOR   QUE   DIEZ,   MOSTRAR   EN   PANTALLA   SU   ÚLTIMO    DÍGITO");
        System.out.println("#3. Y  SI  ES  MULTIPLO  DE CINCO Y MENOR  QUE TREINTA,  MOSTRAR  EN PANTALLA   EL  PRIMER  DÍGITO");
        System.out.println("**************************************************************************************************");
        System.out.println("");

        System.out.print("Escribe un número entero de dos dígitos: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if(num >= 10 && num <= 99)
        {
            int dig1 = (num / 10) % 10;
            int dig2 = num - (num / 10 * 10);

            int sum = dig1 + dig2;

            if(num % 2 == 0)
            {
                System.out.println("#1. La suma de los dígitos del número par escrito, es: " + sum);
            }else
                {
                    System.out.println("#1. El número escrito no es un número par.");
                }

            if(sum == 2 || sum == 3 || sum == 5 || sum == 7)
            {
                System.out.println("#2. La suma de los dígitos es un número primo menor que diez, y el último dígito del número escrito es: " + dig2);
            }else
                {
                    System.out.println("#2. La suma de los dígitos NO es un número primo.");
                }

            if(num % 5 == 0 && num < 30)
            {
                System.out.println("#3. El número escrito es multiplo de 5, y su primer dígito es: " + dig1);
            }else
                {
                    System.out.println("#3. El número escrito NO es multiplo de 5, y menor que 30.");
                }
        }else
            {
                System.out.println("El número escrito no tiene dos dígitos. Intente nuevamente.");
            }
    
    }
}