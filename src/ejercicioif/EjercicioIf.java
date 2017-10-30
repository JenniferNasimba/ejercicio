/*
PROGRAMA QUE LEA UN NUMERO ENTERO Y MUESTRE SI EK NUMERO
ES MULTIPLO DE 10
*/

package ejercicioif;

import java.util.Scanner;

public class EjercicioIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner edadIngresada=new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad=edadIngresada.nextInt();
        if(edad>=18){
            System.out.println("Usted es mayor de edad");
            System.out.println("*********************");
        }
        else
            System.out.println("Usted es menor de edad");
    }
    
}
