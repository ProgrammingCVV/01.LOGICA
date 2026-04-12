import java.util.Scanner;
public class DA_Secuencia_Nom_Num{
    public static void main(String[] args){

        int num = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número Entero:  ");
        num = entrada.nextInt();

        if(num < 0){
            num = num*(-1);
        }if(num > 0){
            if (num == 1){
                System.out.print("El número 1 es UNO.");
                }else{
                    if(num == 2){
                        System.out.print("El número 2 es DOS.");
                    }else{
                        if(num == 3){
                            System.out.print("El número 3 es TRES.");
                        }else{
                            if(num == 4){
                                System.out.print("El número 4 es CUATRO.");
                            }else{
                                if(num == 5){
                                    System.out.print("El número " + num + " es CINCO.");
                                }else{
                                    System.out.print("El número es MAYOR QUE CINCO!");
                                }
                            }
                        }
                    }
                }

            }
        



    }
}