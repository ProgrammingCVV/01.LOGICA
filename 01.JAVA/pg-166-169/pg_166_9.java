import java.util.Scanner;
public class pg_166_9
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("***************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE 2 DÍGITOS Y DETERMINAR SI UNO ES MÚLTIPLO DEL OTRO");
        System.out.println("***************************************************************************");
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

        if (num >=10 && num <= 99) 
        {        
            Pd = (num / 10) % 10;
            Sd = num - (num / 10 * 10);

            System.out.println(Pd);
            System.out.println(Sd);

            if(Sd % Pd == 0 || Pd % Sd == 0)
            {
                System.out.println("Un dígito es múltiplo del otro.");
            }else
            {
                System.out.println("Un dígito NO es mútiplo del otro.");
            }
        }else
        {
            System.out.println("El número escrito no tiene dos digitos.");
        }
    }
}