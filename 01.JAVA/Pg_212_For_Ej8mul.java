public class Pg_212_For_Ej8mul
{
    public static void main (String[] args)
    {
        System.out.println("");
        System.out.println("*********************");
        System.out.println("TABLAS DE MULTIPLICAR");
        System.out.println("*********************");
        System.out.println("");

        int m1;
        
        for(m1 = 0; m1 <= 3; m1++)
        {
            System.out.println("");
            System.out.println("TABLA DEL " + m1);
            System.out.println("");

            int m2;

            for(m2 = 1; m2 <= 10; m2++)
            {
                System.out.println(m1 + " X " + m2 + " = " + m1 * m2);
            }
        }System.out.println("");
    }
}