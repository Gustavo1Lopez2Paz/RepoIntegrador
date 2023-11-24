

import java.util.Scanner;

/**
 * @author Yael Gonzalez Calva
 */
public class RectaPendiente {
    /**
     * @param args the command line arguments
     */
    public static double inclinacion(int x1, int y1, int x2, int y2){
        double m = (y2 - y1)/(x2 - x1);
        return m;
    }
    
    public static double interseccionY(int x1,int y1, double m){
        double b = y1 - m * x1;
        return b;
    }
    
    public static double angulo(double m){
        double anguloRadianes = Math.atan(m);
        double anguloGrados = anguloRadianes * (180/Math.PI);
        return anguloGrados;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa los valores de \"x\" y \"y\" del punto 1 separado por una coma (x,y):");
        String[] puntoA = (in.nextLine()).split(",");
        System.out.println("Ingresa los valores de \"x\" y \"y\" del punto 2 separado por una coma (x,y):");
        String[] puntoB = (in.nextLine()).split(",");
        
        in.close();
        
        int x1 = Integer.parseInt(puntoA[0].trim());
        int y1 = Integer.parseInt(puntoA[1].trim());
        int x2 = Integer.parseInt(puntoB[0].trim());
        int y2 = Integer.parseInt(puntoB[1].trim());
        
        Double m = inclinacion(x1, y1, x2, y2);
        Double b = interseccionY(x1, y1, m); 
        Double angulo = angulo(m);
        
        System.out.println("La pendiente de la recta es de= "+m+ "La interseccion de la recta es de= "+b);
        System.out.println("El angulo de inclinacion es de= "+angulo+"°");
    }
}
