import java.util.Scanner;

public class pg_168_40
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num1, num2; 

        
        System.out.println("");
        System.out.println("*******************************************************************************************");
        System.out.println("LEER DOS NÚMEROS ENTEROS Y SI LA DIFERENCIA ENTRE LOS DOS ES MENOR QUE 10, ENTONCES MOSTRAR");
        System.out.println("EN PANTALLA TODOS LOS ENTEROS COMPRENDIDOS ENTRE EL MENOR Y EL MAYOR DE LOS NÚMEROS LEÍDOS.");
        System.out.println("*******************************************************************************************");
        System.out.println("");

        System.out.print("Escriba el primer número entero: ");
        num1 = entrada.nextInt();

        System.out.print("Escriba el segundo número entero: ");
        num2 = entrada.nextInt();

        if(num1 < 0  || num2 < 0)
        {
            num1 = num1 * (-1);
            num2 = num2 * (-1);
        }

            if((num1 - num2) == 1)
            {
                System.out.println(num2 + ", " +  num1);
            }
            if((num1 - num2) == 2)
            {
                System.out.println(num2 + ", " + (num2 += 1) + ", " +  num1);
            }
            if((num1 - num2) == 3)
            {
                System.out.println(num2 + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " +  num1);
            }
            if((num1 - num2) == 4)
            {
                System.out.println(num2 + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " +  num1);
            }
            if((num1 - num2) == 5)
            {
                System.out.println(num2 + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " +  num1);
            }
            if((num1 - num2) == 6)
            {
                System.out.println(num2 + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " +  num1);
            }
            if((num1 - num2) == 7)
            {
                System.out.println(num2 + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " +  num1);
            }
            if((num1 - num2) == 8)
            {
                System.out.println(num2 + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " +  num1);
            }
            if((num1 - num2) == 9)
            {
                System.out.println(num2 + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " + (num2 += 1) + ", " +  num1);
            }

                if((num2 - num1) == 1)
                {
                    System.out.println(num1 + ", " +  num2);
                }
                if((num2 - num1) == 2)
                {
                    System.out.println(num1 + ", " + (num1 += 1) + ", " +  num2);
                }
                if((num2 - num1) == 3)
                {
                    System.out.println(num1 + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " +  num2);
                }
                if((num2 - num1) == 4)
                {
                    System.out.println(num1 + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " +  num2);
                }
                if((num2 - num1) == 5)
                {
                    System.out.println(num1 + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " +  num2);
                }
                if((num2 - num1) == 6)
                {
                    System.out.println(num1 + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " +  num2);
                }
                if((num2 - num1) == 7)
                {
                    System.out.println(num1 + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " +  num2);
                }
                if((num2 - num1) == 8)
                {
                    System.out.println(num1 + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " +  num2);
                }
                if((num2 - num1) == 9)
                {
                    System.out.println(num1 + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " + (num1 += 1) + ", " +  num2);
                }

    }
}