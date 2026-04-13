import java.util.Scanner;
public class pg_166_15
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("*******************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE TRES DÍGITOS Y DETERMINAR A CUÁNTO ES IGUAL LA SUMA DE SUS DÍGITOS");
        System.out.println("*******************************************************************************************");
        System.out.println("");

        int num = 0;
        int Pd = 0;
        int Sd = 0;
        int Td = 0;
        int resultado = 0;

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

            resultado = Pd + Sd + Td;

            System.out.println("El resultado de la suma de cada dígito escrito es: " + resultado);
            System.out.println("");

        }else
        {
            System.out.println("El número escrito no tene 3 dígitos.");
        }

    }
}