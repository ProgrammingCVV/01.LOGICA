public class Pg_212_While_Ej8mul
{
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("*********************");
        System.out.println("TABLAS DE MULTIPLICAR");
        System.out.println("*********************");
        System.out.println("");

        int m1 = 0;

        while(m1 <= 3)
        {
            System.out.println("");
            System.out.println("TABLA DEL " + m1);
            System.out.println("");

            int m2 = 1;

            while(m2 <= 10) 
            {
                System.out.println(m1 + " X " + m2 + " = " + (m1 * m2));

                m2 += 1;              
            }
            m1 += 1;
        }
        System.out.println("");
    }
}