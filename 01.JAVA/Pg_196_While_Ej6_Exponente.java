import java.util.Scanner;

public class Pg_196_While_Ej6_Exponente
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int base, exp;

        System.out.println("");
        System.out.println("**********************************************************************************");
        System.out.println("LEER UN PRIMER NÚMERO BAS, LEER UN SEGUNDO NÚMERO EXP, ELEVAR LA BASE AL EXPONENTE");
        System.out.println("**********************************************************************************");
        System.out.println("");

        System.err.print("Escribe el primer número (base): ");
        base = entrada.nextInt();

        System.out.print("Escribe el segundo número (Exponente): ");
        exp = entrada.nextInt();

        if(base > 0 && exp > 0)
        {
            int contador = 1;
            int resultado = 1;

            while(contador <= exp)
            {
            resultado = resultado * base;
            contador += 1;
            
            }

            System.out.println("El resultado es: " + resultado);
        }

        else
        {
            System.out.println("La base y el exponente deben ser positivos.");
        }

        
    }
}