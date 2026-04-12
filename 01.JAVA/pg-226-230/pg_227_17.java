import java.util.Scanner;

public class pg_227_17
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int num, num2;

        System.out.println("");
        System.out.println("********************************************************************************************************************************************");
        System.out.println("PROMEDIAR LOS X PRIMEROS MÚLTIPLOS DE 2 Y DETERMINAR SI ESE PROMEDIO ES MAYOR QUE LOS Y PRIMEROS MÚLTIPLOS DE 5 PARA VALORES DE X E Y LEÍDOS");
        System.out.println("********************************************************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un primer número entero que promedie multiplos de 2: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        int i = 0;
        int sum = 0;
        float prom = 0;

        for(i=1; i <= num; i++ )
        {
            sum += i * 2;
            prom = sum / i;
        }
        System.out.println("Suma: " + sum);
        System.out.println("Promedio : " + prom);
        System.out.println("");


        // ==================================================================================================================================

        System.out.print("Escriba un segundo número entero que promedie multiplos de 5: ");
        num2 = entrada.nextInt();

        if(num2 < 0)
        {
            num2 = num2 * (-1);
        }

        int j = 0;
        int sum2 = 0;
        float prom2 = 0;

        for(j=1; j <= num2; j++ )
        {
            sum2 += j * 5;
            prom2 = sum2 / j;
        }
        System.out.println("Suma2: " + sum2);
        System.out.println("Promedio2: " + prom2);
        System.out.println("");


        // ==================================================================================================================================

        if(prom > prom2)
        {
            System.out.println("El promedio de los primeros múltiplos de 2, es mayor que el promedio de los primeros múltimplos de 5.");
            System.out.println("");
        }
        else
        {
            System.out.println("El promedio de los primeros múltiplos de 2, NO es mayor que el promedio de los primeros múltimplos de 5.");
            System.out.println("");
        }


    }
}