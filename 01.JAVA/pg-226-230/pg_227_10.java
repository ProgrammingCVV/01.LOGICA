import java.util.Scanner;

public class pg_227_10
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("");
        System.out.println("***********************************************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO Y DETERNAR A CUÁNTO ES IGUAL LA SUMA DE TODOS LOS ENTEROS COMMPRENDIDOS ENTRE 1 Y EL NÚMERO LEÍDO");
        System.out.println("***********************************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();


        int i;

        for(i = 0; i <= num; i++)
        {
            i = num * (num + 1) / 2;
        }
        
        System.out.print(i-1);
        
        

    }
}