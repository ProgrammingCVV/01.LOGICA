import java.util.Scanner;

public class pg_227_16
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num = 0;

        System.out.println("");
        System.out.println("******************************************************************************************************");
        System.out.println("MOSTRAR EN PANTALLA EL PROMEDIO ENTERO DE LOS N PRIMEROS NÚMEROS MÚLTIPLOS DE 3 PARA UN NÚMERO N LEÍDO");
        System.out.println("******************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        if(num < 0 )
        {
            num = num * (-1);
        }

        int i = 0;
        int sum = 0;
        int prom = 0;

        for(i = 1; i <= num; i++)
        {
            sum += i * 3;
            prom = sum / i;
        }
        System.out.println(sum);
        System.out.println(prom);
        
    }
}