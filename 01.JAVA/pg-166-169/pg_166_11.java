import java.util.Scanner;
public class pg_166_11
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("******************************************************");
        System.out.println("LEER DOS NÚMEROS ENTEROS Y DETERMINAR CUÁL ES EL MAYOR");
        System.out.println("******************************************************");
        System.out.println("");

        int num1 = 0;
        int num2 = 0;

        System.out.print("Escriba el primer número entero: ");
        System.out.print("");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero: ");
        System.out.print("");
        num2 = entrada.nextInt();

        
        if (num1 > num2)
        {
            System.out.println("El Primer número escrito (" + num1 + ") es mayor que el segundo número escrito (" + num2 + ").");
        }else
        {
            System.out.println("El segundo número escrito (" + num2 + ") es mayor que el primer número escrito (" + num1 + ").");
        }
    }
}


