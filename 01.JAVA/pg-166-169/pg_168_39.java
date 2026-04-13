import java.util.Scanner;

public class pg_168_39
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("");
        System.out.println("******************************************************************************************");
        System.out.println("LEER TRES NÚMEROS ENTEROS Y DETERMINAR SI EL PENÚLTIMO DÍGITO DE LOS TRES NÚMEROS ES IGUAL");
        System.out.println("******************************************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer número entero: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero: ");
        num2 = entrada.nextInt();

        System.out.print("Escriba el tercer número entero: ");
        num3 = entrada.nextInt();

        if(num1 < 0)
        {
            num1 = num1 * (-1);
        }

        if(num2 < 0)
        {
            num2 = num2 * (-1);
        }

        if(num3 < 0)
        {
            num3 = num3 * (-1);
        }

        if(num1 / 10 % 10 == num2 / 10 % 10 && num2 / 10 % 10 == num3 / 10 % 10)
        {
            System.out.println("El penúltimo dígito de los tres números escritos es igual.");
        }else
            {
                System.out.println("El penúltimo dígito de los tres números escritos NO es igual.");
            }

    }
}