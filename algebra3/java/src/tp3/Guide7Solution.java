package tp3;

import tp3.utils.Matrix;
import tp3.utils.MatrixMatrixOperation;
import tp3.utils.MatrixVectorOperation;
import tp3.utils.Vector;

import java.util.List;

public class Guide7Solution implements Guide7 {
    //integrantes: Camila Catalini e Ignacio Estevo
    // Ejercicios a hacer 1 g   2    3c i    4

    @Override
    public int exercise_1_a(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_c(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_d(int[][] A, int[] b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_e(int[][] A, int[][] B) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_f(int[][] A, int[][] B) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_g(int[][] A) {

        int[][] transpuesta = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                transpuesta[j][i] = A[i][j];
            }
        }

        return transpuesta;
    }

    @Override
    public int exercise_1_h(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int exercise_1_i(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int[][] exercise_1_j(int[][] A, int c) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public boolean exercise_2_a(int[][] A) {

        for (int i = 0; i < A.length; i++) { //La diagonal no nos importa, pero hay que ver que pasa con los valores en Aij e Aji
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != A[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean exercise_2_b(int[][] A) {
        //se dice que una matriz cuadrada es diagonalmente dominante si, para cada fila de la matriz,
        // la magnitud de la entrada diagonal en una fila es mayor o igual que la suma de las magnitudes de todas las demás (no diagonal) entradas en esa fila.
        // Matriz diagonalmente dominante

        for (int i = 0; i < A.length; i++) {
            int suma = 0;
            for (int j = 0; j < A[0].length; j++) {
                if (i != j) {
                    suma += Math.abs(A[i][j]); //Sumamos los valores no diagonal
                }
            }
            if (Math.abs(A[i][i]) <= suma) {
                return false;
            }
        }
        return true;

    }

    @Override
    public MatrixVectorOperation exercise_3_a_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_b_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_c_i(MatrixVectorOperation op) { //Asumo que son compatibles
        //A.X con matrices tridiagonales. Optimzar. evitar operaciones con 0s.
        //Matrix tridiagonal no tiene ceros en la diagonal principal y en la diagonal secundaria inferior y superior.

        //make the product of two matrices

        MatrixVectorOperation op1 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 9}, {1, 1, 1}, {9, 1, 1}}), new Vector(new int[]{2, 3, 4}));

        throw new UnsupportedOperationException("TODO");




    }

    @Override
    public MatrixMatrixOperation exercise_3_c_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_c_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_d_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_e(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<double[]> exercise_4(List<double[]> A) {
        throw new UnsupportedOperationException("TODO");
    }
}
