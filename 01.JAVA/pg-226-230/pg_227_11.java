import java.util.Scanner;

public class pg_227_11
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("****************************************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE DOS DÍGITOS Y MOSTRAR EN PANTALLA TODOS LOS ENTEROS COMPRENDIDOS ENTRE UN DÍGITO Y OTRO");
        System.out.println("****************************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número de dos dígitos: ");
        num = entrada.nextInt();

        if(num < 0 )
        {
            num = num * (-1);
        }

        if(num >= 10 && num <= 99)
        {
            int i;

            int dig1 = num / 10;
            int dig2 = num % 10;

            int primero = Math.min(dig1, dig2);
            int segundo = Math.max(dig1, dig2);

            for(i = primero; i <= segundo; i++)
            {
                System.out.println(i);
            }
        }else
        {
            System.out.println("El número escrito no tiene dos dígitos. Intente nuevamente.");
        }

        
    }
}