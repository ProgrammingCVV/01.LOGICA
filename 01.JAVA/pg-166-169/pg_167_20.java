import java.util.Scanner;
public class pg_167_20
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("");
        System.out.println("******************************************************");
        System.out.println("LEER TRES NÚMEROS ENTEROS Y MOSTRARLOS DECENDENTEMENTE");
        System.out.println("******************************************************");
        System.out.println("");

        int num1, num2, num3, mayor;

        System.out.println("Escriba 3 números enteros: ");
        System.out.println("");
        
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        System.out.print(num1);
        System.out.print(", " + num2);
        System.out.print(", " + num3);
        System.out.println("");

        if (num1 > num2 && num2 >= num3) 
        {
           System.out.println("1- " + num1);
           System.out.println("2- " + num2);
           System.out.println("3- " + num3);
        }
        if (num2 >= num1 && num1 >= num3) 
        {
           System.out.println("2- " + num2);
           System.out.println("1- " + num1);
           System.out.println("3- " + num3);
        }
        if (num3 >= num1 && num1 >= num2) 
        {
            System.out.println("3- " + num3);
            System.out.println("1- " + num1);
            System.out.println("2- " + num2);
        }
        if (num1 > num3 && num3 >= num2) 
        {
            System.out.println("1- " + num1);
            System.out.println("3- " + num3);
            System.out.println("2- " + num2);
        }
        if (num2 >= num3 && num3 >= num1) 
        {
            System.out.println("2- " + num2);
            System.out.println("3- " + num3);
            System.out.println("1- " + num1);
        }
        if (num3 >= num2 && num2 >= num1)
        {
            System.out.println("3- " + num3);
            System.out.println("2- " + num2);
            System.out.println("1- " + num1);
        }
  
        
    }
}