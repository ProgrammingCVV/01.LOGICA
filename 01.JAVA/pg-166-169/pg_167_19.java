import java.util.Scanner;
public class pg_167_19

/* ESTE EJERCICIO SÓLO TENDRÁ SENTIDO SI AL USUARIO SE LE SOLICITA REEMPLAZAR 
 * CUALQUIERA DE LOS NÚMEROS YA PEDIDOS DESPUÉS DE HABERLOS OPERADO, PUES ESTE "REEMPLLAZO"
 * HARÁ LA VEZ DEL TERCER NÚMERO ENTERO QUE SE LEA.
 */
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("*******************************************************************************");
        System.out.println("LEER TRES NÚMEROS ENTEROS Y DETERMINAR CUÁL ES MAYOR. (USAR SOLO DOS VARIABLES)");
        System.out.println("*******************************************************************************");
        System.out.println("");

        int primerNumero, segundoNumero;

        System.out.println("Escriba 2 números enteros: ");
        System.out.println("");

        primerNumero = entrada.nextInt();
        segundoNumero = entrada.nextInt();

        if(primerNumero > segundoNumero)
        {
            System.out.println("El primer número es mayor que el segundo");
        }else
        {
            System.out.println("El segundo número es mayor que el primero");
        }

        System.out.println("");
        System.out.println("Reescriba el segundo número: ");
        System.out.println("");

        segundoNumero = entrada.nextInt();

        if(primerNumero > segundoNumero)
        {
            System.out.println("El primer número es mayor que el segundo.");
        }else
        {
            System.out.println("El segundo número es mayor que el primero.");
        }


    }
}