import java.util.Scanner;
public class pg_166_14
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("***************************************************************************************************");
        System.out.println("LEER DOS NÚMEROS ENTEROS DE DOS DÍGITOS Y DETERMINAR A CUÁNTO ES IGUAL LA SUMA DE TODOS LOS DÍGITOS");
        System.out.println("***************************************************************************************************");
        System.out.println("");

        int num1 = 0;
        int num2 = 0;
        int Pd1 = 0;
        int Sd1 = 0;
        int Pd2 = 0;
        int Sd2 = 0;
        int resultado = 0;

        System.out.print("Escriba el primer número entero de dos dígitos: ");
        System.out.print("");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero de dos dígitos: ");
        System.out.print("");
        num2 = entrada.nextInt();

        if (num1 < 0) 
        {
            num1 = num1 * (-1);
        }

        if (num2 < 0)
        {
            num2 = num2 * (-1);
        }

        if (num1 >= 10 && num1 <= 99 || num1 <= -10 && num1 >= -99) 
        {       
            Pd1 = (num1 / 10) % 10; 
            Sd1 = num1 - (num1 / 10  * 10);

            System.out.println("");
            System.out.println("Los dígitos del primer número escrito son " + Pd1 + " y " + Sd1);
            
            if (num2 >= 10 && num2 <= 99 || num2 <= -10 && num2 >= -99) 
            {
                Pd2 = (num2 / 10) % 10;
                Sd2 = num2 - (num2 / 10 * 10);

                System.out.println("");
                System.out.println("Los dígitos del segundo número escrito son " + Pd2 + " y " + Sd2);
                
                resultado = Pd1 + Sd1 + Pd2 + Sd2;

                System.out.println("");
                System.out.println("EL RESULTADO DE LA SUMA DE TODOS LOS DÍGITOS ES: " + resultado);

            }else
            {
                System.out.println("Alguno de los número escritos no tiene dos dígitos y el programa no podrá ejecutarse.");
            }
        }else
        {
            System.out.println("Alguno de los número escritos no tiene dos dígitos y el programa no podrá ejecutarse.");
        }
    }
}