import java.util.Scanner;

public class Pg_189_While_Ej4_Promedio
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("");
        System.out.println("**********************************************************************************************************************************");
        System.out.println("LEER NÚMEROS ENTEROS HASTA QUE DIGITEN 0 Y DETERMINAR A CUÁNTO ES IGUAL EL PROMEDIO DE LOS NÚMEROS LEÍDOS QUE HAYAN SIDO POSITIVOS");
        System.out.println("**********************************************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        int cuenta = 0; 
        int acumulador = 0;
        float prom = 0;
        
                       
        while (num != 0) 
        { 
            acumulador = acumulador + num;
            num = num / 2;
            cuenta += 1;

        
            System.out.println(acumulador);
            
        }

        prom = (float) acumulador / cuenta;
        System.out.println("El promedio es: " + prom);

    }
}