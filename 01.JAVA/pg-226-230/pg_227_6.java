import java.util.Scanner;

public class pg_227_6
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num;
        int dig1, dig2, dig3;

        System.out.println("");
        System.out.println("****************************************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE TRES DÍGITOS Y MOSTRAR TODOS LOS ENTEROS COMPRENDIDOS ENTRE 1 Y CADA UNO DE LOS DÍGITOS");
        System.out.println("****************************************************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número entero de tres dígitos: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        if (num >= 100 && num <= 999)
        {
            dig1 = (num / 100) % 10;
            dig2 = (num / 10) % 10;
            dig3 = num - (num / 10 * 10);    

            System.out.println(dig1 + " " + dig2 + " " + dig3);
        

        int i, j, k = 0;

            for(i = 1; i <= dig1; i++)
            {
                System.out.println(i);
            }
            System.out.println("");

            for(j = 1; j <= dig2; j++)
            {
                System.out.println(j);
            }
            System.out.println("");

            for(k = 1; k <= dig3; k++)
            {
                System.out.println(k);
            }
            System.out.println("");


        }else
            {
                System.out.println("El número escrito no tiene 3 Dígitos. Intente nuevamete.");
            }



    }
}