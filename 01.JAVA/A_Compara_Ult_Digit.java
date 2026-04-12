import java.util.Scanner;

public class A_Compara_Ult_Digit{

public static void main (String[] args){


    System.out.println("");
    System.out.println("****************************************************************************");
    System.out.println("COMPARAR 2 ULTIMOS DIGITOS DE NUMEROS DIFERENTES Y DECIR SI SON IGUALES O NO");
    System.out.println("****************************************************************************");
    System.out.println("");

       
    long num_1 = 0;
    long num_2 = 0;
    long ud1 = 0;
    long ud2 = 0;

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite el primer numero entero de 3 cifras o más: ");
      num_1 = entrada.nextLong();

    System.out.print("Digite el segundo numero entero de 3 cifras o más: ");
      num_2 = entrada.nextLong();

       
        if(num_1 < 0){
            num_1 = num_1 *(-1);
            ud1 = num_1 - num_1/10*10;
            System.out.println("El Ultimo Digito 1 es: " + ud1);
              }else{
                ud1 = num_1 - num_1/10*10;
                System.out.println("El Ultimo Digito 1 es: " + ud1);
              }

       if(num_2 < 0){
            num_2 = num_2*(-1);
            ud2 = num_2 - num_2/10*10;
            System.out.println("El Ultimo Digito 2 es: " + ud2);
              }else{
                ud2 = num_2 - num_2/10*10;
                System.out.println("El Ultimo Digito 2 es: " + ud2);
              }
        
       if(ud1 == ud2){
             System.out.print("Los ultimos digitos son IGUALES");
              }else{
             System.out.print("Los ultimos digitos son DIFERENTES");
              }
     }
    
    }
  
  

  



