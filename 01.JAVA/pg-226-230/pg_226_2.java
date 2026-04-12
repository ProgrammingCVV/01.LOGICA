import java.util.Scanner;

public class pg_226_2
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num;
        int i = 0;

        System.out.println("");
        System.out.println("**************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO Y MOSTRAR TODOS LOS PARES COMPRENDIDOS ENTRE 1 Y EL NÚMERO LEÍDO");
        System.out.println("**************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        if (num < 0)
        {
            num = num * (-1);
        }

        while (i <= num) 
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
            i ++;       
        }
    }
}