import java.util.Scanner;
public class C_Compara_Secuencia{
    public static void main(String[] args){

        int num = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("*********************************************************");
        System.out.println("COMPARA SI EL NÚMERO ES POSITIVO, NEGATIVO O IGUAL A CERO");
        System.out.println("*********************************************************");
        System.out.println("");


        System.out.print("Escriba un múmero entero:  ");
        num = entrada.nextInt();

        if(num < 0){
            System.out.print("El número es NEGATIVO.");

        }if(num > 0){
            System.out.print("El número es POSITIVO.");

        }if(num == 0){
            System.out.print("El número es IGUAL a cero.");

        }

    }
}