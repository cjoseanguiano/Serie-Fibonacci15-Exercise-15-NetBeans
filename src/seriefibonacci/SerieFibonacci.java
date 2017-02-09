/*
15. Generar los N primeros términos de la serie de Fibonacci. El valor N(entero y positivo) deberá
ser leído por el teclado. En esta serie los dos primeros números son 1, y el resto se obtiene
sumando los dos anteriores: 1,1,2,3,5,8,13,21...
 */
package seriefibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class SerieFibonacci {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int temp;
        int numEntero;
        do {
            numEntero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));

            if (numEntero <= 0) {
                System.exit(0);
            }
            temp = numEntero;
            numEntero = num2;
            num2 = temp + numEntero;
            System.out.println("Number :" + num2);

        } while (numEntero != 0);
    }

}
