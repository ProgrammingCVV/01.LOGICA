import java.util.Scanner;

public class Pg_186_While_Ej3_CualTieneMasDigitos
{
    public static void main(String[] args) {
        {
            Scanner entrada = new Scanner(System.in);

            int num1, num2;

            System.out.println("");
            System.out.println("**********************************************************************");
            System.out.println("LEER DOS NÚMERO ENTEROS Y DETERMINAR CUÁL DE LOS DOS TIENE MÁS DÍGITOS");
            System.out.println("**********************************************************************");
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

            int count1 = 0; 

            while(num1 != 0)
            {
                num1 = num1 / 10;
                count1 += 1;
            }

            int count2 = 0;

            while(num2 != 0)
            {
                num2 = num2 / 10;
                count2 += 1;
            }

            if (count1 > count2)
            {
                System.out.println("El primer número escrito tiene más dígitos que el segundo.");
            }

            if(count2 > count1)
            {
                System.out.println("El segundo número escrito tiene más dígitos que el primero.");
            }

            if(count1 == count2)
            {
                System.out.println("Los números escritos tienen la misma cantidad de dígitos");
            }



        }
    }
}