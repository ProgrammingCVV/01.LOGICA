import java.util.Scanner;

public class pg_167_24
{
    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

    System.out.println("");
    System.out.println("******************************************************************************");
    System.out.println("LEER UN NÚMERO ENTERO DE TRES DÍGITOS Y DETERMINAR CUÁNTOS DIGITOS PARES TIENE");
    System.out.println("******************************************************************************");
    System.out.println("");

    
    int num = 0, dig1 = 0, dig2 = 0, dig3 = 0, cuenta1 = 0, cuenta2 = 0, cuenta3 = 0, suma = 0;

    System.out.print("Escriba un número entero de tres dígitos:");
    num = entrada.nextInt();

    if(num < 0)
    {   
        num = num * (-1);
    }

    if(num >= 100 && num <= 999) 
    {    
        dig1 = (num / 100) % 10;
        dig2 = (num / 10) % 10;
        dig3 = num - (num / 10 * 10);
    

        if(dig1 % 2 == 0)
        {
            cuenta1 +=1;
        }

        if(dig2 % 2 == 0)
        {
            cuenta2 +=1;
        }

        if(dig3 % 2 == 0)
        {
            cuenta3 +=1;
        }

        suma = cuenta1 + cuenta2 + cuenta3;

        if(suma == 0)
        {
            System.out.println("No hay dígitos pares.");
        }else
            {
                System.out.println("Los dígitos pares son: " + suma);
            }

    }else
        {
            System.out.println("El número escrito no tiene 3 dígitos. Intente nuevamente.");
        }   

    }
}