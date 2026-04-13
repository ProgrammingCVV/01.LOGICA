import java.util.Scanner;
public class pg_168_31
{
    public static void main(String[] args)

    {
        Scanner entrada = new Scanner(System.in);

        int num = 0;

        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("LEER UN NÚMERO ENTERO Y DETERMINE SI ES IGUAL A 10");
        System.out.println("**************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        if (num < 0) 
        {
            num = num * (-1);    
        }

        if(num == 10)
        {
            System.out.println("El número escrito es igual a 10");
        }
        else
            {
                System.out.println("El número escrito es diferente de 10.");
            }

    }
}