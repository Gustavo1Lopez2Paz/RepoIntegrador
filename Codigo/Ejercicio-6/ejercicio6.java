import java.util.Scanner;

public class ejercicio6{
    public static void main(String[] args) {
        Scanner valor=new Scanner (System.in);
        System.out.println("ingresa el numero de bits");
       
       int numVariables = valor.nextInt(); 
       
      if(numVariables <= 4 ){
        generateTruthTable(numVariables);
    }else{
            System.out.println("Numero fuera de rango permitido :(");
}
    }
    public static void generateTruthTable(int numVariables) {
        int numRows = (int) Math.pow(2, numVariables);

       
        for (int i = 0; i < numVariables; i++) {
            System.out.print("Var" + (i + 1) + "\t");
        }
        System.out.println("Result");

        for (int i = 0; i < numRows; i++) {
            for (int j = numVariables - 1; j >= 0; j--) {
                int value = (i / (int) Math.pow(2, j)) % 2;
                System.out.print(value + "\t");
            }

            boolean result = calculateLogicOperation(i, numVariables);
            System.out.println(result ? "1" : "0");
        }
    }

    public static boolean calculateLogicOperation(int row, int numVariables) {

        boolean var1 = ((row >> 2) & 1) == 1;
        boolean var2 = ((row >> 1) & 1) == 1;
        boolean var3 = (row & 1) == 1;

        return var1 && var2 && var3;
    }
}