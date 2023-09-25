package www.rodrigoledesmagarcia.com.mx;

import java.util.Scanner;

public class NumeroNegativoPositivo {
    public static void main(String[] args) {
        float numero;
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Ingrese el número del que quiere saber si es negativo o positivo: ");
        numero = input.nextFloat();

        if ( numero > 0 ) {
            System.out.println("El número ".concat(String.valueOf(numero)).concat(" es positivo"));
        } else {
            System.out.println("El número ".concat(String.valueOf(numero)).concat(" es negativo"));
        }


    }
}
