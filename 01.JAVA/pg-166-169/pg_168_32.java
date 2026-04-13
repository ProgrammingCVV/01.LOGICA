import java.util.Scanner;
public class pg_168_32
{
    public static void main(String[] args) 
    {
        {
            Scanner entrada = new Scanner(System.in);

            int num; 

            System.out.println("");
            System.out.println("******************************************************");
            System.out.println("LEER UN NÚMERO ENTERO Y DETERMINAR SI ES MÚLTIPLO DE 7");
            System.out.println("******************************************************");
            System.out.println("");

            System.out.print("Escriba un número entero: ");
            num = entrada.nextInt();

            if(num < 0)
            {
                num = num * (-1);
            }

            if(num % 7 == 0)
            {
                System.out.println("El númerov " + num + " es múltipo de 7.");
            }
            else
                {
                    System.out.println("El número " + num + " escrito NO es múltiplo de 7.");
                }

        }
    }
}