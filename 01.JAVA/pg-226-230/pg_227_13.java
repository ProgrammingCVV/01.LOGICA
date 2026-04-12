import java.util.Scanner;

public class pg_227_13
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("****************************************************************************************");
        System.out.println("LEER UN ENTERO Y MOSTRAR TODOS LOS MÚLTIPLOS DE 5 COMPRENDIDOS ENTRE 1 Y EL NÚMERO LEÍDO");
        System.out.println("****************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num *(-1);
        }

        int i;

        for(i = 1; i <= num; i++)
        {
            if (i % 5 == 0)
            {
                System.out.println(i);
            }
        }

    }
}