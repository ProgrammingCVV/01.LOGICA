import java.util.Scanner;
public class pg_166_5{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("****************************************************************************");
        System.out.println("LEER UN NÚMERO ENTERO DE DOS DÍGITOS Y DETERMINAR SI AMBOS DÍGITOS SON PARES");
        System.out.println("****************************************************************************");
        System.out.println("");

        int num = 0;
        int Ud = 0;
        int PUd = 0;

        System.out.print("Escriba un número entero de 2 dígitos:  ");
        num = entrada.nextInt();

        if(num <= 0){
            num = num*(-1);
        }

        if(num >= 10 && num <= 99){
            Ud = num - num / 10 * 10;
            PUd = (num / 10) % 10;


            System.out.println("El último dígito es: " + Ud);

                if(Ud == Ud / 2 * 2){
                    System.out.println("Este último dígito es un número PAR.");
                    }else{
                        System.out.println("Este último dígito es IMPAR.");
                    }

            System.out.println("El penúltimo dígito es:  " + PUd);

                if(PUd == PUd / 2 * 2){
                    System.out.println("Este penúltimo dígito es un número PAR.");
                    }else{
                        System.out.println("Este penúltimo dígito es IMPAR.");
                    }

            System.out.print("SIENDO QUE EL PENÚLTIMO NÚMERO ES "+PUd+" Y EL ÚLTIMO NÚMERO ES "+Ud+", ");

                if(Ud == Ud / 2 * 2 && PUd == PUd / 2 * 2){
                    System.out.println("PODEMOS DECIR QUE AMBOS NÚMEROS SON PARES.");
                    }else{
                        System.out.println("PODEMOS DECIR QUE UNO DE LOS DOS NÚMEROS ES IMPAR.");
                    }

        }else{
            System.out.println("EL NÚMERO NO CONTIENE 2 DÍGITOS. INTENTE NUEVAMENTE.");
        }

    }
}
