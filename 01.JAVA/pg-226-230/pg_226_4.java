import java.util.Scanner;

public class pg_226_4
{
    public static void main (String []args)
    {
        Scanner entrada = new Scanner(System.in);

        int num1 ;
        int num2;

        System.out.println("");
        System.out.println("**********************************************************************");
        System.out.println("LEER DOS NÚMEROS Y MOSTRAR TODOS LOS ENTEROS COMPRESNDIDOS ENTRE ELLOS");
        System.out.println("**********************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer núemero: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo núemero: ");
        num2 = entrada.nextInt();

        if (num1 < 0)
        {
            num1 = num1 * (-1);
        }

        if (num2 < 0)
        {
            num2 = num2 * (-1);
        }

        int i = 1;
        int j = 1;

        while(i <= num1)
        {
            System.out.println(i);

            i++;
        }
        System.out.println("");

        while(j <= num2)
        {
            System.out.println(j);

            j++;
        }

    }
}