import java.util.Scanner;

public class Pg_180_While_Ej1_CuantosDigitosTiene
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num;
        int cuenta = 0;

        System.out.println("");
        System.out.println("********************************************************");
        System.out.println("LEER UN NÚMERO ENTERO Y DETERMINAR CUÁNTOS DÍGITOS TIENE");
        System.out.println("********************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        while(num != 0)
        {
            num = num / 10;
            cuenta += 1;
        }
        
        System.out.println("");
        System.out.println("El número escrito tiene " + cuenta + " dígitos.");



    }
}