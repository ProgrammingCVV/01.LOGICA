import java.util.Scanner;
public class D_Secuencia_Neg_Pos{
    public static void main(String[] args){

        int num = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("DECISIONES ANIDADAS");
        System.out.println("");

        System.out.println("Escriba un número Entero:  ");
        num = entrada.nextInt();

        if(num > 0){
            if(num >= 10 && num <= 99){
                System.out.println("El número es positivo y tiene 2 dígitos.");
            }else{
                System.out.println("El número es positivo y NO tiene 2 dígitos.");
            }
        }else{
            if(num < 0){
                if(num >= -999 && num <= -100){
                    System.out.println("El número es negativo y tiene 3 dígitos.");
                }else{
                    System.out.println("El número es negativo y NO tiene 3 dígitos.");
                }

          }
        }

 }
}