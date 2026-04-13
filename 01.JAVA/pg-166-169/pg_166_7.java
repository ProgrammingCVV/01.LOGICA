import java.util.Scanner;
public class pg_166_7
{
    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("***************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE 2 DÍGITOS, DETERMINAR SI ES PRIMO y SI ES NEGATIVO");
        System.out.println("***************************************************************************");
        System.out.println("");

        int num = 0;
        int suma = 0;
                       
        System.out.print("Escriba un número entero de dos dígitos:  ");
        num = entrada.nextInt();

        if(num < 0)
        {
            System.out.println("El número es negativo.");
            num = num * (-1);
        }else
        {
            System.out.println("El número es positivo.");
        }

        if (num >=99 && num <=-10 || num >=10 && num <=99 ) // El número debe tener 2 dígitos sea negativo o positivo (Número entero).
        {
            System.out.print("El número " + num + " tiene 2 dígitos ");
        
                //El siguiente ciclo for determina si un número es primo o no.

                for(int i = 2; i <= num; i++)
                {
                    int aux = num % i;      // Esta variable guarda el residuo de la iteración al número digitado.
                    if(aux == 0)
                    {
                        suma = suma + 1;    // Se sumarán todos los valores iguales a 0 almacenados en la variable aux.
                    }
                }
                if(suma <= 2)
                {              // Si la suma de la variable aux sólo llega a máximo 2, entonces el número será PRIMO.
                    System.out.println("y ES UN NÚMERO PRIMO.");
                }else
                {
                    System.out.println("pero NO es un número primo.");
                }            
        }else
          {
            System.out.println("El número escrito no tiene 2 dígitos.");
          }
    }
}