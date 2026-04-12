import java.util.Scanner;

public class Pg_194_For_Ej5_Factorial
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("");
        System.out.println("*********************************************");
        System.out.println("LEER UN NÚMERO ENTERO Y CALCULAR SU FACTORIAL");
        System.out.println("*********************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        if(num > 0)
        {
            int cuenta = 1;
            int facto = 1;

            for(cuenta = 1; cuenta <= num; cuenta ++)
            { 
                facto = facto * cuenta;
            }

            System.out.println("");
            System.out.println("El factorial de " + num + " es " + facto);
            System.out.println("");
        }
        else
        {
            System.out.println("El factorial no está definido para números negativos.");
        }
        
    }
}