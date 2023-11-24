/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itsoeh.principal;

import java.util.Scanner;

/**
 *
 * @author apple29
 */
public class formulaCuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Ingresar los coeficientes de los parametros correspondientes en orden
        System.out.println("Ingrese el parámetro de \"a\" de la ecuación cuadrática");
        double a = in.nextDouble();
        System.out.println("Ingrese el parámetro de \"b\" de la ecuación cuadrática");
        double b = in.nextDouble();
        System.out.println("Ingrese el parámetro de \"c\" de la ecuación cuadrática");
        double c = in.nextDouble();
        in.close();
        
        //Operacion del discriminante
        double discriminante = (Math.pow(b, 2)) - (4*a*c);

        //Tomando en cuenta el discriminante si es mayor a 0 o menor, o igual
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            
            System.out.println("La ecuación tiene dos soluciones sobre el conjunto de los números reales: \nx1 = "+x1+"\nx2 = "+x2);
        } else {
            if (discriminante==0) {
                double x = -b/(2*a);
                System.out.println("La ecuación solo tiene una solución sobre el conjunto de los números reales: \nx = "+x);
            } else {
                System.out.println("La ecuación no tiene una solución en el conjunto de los números reales,esta se encuentra en los números complejos");
            }
        }
    }
    
}
