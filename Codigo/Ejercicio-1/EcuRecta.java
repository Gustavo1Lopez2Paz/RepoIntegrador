import java.text.DecimalFormat;
import java.util.Scanner;

public class Recta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener las coordenadas de los puntos A y B desde el usuario
        System.out.println("Ingrese las coordenadas del punto A:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del punto B:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        scanner.close();

        // Cálculo de la pendiente de la recta
        double pendiente = (y2 - y1) / (x2 - x1);

        // Cálculo del ángulo en radianes
        double angulo = Math.atan(pendiente);

        // Conversión del ángulo a grados
        double anguloGrados = Math.toDegrees(angulo);

        // Cálculo del punto de intersección
        double interseccionX = (y1 - y2) / (pendiente);
        double interseccionY = y1 - pendiente * x1;

        // Formateo del ángulo con dos decimales
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String anguloFormateado = decimalFormat.format(anguloGrados);

        // Imprimir la ecuación de la recta, punto de intersección, ángulo de inclinación y pendiente
        System.out.println("Ecuación de la recta: y = " + pendiente + "x + " + interseccionY);
        System.out.println("Punto de intersección: (" + interseccionX + ", " + interseccionY + ")");
        System.out.println("Ángulo de inclinación α: " + anguloFormateado + " grados");
        System.out.println("Pendiente: " + pendiente);
    }
}