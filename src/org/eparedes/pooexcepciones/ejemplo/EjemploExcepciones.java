package org.eparedes.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String divisor = JOptionPane.showInputDialog("Ingrese un entero divisor: ");

        try {
            double division2 = cal.dividir(numerador, divisor);
            System.out.println("division2 = " + division2);
        } catch (FormatoNumeroException e){
            System.out.println("Se detecto una excepción: ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
            main(args);
            System.exit(0);
        } catch (DivisionPorZeroException ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecución: " + ae.getMessage());
            main(args);
            System.exit(0);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepción");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación");
    }
}
