import java.util.Scanner;
public class AA_Cuenta_Digitos{
    public static void main (String[] args){

        System.out.println("");
        System.out.println("===================================================");
        System.out.println("CUENTA CUÁNTOS DÍGITOS CONTIENE EL NÚMERO INGRESADO");
        System.out.println("===================================================");
        System.out.println("");

        long num = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un número:  ");
        num = entrada.nextInt();


        if(num < 0){
        num = num*(-1);
        }if(num >= 0 && num <= 9){
                 System.out.print("El número escrito tiene 1 dígito.");
                 }if(num >= 10 && num <= 99){
                     System.out.print("El número escrito tiene 2 dígitos.");
                     }if(num >= 100 && num <= 999){
                             System.out.print("El número escrito tiene 3 dígitos.");
                             }if(num >= 1000 && num <= 9999){
                                    System.out.print("El número escrito tiene 4 dígitos.");
                                    }if(num > 9999){
                                         System.out.print("El número escrito !TIENE MÁS DE 4 DÍGITOS!");
                                         }
         
                                        
    }
}