import java.util.Scanner;

public class Pg_184_For_Ej2_EntreElMenorYelMayor
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("");
        System.out.println("*******************************************************************************************");
        System.out.println("LEER DOS NÚMEROS ENTEROS Y MOSTRAR TODOS LOS ENTEROS COMPRENDIDOS ENTRE EL MENOR Y EL MAYOR");
        System.out.println("*******************************************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer número entero: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero: ");
        num2 = entrada.nextInt();

        if(num1 < 0)
        {
            num1 = num1 * (-1);
        }

        if(num2 < 0)
        {
            num2 = num2 * (-1);
        }

        if(num1 < num2)
        {
            for(int aux = num1; aux < num2; aux++)
            {
                System.out.println(aux);
            }
        }

        if(num2 < num1)
        {
            for(int aux = num2; aux < num1; aux++)
            {
                System.out.println(aux);
            }
        }

        if(num1 == num2)
        {
            System.out.println("Los números escritos son iguales.");
        }

    }
}