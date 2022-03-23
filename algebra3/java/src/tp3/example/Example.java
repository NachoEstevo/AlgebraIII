package tp3.example;

import tp3.utils.MatrixVectorOperation;
import tp3.utils.Vector;

public class Example {
    /*
        MatrixVectorOperation and MatrixMatrixOperation have 2 operands, and a result that should be set
        before returning it
     */

    public MatrixVectorOperation nonOptimalMultiplication(MatrixVectorOperation op) {
        int rows = op.getMatrixRows();
        int columns = op.getMatrixColumns();
        int[] result = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i] += op.multiplyPositions(i, j, j);
            }
        }
//        It is very important to set the result before returning it
        op.setResult(new Vector(result));
        return op;
    }

    public MatrixVectorOperation optimalMultiplication(MatrixVectorOperation op) {
        int rows = op.getMatrixRows();
        int columns = op.getMatrixColumns();
        int[] result = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
//                If i == j the matrix has a zero, so we skip it, making less calculations
                if (i != j)
                    result[i] += op.multiplyPositions(i, j, j);
            }
        }
//        Seriously, you should set it before returning it
        op.setResult(new Vector(result));
        return op;
    }
}
