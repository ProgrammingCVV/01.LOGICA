import java.util.Scanner;
public class pg_166_04{
    public static void main(String[] args){

        System.out.println("");
        System.out.println("******************************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE DOS DÍGITOS Y DETERMINAR A CUÁNTO ES IGUAL LA SUMA DE SUS DÍGITOS");
        System.out.println("******************************************************************************************");
        System.out.println("");

        int num = 0;
        int Ud  = 0;
        int PUd = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número entero de 2 dígitos:  ");
        num = entrada.nextInt();
        System.out.println("");

        if(num <= 0){
            num = num*(-1);
        }

        if(num >= 10 && num <= 99){
            System.out.println("El número escrito es :" + num);

            Ud = num - num / 10 * 10;
            System.out.println("El último dígito es:  " + Ud);

            PUd = (num / 10) % 10;
            System.out.println("El penúltimo dígito es:  " + PUd);
            
            System.out.println("La suma de estos dos dígitos es:  " + ( Ud + PUd));



        }else{
            System.out.println("En número escrito NO TIENE 2 DIGITOS. Intente nuevamente.");
        }

    }
}