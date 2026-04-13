import java.util.Scanner;

public class pg_168_38
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("");
        System.out.println("***************************************************************************************");
        System.out.println("LEER TRES NúMEROS ENTEROS Y DETERMINAR SI EL ÚLTIMO DÍGITO DE LOS TRES NÚMEROS ES IGUAL");
        System.out.println("***************************************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer número entero: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero: ");
        num2 = entrada.nextInt();

        System.out.print("Escriba el tercer número entero: ");
        num3 = entrada.nextInt();

        if(num1 < 0 )
        {
            num1 = num1 * (-1);
        }
        if(num2 < 0 )
        {
            num2 = num2 * (-1);
        }
        if(num3 < 0 )
        {
            num3 = num3 * (-1);
        }

        num1 = num1 - (num1 / 10 * 10);
        num2 = num2 - (num2 / 10 * 10);
        num3 = num3 - (num3 / 10 * 10);

        if(num1 == num2 && num2 == num3)
        {
            System.out.println("El último dígito de los tres números escritos son iguales.");
        }else
            {
                System.out.println("El último dígito de los tres números escritos NO son iguales.");
            }

    }
}