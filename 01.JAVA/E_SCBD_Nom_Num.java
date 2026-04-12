import java.util.Scanner;
public class E_SCBD_Nom_Num{
    public static void main(String[] args){

        int num = 0;
        int parametro = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el parámetro de ejecución en número del 1 al 5:  ");
        parametro = entrada.nextInt();

        if(parametro < 0){
            parametro = parametro*(-1);
        }
        switch(parametro){
            case 1: System.out.print("El número 1 es UNO.");
                    break;
            case 2: System.out.print("El número 2 es DOS.");
                    break;
            case 3: System.out.print("El número 3 es TRES.");
                    break;
            case 4: System.out.print("El número 4 es CUATRO.");
                    break;
            case 5: System.out.print("El número 5 es CINCO.");
                    break;

            default: System.out.print("El número es MAYOR QUE CINCO!");

        }

    }
}