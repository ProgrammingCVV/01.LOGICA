import java.util.Scanner;

public class pg_169_48
{
    public static void main(String[] args) {
        {
            Scanner entrada = new Scanner(System.in);

            int num;

            System.out.println("");
            System.out.println("*********************************************************************");
            System.out.println("LEER UN NÚMERO ENTERO Y, SI ES MENOR QUE 100, DETERMIMAR SI ES PRIMO.");
            System.out.println("*********************************************************************");
            System.out.println("");

            System.out.print("Escriba un número entero: ");
            num = entrada.nextInt();

            if(num < 0)
            {
                num = num * (-1);
            }

            if(num <= 99)
            {
                if(num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19 || 
                num == 23 || num == 29 || num == 31 || num == 37 || num == 41 || num == 43 || num == 47 || num == 53 || 
                num == 59 || num == 61 || num == 67 || num == 71 || num == 73 || num == 79 || num == 83 || num == 89 || num == 97)

                {
                    System.out.println("El número escrito es un número primo menor que 100.");
                }else
                    {
                        System.out.println("El número escrito NO es un número primo menor que 100.");
                    }
           

            }else
                {
                    System.out.println("El número escrito no es menor que 100.");
                }

        }
    }
}