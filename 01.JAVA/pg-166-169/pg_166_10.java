import java.util.Scanner;
public class pg_166_10
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("********************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE DOS DÍGITOS Y DETERMINAR SI LOS DOS DÍGITOS SON IGUALES");
        System.out.println("********************************************************************************");
        System.out.println("");

        int num = 0;
        int Pd = 0;
        int Sd = 0;

        System.out.print("Escriba un número entero de dos dígitos: ");
        num = entrada.nextInt();

        if (num < 0)
        {
            num = num * (-1);   
        }

        if (num >= 10 && num <= 99)
        {
            Pd = (num / 10) % 10;
            Sd = num - (num / 10 * 10);

            if(Pd == Sd)
            {
                System.out.println("Los números escritos son iguales.");
            }else
            {
                System.out.println("Los números escritos NO son iguales.");
            }
        }else
        {
            System.out.println("El número escrito no tiene dos dígitos.");
        }


    }
    
}