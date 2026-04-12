public class pg_227_9
{
    public static void main(String[] args) {
        {
            
            System.out.println("");
            System.out.println("*********************************************************************************");
            System.out.println("MOSTRAR EN PANTALLA TODOS LOS NÚMEROS TERMINADOS EN 6 COMPRENDIDOS ENTRE 25 Y 205");
            System.out.println("*********************************************************************************");
            System.out.println("");

            int i = 25;

            for(i = 25; i <= 205; i++)
            {
                if(i % 10 == 6)
                {
                    System.out.println(i);
                }
            }
        }
    }
}