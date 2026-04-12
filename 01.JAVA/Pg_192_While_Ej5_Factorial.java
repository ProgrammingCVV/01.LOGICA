import java.util.Scanner;

public class Pg_192_While_Ej5_Factorial
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num;
        int cuenta = 1;
        int facto = 1;

        System.out.println("");
        System.out.println("*********************************************");
        System.out.println("LEER UN NÚMERO ENTERO Y CALCULAR SU FACTORIAL");
        System.out.println("*********************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        if(num > 0)
        {
            while(cuenta <= num) 
            { 
                facto = facto * cuenta;
                cuenta += 1;
            }

            System.out.println("");
            System.out.println("El factorial de " + num + " es " + facto);
        }
        else
        {
            System.out.println("El factorial no está devinido para números negativos.");
        }



    }
}