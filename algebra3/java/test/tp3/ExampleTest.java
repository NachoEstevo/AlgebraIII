package tp3;

import org.junit.Test;
import tp3.example.Example;
import tp3.utils.Matrix;
import tp3.utils.MatrixVectorOperation;
import tp3.utils.Vector;

import static org.junit.Assert.*;

public class ExampleTest {
    Example example = new Example();

    @Test
    public void nonOptimalMultiplication() {
//        Multiplying a matrix by a vector with no optimization
        int[][] matrixValues = {{0, 1, 1}, {1, 0, 1}, {1, 1, 0}};
        int[] vectorValues = {2, 3, 4};
        MatrixVectorOperation op1 = new MatrixVectorOperation(new Matrix(matrixValues), new Vector(vectorValues));
        assertEquals(new Vector(new int[]{7, 6, 5}), example.nonOptimalMultiplication(op1).getResult());
        assertEquals(op1.getCounter(),18);

//        12 is the exact number of accesses in an optimized multiplication
//        Here the counter is 18, not 12
        assertFalse(op1.getCounter() <= 12);
    }

    @Test
    public void optimalMultiplication() {
//        Notice that the 0 where replaced by 9 to show that they do not affect the multiplication
        int[][] matrixValues = {{9, 1, 1}, {1, 9, 1}, {1, 1, 9}};
        int[] vectorValues = {2, 3, 4};
        MatrixVectorOperation op1 = new MatrixVectorOperation(new Matrix(matrixValues), new Vector(vectorValues));
        assertEquals(new Vector(new int[]{7, 6, 5}), example.optimalMultiplication(op1).getResult());
        assertTrue(op1.getCounter() <= 12);
    }

}