import java.util.Scanner;
public class pg_166_13
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        System.out.println("");
        System.out.println("********************************************************************************************************");
        System.out.println("LEER DOS NÚMEROS ENTEROS DE DOS DÍGITOS Y DETERMINAR SI LA SUMA DE LOS DOS NÚMEROS ORIGINA UN NÚMERO PAR");
        System.out.println("********************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer número entero a sumar: ");
        System.out.print("");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero a sumar: ");
        System.out.print("");
        num2 = entrada.nextInt();

        if (num1 >= 10 && num1 <= 99 || num1 <= -10 && num2 >= -99)
        {
            if (num2 >= 10 && num2 <= 99 || num2 <= -10 && num2 >= -99) 
            {
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es " + resultado);

                if (resultado == resultado / 2 * 2) 
                {
                    System.out.println("El número resultado es PAR.");
                }else
                {
                    System.out.println("El número resultado es IMPAR.");
                }
            }else
            {
                System.out.println("Alguo de los números escritos o ambos no tiene(n) dos dígitos y el programa no podrá ejecutarse.");
            }
        }else
        {
            System.out.println("Alguo de los números escritos o ambos no tiene(n) dos dígitos y el programa no podrá ejecutarse.");
        }

    }
}