public class pg_227_15
{
    public static void main(String[] args) 
    {
      
        System.out.println("");     
        System.out.println("*************************************************************************");     
        System.out.println("ESCRIBIR EN PANTALLA EL RESULTADO DE SUMAR LOS PRIMEROS 20 MÚLTIPLOS DE 3");     
        System.out.println("*************************************************************************");     
        System.out.println("");     
        
        
        int i;
        int suma = 0;
        
        for(i = 1; i <= 20; i ++)
        {
            suma += i * 3;
        }
        System.out.println(suma);
    
    }
}