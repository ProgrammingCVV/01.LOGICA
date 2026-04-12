import java.util.Scanner;

public class pg_227_5
{
public static void main(String []args)
{
    Scanner entrada = new Scanner(System.in);

    int num1;
    int num2;

    System.out.println("");
    System.out.println("*****************************************************************************************");
    System.out.println("LEER DOS NÚMEROS Y MOSTRAR TODOS LOS NÚMEROS TERMINADO EN CUATRO COMPRENDIDOS ENTRE ELLOS");
    System.out.println("*****************************************************************************************");
    System.out.println("");

    System.out.print("Escribe el primer número: ");
    num1 = entrada.nextInt();

    System.out.print("Escribe el segundo número: ");
    num2 = entrada.nextInt();

    int inicio = Math.min(num1, num2);
    int fin = Math.max(num1, num2);

    if(num1 < 0)
    {
        num1 = num1 * (-1);
    }
    if(num2 < 0)
    {
        num2 = num2 * (-1);
    }


    int i;

    for(i = inicio; i <= fin; i++)
    {
    
        if(i % 10 == 4)
            System.out.println(i);
    }

}
}