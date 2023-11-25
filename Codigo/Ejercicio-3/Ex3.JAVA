import java.util.Scanner;
class Circunferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la coordenada en x del centro de la circunferencia: ");
        double Cx = entrada.nextDouble();
        System.out.println("Ingrese el valor de la coordenada en y del centro de la circunferencia: ");
        double Cy = entrada.nextDouble();
        System.out.println("Ingrese el valor de la coordenada en x del punto T: ");
        double Tx = entrada.nextDouble();
        System.out.println("Ingrese el valor de la coordenada en y del punto T: ");
        double Ty = entrada.nextDouble();
        System.out.println("Ingrese el valor del radio de la circunferencia");
        double r = entrada.nextDouble();
        
        double v1 = Math.pow((Tx-Cx), 2);
        double v2 = Math.pow((Ty-Cy), 2);
        double v3 = v1+v2;
        double d = Math.sqrt(v3);
        
        if (d>r){
            System.out.println("El punto T con coordenadas ("+Tx+", "+Ty+") se encuentra fuera de la circunferencia con centro en ("+Cx+", "+Cy+") y radio "+r);
        }else if (d<r){
            System.out.println("El punto T con coordenadas ("+Tx+", "+Ty+") se encuentra dentro de la circunferencia con centro en ("+Cx+", "+Cy+") y radio "+r);
        }else if (d==r){
            System.out.println("El punto T con coordenadas ("+Tx+", "+Ty+") se encuentra sobre la circunferencia con centro en ("+Cx+", "+Cy+") y radio "+r);
        }
    }
}
