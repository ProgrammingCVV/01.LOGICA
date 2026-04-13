import java.util.Scanner;
public class pg_168_33
{
    public static void main(String[] args)
    {

        int num, Ud;

        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("LEER UN NúMERO ENTERO Y DETERMINAR SI TERMINA EN 7");
        System.out.println("**************************************************");
        System.out.println("");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if (num > 0)
        {
            Ud = num - (num / 10 * 10);

            if(Ud == 7)
            {
                System.err.println("El número finaliza en 7.");
            }else
            {
                System.out.println("El número NO finaliza en 7.");
            }
        }
    }
}