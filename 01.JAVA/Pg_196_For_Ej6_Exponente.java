import java.util.Scanner;

public class Pg_196_For_Ej6_Exponente
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int bas, exp;

        System.out.println("");
        System.out.println("**********************************************************************************");
        System.out.println("LEER UN PRIMER NÚMERO BAS, LEER UN SEGUNDO NÚMERO EXP, ELEVAR LA BASE AL EXPONENTE");
        System.out.println("**********************************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer número(Base): ");
        bas = entrada.nextInt();

        System.out.print("Escriba el segundo número (Exponente): ");
        exp = entrada.nextInt();

        if(exp > 0)
        {
            int cuenta = 1;
            int result = 1;

            for (cuenta = 1; cuenta <= exp; cuenta ++)
            {
                result = bas * result;
            
                System.out.println(cuenta);
            }

            System.out.println("El resultado es: " + result);
        }
        else
        {
            System.out.println("El exponente debe ser un número positivo.");
        }

    }
}