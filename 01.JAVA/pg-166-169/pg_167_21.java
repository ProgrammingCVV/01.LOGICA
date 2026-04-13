import java.util.Scanner;
public class pg_167_21
{
    public static void main(String[] args)
    {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("***************************************************************************************************");
        System.out.println("LEER TRES NÚMEROS ENTEROS DE DOS DÍGITOS Y DETERMINAR EN CUÁL DE ELLOS SE ENCUENTRA EL MAYOR DÍGITO");
        System.out.println("***************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer número de dos dígitos: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número de dos dígitos: ");
        num2 = entrada.nextInt();

        System.out.print("Escriba el segundo número de dos dígitos: ");
        num3 = entrada.nextInt();

        if(num1 < 0)
        {
            num1 = num1 * (-1); 
        }
        if(num2 < 0)
        {
            num2 = num2 * (-1);
        }
        if(num3 < 0)
        {
            num3 = num3 * (-1);
        }

if(num1 >= 10 && num1 <= 99)
    {
        int dig1 = (num1 / 10) % 10;
        int dig2 = num1 - (num1 / 10 * 10);

        if(num2 >= 10 && num2 <=99 )
        {
            int dig3 = (num2 / 10) % 10;
            int dig4 = num2 - (num2 / 10 * 10);
         
            if(num3 >= 10 && num3 <= 99)
            {
                int dig5 = (num3 / 10) % 10;
                int dig6 = num3 - (num3 / 10 * 10);
                
                if(dig1 > dig2 && dig1 > dig3 && dig1 > dig4 && dig1 > dig5 && dig1 > dig6)
                {
                System.out.println("El mayor dígito está en el " + num1);
                }
                    if(dig2 > dig1 && dig2 > dig3 && dig2 > dig4 && dig2 > dig5 && dig2 > dig6)
                    {
                    System.out.println("El mayor dígito está en el " + num1);
                    }
                        if(dig3 > dig1 && dig3 > dig2 && dig3 > dig4 && dig3 > dig5 && dig3 > dig6)
                        {
                        System.out.println("El mayor dígito está en el " + num2);
                        }
                            if(dig4 > dig1 && dig4 > dig2 && dig4 > dig3 && dig4 > dig5 && dig4 > dig6)
                            {
                            System.out.println("El mayor dígito está en el " + num2);
                            }
                                if(dig5 > dig1 && dig5 > dig2 && dig5 > dig3 && dig5 > dig4 && dig5 > dig6)
                                {
                                System.out.println("El mayor dígito está en el " + num3);
                                }
                                    if(dig6 > dig1 && dig6 > dig2 && dig6 > dig3 && dig6 > dig4 && dig6 > dig5)
                                    {
                                    System.out.println("El mayor dígito está en el " + num3);
                                    }
            }
            else
            {
                System.out.println("Alguno de los tres números no tiene 2 dígitos. Intente de nuevo.");
            }
        }
        else
        {
            System.out.println("Alguno de los tres números no tiene 2 dígitos. Intente de nuevo.");
        }
    }
    else
    {
        System.out.println("Alguno de los tres números no tiene 2 dígitos. Intente de nuevo.");
    }

    }

}
