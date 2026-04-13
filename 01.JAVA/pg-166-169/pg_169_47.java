import java.util.Scanner;

public class pg_169_47
{
    public static void main(String[] args) {
        {
            Scanner entrada = new Scanner(System.in);

            int num1, num2;

            System.out.println("");
            System.out.println("**********************************************************************************************************************************");
            System.out.println("#1. LEER  DOS NÚMEROS ENTEROS Y, SI LA DIFERENCIA ENTRE AMBOS ES PAR, MOSTRAR EN PANTALLA LA SUMA DE LOS DÍGITOS DE LOS 2 NÚMEROS.");
            System.out.println("#2.  SI   DICHA  DIFERENCIA  ES  UN  NÚMERO  PRIMO  MENOR   QUE  10 ,  MOSTRAR  EN  PANTALLA  EL  PRODUCTO  DE  LOS  2   NÚMEROS. ");
            System.out.println("#3.   SI  LA  DIFERENCIA  ENTRE  AMBOS  NÚMEROS   TERMINA   EN   4 ,  MOSTRAR  EN  PANTALLA  TODOS  LOS  DÍGITOS  POR  SEPARADO.  ");
            System.out.println("**********************************************************************************************************************************");
            System.out.println("");

            System.out.print("Escriba el primer número entero: ");
            num1 = entrada.nextInt();

            System.out.print("Escriba el segundo número entero: ");
            num2 = entrada.nextInt();

            int dif = num1 - num2;

            if(num1 < 0)
            {
                num1 = num1 * (-1);
            }

            if(num2 < 0)
            {
                num2 = num2 * (-1);
            }

                int dig1 = (num1 / 1000000000) % 10;
                int dig2 = (num1 / 100000000) % 10;
                int dig3 = (num1 / 10000000) % 10;
                int dig4 = (num1 / 1000000) % 10;
                int dig5 = (num1 / 100000) % 10;
                int dig6 = (num1 / 10000) % 10;
                int dig7 = (num1 / 1000) % 10;
                int dig8 = (num1 / 100) % 10;
                int dig9 = (num1 / 10) % 10;
                int dig10 = num1 - (num1 / 10 * 10);

                int digi1 = (num2 / 1000000000) % 10;
                int digi2 = (num2 / 100000000) % 10;
                int digi3 = (num2 / 10000000) % 10;
                int digi4 = (num2 / 1000000) % 10;
                int digi5 = (num2 / 100000) % 10;
                int digi6 = (num2 / 10000) % 10;
                int digi7 = (num2 / 1000) % 10;
                int digi8 = (num2 / 100) % 10;
                int digi9 = (num2 / 10) % 10;
                int digi10 = num2 - (num2 / 10 * 10);

            if(dif % 2 == 0)
            {
                int sum = dig1+dig2+dig3+dig4+dig5+dig6+dig7+dig8+dig9+dig10+digi1+digi2+digi3+digi4+digi5+digi6+digi7+digi8+digi9+digi10;

                System.out.println("#1. La diferencia entre los números escritos es un número par. La suma de todos los dígitos es: " + sum);

            }else
                {
                    System.out.println("#1. La diferencia entre los números escritos NO es un número par.");
                }
                  
            if(dif == 2 || dif == 3 || dif == 5 || dif ==7)
            {
                System.out.println("#2. La diferencia entre los números escritoes es un número primo menor que 10. El poducto de los números escritos es: " + (num1 * num2));
            }else
                {
                    System.out.println("#2. La diferencia entre los números escritoes NO es un número primo menor que 10.");
                }
           
            if(dif - (dif / 10 * 10) == 4)
            {
              System.out.println("#3. La diferencia entre los números escritos termina en 4. Todos los dígitos por separado son: " + dig1 + "," + dig2 + "," + dig3 + "," + dig4 + "," + dig5 + "," + dig6 + "," + dig7 + "," + dig8 + "," + dig9 + "," + dig10 + "," + digi1 + "," + digi2 + "," + digi3 + "," + digi4 + "," + digi5 + "," + digi6 + "," + digi7 + "," + digi8 + "," + digi9 + "," + digi10);
            }else
                {
                    System.out.println("#3. La diferencia entre los números escritos NO termina en 4.");
                }
        }
    }
}