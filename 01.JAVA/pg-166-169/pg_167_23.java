import java.util.Scanner;
public class pg_167_23
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("*******************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE TRES DÍGITOS Y DETERMINAR CUÁNTOS DÍGITOS PRIMOS TIENE");
        System.out.println("*******************************************************************************");
        System.out.println("");

        int num;
        int cuentaPrimos;
    
        System.out.print("Escriba un número de tres dígitos: ");
        num = entrada.nextInt();

        if (num < 0)
        {
            num = num * (-1);
        }

        if(num >= 100 && num <= 999) 
        {
            int dig1 = (num / 100) % 10;
            int dig2 = (num /10) % 10;
            int dig3 = num - (num / 10 * 10);

            cuentaPrimos = 0;

            if (dig1 == 1 || dig1 == 2 || dig1 == 3 || dig1 == 5 || dig1 == 7) 
            {
                cuentaPrimos += 1;
            }

            if (dig2 == 1 || dig2 == 2 || dig2 == 3 || dig2 == 5 || dig2 == 7) 
            {
                cuentaPrimos += 1;
            }

            if (dig3 == 1 || dig3 == 2 || dig3 == 3 || dig3 == 5 || dig3 == 7) 
            {
                cuentaPrimos += 1;
            }

            System.out.println("Hay " + cuentaPrimos + " dígitos primos.");

        }else
        {
            System.out.println("El número escrito no tiene tres dígitos. Intente nuevamente.");
        }

    }
    

}
