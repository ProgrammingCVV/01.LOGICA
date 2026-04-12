import java.util.Scanner;

public class Pg_217_While_For_Ej8_3_Digitos_Enteros
{
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("********************************************************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO Y MOSTRAR EN PANTALLA TODOS LOS ENTEROS COMPRENDIDOS ENTRE EL 1 Y CADA UNO DE LOS DÍGITOS DEL NÚMERO LEÍDO");
        System.out.println("********************************************************************************************************************************");
        System.out.println("");

        Scanner entrada = new Scanner(System.in);
        
        int num;
        int dig;
        

        System.out.println("Escriba un número entero: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }

        while(num != 0)
        {
            System.out.println(num + " Número Digitado");;
            dig = num - (num / 10 * 10);

            int aux = 1;

            for(aux = 1; aux == dig; aux++)
            {
                System.out.println(aux);
            }
            System.out.println(dig);

            num = num / 10;
        }

        

    }
}