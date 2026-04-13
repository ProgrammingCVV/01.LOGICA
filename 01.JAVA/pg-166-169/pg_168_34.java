import java.util.Scanner;
public class pg_168_34
{
    public static void main (String[] args)
    {

        int num, dig1, dig2, dig3, result;

        System.out.println("");
        System.out.println("***********************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO MENOR QUE 1000 Y DETERMINAR CUÁNTOS DÍGITOS TIENE");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero menor que 1000: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }
        
        if(num > 0 && num < 1000)
        {
            dig1 = (num / 100) % 10;
            dig2 = (num / 10) % 10;
            dig3 = num - (num / 10 * 10);

            if(dig1 > 0)
            {
                dig1 = 1;
            }
            if(dig2 >= 0)
            {
                dig2 = 1;
            }
            if(dig3 >= 0)
            {
                dig3 = 1;
            }

           result = dig1 + dig2 + dig3;

            System.out.println("El número escrito tiene " + result +  " dígitos");
            

        }else
            {
            System.out.println("El número escrito no es menor que 1000. Intente nuevamente.");
            }
        
    }
}