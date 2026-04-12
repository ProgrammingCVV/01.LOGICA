public class pg_227_14
{
    public static void main(String[] args) 
    {
        System.out.println("");       
        System.out.println("**************************************************");       
        System.out.println("MOSTRAR EN PANTALLA LOS PRIMEROS 20 MÚLTIPLOS DE 3");       
        System.out.println("**************************************************");       
        System.out.println("");        

        int num = 60;
        int i ;

        for(i = 1; i <= num; i++)
        {
            if(i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }
}