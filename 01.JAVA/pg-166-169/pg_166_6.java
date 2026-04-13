import java.util.Scanner;
public class pg_166_6
{
    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE 2 DÍGITOS MENOR QUE 20 Y DETERMINAR SI ES PRIMO");
        System.out.println("************************************************************************");
        System.out.println("");

        int num = 0;
        int suma = 0;
               
        System.out.print("Escriba un número entero de dos dígitos menor que 20:  ");
        num = entrada.nextInt();

        if(num < 0) 
        {
            num = num * (-1);
        }

        if (num >=10 && num <20 ) 
        {
        
        //El siguiente for determina si un número es primo o no.

        for(int i = 2; i <= num; i++)
        {
            int aux = num % i;

            if(aux == 0)
            {
                suma = suma + 1;
            }
        }

        if(suma <= 2)
        {
            System.out.println("El número " + num + " ES UN NÚMERO PRIMO.");
        } else
            {
                System.err.println("El número " + num + " NO es un número primo.");
            }
    

        }else
        {
            System.out.println("El número escrito no tiene 2 dígitos o no es menor que 20.");
        }
    }
}
