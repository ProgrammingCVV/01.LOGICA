import java.util.Scanner;

public class pg_167_28
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num = 0;

        System.out.println("");
        System.out.println("*******************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO POSITIVO MENOR QUE 50 Y DETERMINAR SI ES UN NÚMERO PRIMO ");
        System.out.println("*******************************************************************************");
        System.out.println("");

        System.out.print("Escriba un número positivo menor a 50: ");
        num = entrada.nextInt();

        if(num > 0)
        {
            if(num < 50)
            {
                if(num == 1 || num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || 
                num == 19 || num == 23 || num == 29 || num == 31 || num == 37 || num == 41 || num == 43 || num == 47) 
                {
                    System.out.println("El número escrito es PRIMO.");                    
                }else
                    {
                        System.err.println("El número escrito NO ES PRIMO");
                    }
            }else
                {
                    System.out.println("El número es mayor que 50. Intente nuevamente.");
                }
        }else
            {
                System.out.println("El número escrito es negativo y no válido para la operación.");
            }
    }
}


// # PRIMOS HASTA EL 50: 1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47