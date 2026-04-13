import java.util.Scanner;

public class pg_168_37
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("");  
        System.out.println("**************************************************************");  
        System.out.println("LEER DOS NÚMEROS ENTEROS Y DETERMINAR CUÁL ES MULTIPLO DE CUÁL");  
        System.out.println("**************************************************************");  
        System.out.println("");
        
        System.out.print("Escriba el primer número entero: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero: ");
        num2 = entrada.nextInt();

        if(num1 < 0)
        {
            num1 = num1 * (-1);
        }

        if(num2 < 0)
        {
            num2 = num2 * (-1);
        }

        if(num1 % num2 == 0)
        {
            System.out.println("El primer número es múltiplo del segundo.");
        }else
            {
                System.out.println("El primer número no es múltiplo del segundo.");
            }
        
        if(num2 % num1 == 0)
        {
            System.out.println("El segundo número es múltiplo del primero.");
        }else
            {
                System.out.println("El segundo número no es múltiplo del primero.");
            }
        
        
    }
}