import java.util.Scanner;

public class pg_166_8
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("*******************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE DOS DÍGITOS Y DETERMINAR SI SUS DOS DÍGITOS SON PRIMOS");
        System.out.println("*******************************************************************************");
        System.out.println("");

        int num = 0;
        int Sd  = 0;
        int Pd = 0;
         
        System.out.print("Escriba un número entero de Dos dígitos: ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num * (-1);
        }
        if(num >= 10 && num <= 99) 
        {
            Sd = num - (num/10*10);
            Pd = (num/10) % 10;
            
            System.out.println(Pd);
            System.out.println(Sd);
                        
            if((Pd==2 || Pd==3 || Pd==5 ||Pd==7) && (Sd==2 || Sd==3 || Sd==5 || Sd==7))
            {
                System.out.println("Los dos dígitos son números primos.");
            }else
            {
              System.out.println("Uno de los dos dígitos o ninguno es primo.");
            }
        }else
        {
            System.out.println("El número escrito no tiene dos dígitos.");
        }
    }
}