import java.util.Scanner;
public class EA_SCBD_Anidado{
    public static void main(String[] args){

        int num = 0;
        int digi = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ecriba un número de parámetro entre 1 y 5:  ");
        num = entrada.nextInt();

        if(num < 0)
        {
            num = num*(-1);
        }
        switch(num)
        {
            case 1: System.out.println("El número " + num + " es UNO.");
                break;
            case 2: System.out.println("El número " + num + " es DOS.");
                break;
            case 3: System.out.println("El número " + num + " es TRES.");
                break;
            case 4: System.out.println("El número " + num + " es CUATRO.");
                break;
            case 5: System.out.println("El número " + num + " es CINCO. ");
                
                System.out.println("");
                System.out.print("Escriba un dígito entre el 1 y 5:  ");

                digi = entrada.nextInt();

                    if(digi < 0)
                    {
                        digi = digi*(-1);
                    }

                    switch(digi)
                    {
                        case 1: System.out.println("El número es " + num + "" + digi);
                            break;
                        case 2: System.out.println("El número es " + num + "" + digi);
                            break;
                        case 3: System.out.println("El número es " + num + "" + digi);
                            break;
                        case 4: System.out.println("El número es " + num + "" + digi);
                            break;
                        case 5: System.out.println("El número es " + num + "" + digi);
                            break;

                        default: System.out.print("El Digi es mayor que CINCO!");
                            break;
            
                    } 

        }


    }
}