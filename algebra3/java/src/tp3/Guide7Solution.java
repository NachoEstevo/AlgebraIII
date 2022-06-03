package tp3;

import tp3.utils.Matrix;
import tp3.utils.MatrixMatrixOperation;
import tp3.utils.MatrixVectorOperation;
import tp3.utils.Vector;

import java.util.ArrayList;
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

        int[] result = new int[op.getVector().getVectorSize()];

        for (int i = 0; i < op.getMatrixRows(); i++) {
            int suma = 0;
                if (i == 0) { //Si es la primera fila, no tenemos que sumar los valores de la diagonal secundaria inferior
                    suma += op.multiplyPositions(i, i, i);
                    suma += op.multiplyPositions(i, i+1, i+1);

                } else if (i == op.getMatrixRows() - 1) { //Si es la ultima fila, no tenemos que sumar los valores de la diagonal secundaria superior
                    suma += op.multiplyPositions(i, i, i);
                    suma += op.multiplyPositions(i, i-1, i-1);

                } else { //Si no es la primera ni la ultima, sumamos los valores de la diagonal secundaria inferior y superior
                    suma += op.multiplyPositions(i, i, i);
                    suma += op.multiplyPositions(i, i+1, i+1);
                    suma += op.multiplyPositions(i, i-1, i-1);
                }

            result[i] = suma;
        }
            op.setResult(new Vector(result));
            return op;
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
    public List<double[]> exercise_4(List<double[]> A) {//Gram Smith Algorithm


        ArrayList<double[]> finalArray= new ArrayList<>();

        //I set the first vector because it never changes, it's always the first vector of the array receive divided between it's length
        finalArray.add(multiplyScalarPerVector(1/(calculateVectorLength(A.get(0))), A.get(0)));

        for(int i=1; i<A .size(); i++)
        {
            double[] newVector= substractVectors(A .get(i), proyection(finalArray.get(i-1),A .get(i)));
            for(int e=i-1;e>0;e--)
            {
                newVector= substractVectors(newVector, proyection(finalArray.get(e-1),A .get(i)));
            }
            newVector= multiplyScalarPerVector(1/(calculateVectorLength(newVector)), newVector);
            finalArray.add(newVector);
        }
        return finalArray;
    }

    private double[] proyection(double[] array1, double[] array2)
    {
        double dotProductResult= dotProduct(array1,array2);
        return multiplyScalarPerVector(dotProductResult, array1);
    }


    private double dotProduct(double[] vector1, double[] vector2)
    {
        double result = 0;
        for(int i=0; i<vector1.length; i++)
        {
            result +=vector1[i]*vector2[i];
        }
        return result ;
    }

    private double[] multiplyScalarPerVector(double scalar, double[] vector)
    {
        double[] newVector = new double[vector.length];
        for(int i=0; i<vector.length; i++)
        {
            newVector[i] = scalar*vector[i];
        }
        return newVector;
    }

    private double[] substractVectors(double[] vector1, double[] vector2)
    {
        double[] finalVector= new double[vector1.length];
        for(int i=0; i<vector1.length; i++)
        {
            finalVector[i] = vector1[i] - vector2[i];
        }
        return finalVector;
    }

    private double calculateVectorLength(double[] vector)
    {
        double result = 0;
        for (double v : vector) {
            result += Math.pow(v, 2);
        }
        return Math.sqrt(result );
    }
}
