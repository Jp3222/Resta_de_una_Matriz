package javaapplication82;

public class JavaApplication82 {

    public static void main(String[] args) {
        JavaApplication82 Metodo = new JavaApplication82();
        int A[][] = {{9, 13, 5, 2, 6}, {12, 3, 5, 5, 1, 5}, {48, 5, 3, 4, 1, 5}};
        Metodo.Mostrar(A);
        System.out.println("Resultados");
        Metodo.RestarM(A);
    }

    public void RestarM(int M[][]) {
        int Aux[] = new int[M.length];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (j == 0) {
                    Aux[i] = M[i][j];
                } else {
                    Aux[i] -= M[i][j];
                }
            }
            // System.out.println("");
        }

        for (int i = 0; i < Aux.length; i++) {
            System.out.println("Fila" + "[" + (i + 1) + "]= " + Aux[i]);
        }

    }

    public void Mostrar(int M[][]) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("[" + M[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
