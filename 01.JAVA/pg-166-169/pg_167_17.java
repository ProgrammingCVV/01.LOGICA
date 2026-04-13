import java.util.Scanner;
public class pg_167_17
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("********************************************************************************");
        System.out.println("LEER UN NÚMERO DE TRES DÍGITOS Y DETERMINAR EN QUÉ POSICIÓN ESTÁ EL MAYOR DÍGITO");
        System.out.println("********************************************************************************");
        System.out.println("");

        int num, Pd, Sd, Td;

        System.out.print("Escriba un número entero de tres dígitos: ");
        System.out.print("");
        num = entrada.nextInt();

        if (num < 0) 
        {
            num = num * (-1);
        }

        if (num >= 100 && num <= 999) 
        {
            Pd = (num / 100) % 10;
            Sd = (num / 10) % 10;
            Td = num - (num / 10 * 10);

        if (Pd > Sd && Pd > Td)
        {
            System.out.println("El mayor dígito se encuentra en la 1ra posición.");
        }
        if (Sd > Pd && Sd > Td)
        {
            System.out.println("El mayor dígito se encuentra en la 2da posición.");
        }
        if (Td > Pd && Td > Sd)
        {
            System.out.println("El mayor dígito se encuentra en la 3ra posición.");
        }

        }else
        {
            System.out.println("El número no tiene tres dígitos.");
        }
    }
}