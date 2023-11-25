package com.mycompany.conversiondecimalbinario;

// @author EVELIN_GÓMEZ 

import java.util.Scanner;
public class ConversionDecimalBinario {

    public static void main(String[] args) {
        //ENTRADA
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un número decimal");
        int númeroDecimal=entrada.nextInt();
        
        //PROCESO
        if (númeroDecimal<0) {
            System.out.println("El número debe ser entero no negativo");
            return;
        }
        String númeroBinario="";
        if (númeroDecimal==0) {
            númeroBinario="0";
        } else {
            while (númeroDecimal>0) {
                int residuo=númeroDecimal%2;
                númeroBinario=residuo+númeroBinario;
                númeroDecimal=númeroDecimal/2;
            }
        }
        //SALIDA
        System.out.println("El número Binario equivalente es " + númeroBinario);
    }
}
