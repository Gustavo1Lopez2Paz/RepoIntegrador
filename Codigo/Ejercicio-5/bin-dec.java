// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa un numero binario");
        String numeroBin = in.nextLine();
        int longitud = numeroBin.length();
        int numeroDecimal = 0;
        
        for (int i = 0; i < longitud; i++) {
            
            char digito = numeroBin.charAt(i);
            
            //verificacion si es 0 o 1
            if (digito == '0') {
                numeroDecimal *= 2;
            } else if(digito == '1') {
                numeroDecimal = (numeroDecimal * 2) + 1;
            } else {
                System.out.println("El numero binario ingresado no es valido");
                return;
            }
        }
        System.out.println("El numero decimal equivalente es " + numeroDecimal);
        
    
    }