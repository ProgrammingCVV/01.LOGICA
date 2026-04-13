import java.util.Scanner;

public class pg_168_35
{
    public static void main (String[]args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("******************************************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE DOS DÍGITOS, GUARDAR CADA DÍGITO EN UNA VARIABLE DIFERENTE Y LUEGO MOSTRARLOS EN PANTALLA");
        System.out.println("******************************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero de dos dígitos: ");
        num = entrada.nextInt();

        if(num < 0) 
        {
            num = num *(-1);       
        }

        if(num >= 10 && num <= 99) 
        {
            int dig1 = (num / 10) % 10;
            int dig2 = num - (num / 10 * 10);

            System.out.println("El primer dígito es: " + dig1);
            System.out.println("El segundo dígito es: " + dig2);

        }else
        {
            System.out.println("El número escrito no tiene dos dígitos. Intente nuevamente.");
        }

    }

}