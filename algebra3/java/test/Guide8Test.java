import org.junit.Test;
import tp4.Guide8;
import tp4.Guide8Solution;
import tp4.answers.utils.MatrixContainer;
import utils.Guide7Helpers;
import utils.Guide8Helpers;
import utils.SkipRule;

import static org.junit.Assert.*;

public class Guide8Test extends SkipRule {
    Guide8 guide8 = new Guide8Solution();

    @Test
    public void exercise_5_a() {
        double[][] matrix1 = {{2, 1, -3}, {5, -4, 1}, {1, -1, -4}};
        double[] vector1 = {7, -19, 4};
        double[] result1 = guide8.exercise_5_a(matrix1, vector1);
        testGauss(matrix1, vector1, result1);

//        double[][] matrix2 = {{1, 3, 2, 5}, {-1, 2, -2, 5}, {2, 6, 4, 7}, {0, 5, 2, 6}};
//        double[] vector2 = {11, -6, 19, 5};
//        double[] result2 = guide8.exercise_5_a(matrix2, vector2);
//        testGauss(matrix2, vector2, result2);

        double[][] matrix2 = {{2, 3}, {4, -7}};
        double[] vector2 = {-1, 11};
        double[] result2 = guide8.exercise_5_a(matrix2, vector2);
        testGauss(matrix2, vector2, result2);
    }

    @Test
    public void exercise_5_b() {
        double[][] matrix1 = {{0, 1, 1}, {2, 4, -2}, {0, 3, 15}};
        double[] vector1 = {4, 2, 36};
        double[] result1 = guide8.exercise_5_b(matrix1, vector1);
        testGauss(matrix1, vector1, result1);

        double[][] matrix2 = {{1, 3, 2, 5}, {-1, 2, -2, 5}, {2, 6, 4, 7}, {0, 5, 2, 6}};
        double[] vector2 = {11, -6, 19, 5};
        double[] result2 = guide8.exercise_5_b(matrix2, vector2);
        testGauss(matrix2, vector2, result2);
    }

    private void testGauss(double[][] matrix, double[] vector, double[] result) {
        double[] multiplication = Guide7Helpers.matrix_times_vector(matrix, result);
        assertArrayEquals(multiplication, vector, 0.01);
    }

    @Test
    public void exercise_6() {
        double[][] matrix1 = {{-2, 4, 7}, {7, 2, -3}, {0, 3, -1}};
        double[] vector1 = {-5, 72, -25};
        double[] result1 = guide8.exercise_6(matrix1, vector1);
        testGauss(matrix1, vector1, result1);

        double[][] matrix2 = {{2, 0, -3, 4}, {-1, 6, 1, -13}, {0, 2, 0, -11}, {0, 0, 14, -23}};
        double[] vector2 = {-7, -43, -14, 126};
        double[] result2 = guide8.exercise_6(matrix2, vector2);
        testGauss(matrix2, vector2, result2);
    }

    @Test
    public void exercise_7() {
        double[][] matrix1 = {{-3, 4, 0, 0, 0}, {4, -1, 3, 0, 0}, {0, 3, -4, 11, 0}, {0, 0, 11, -7, 1}, {0, 0, 0, 1, -5}};
        double[] vector1 = {-22, 37, -19, 52, -40};
        double[] result1 = guide8.exercise_7(matrix1, vector1);
        testGauss(matrix1, vector1, result1);

        double[][] matrix2 = {{1, 3, 0, 0}, {3, 6, -7, 0}, {0, -7, 1, -2}, {0, 0, -2, 5}};
        double[] vector2 = {-19, -54, 39, 44};
        double[] result2 = guide8.exercise_7(matrix2, vector2);
        testGauss(matrix2, vector2, result2);
    }

    @Test
    public void exercise_9() {
        double[][] A1 = {{2, 3}, {3, 4}};
        double[][] B1 = guide8.exercise_9(A1);
        testInverse(A1, B1);

        double[][] A2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        double[][] B2 = guide8.exercise_9(A2);
        testInverse(A2, B2);

        double[][] A3 = {{1, 2, 3}, {0, 1, 4}, {5, 6, 4}};
        double[][] B3 = guide8.exercise_9(A3);
        testInverse(A3, B3);
    }

    private void testInverse(double[][] a, double[][] b) {
        double[][] AB = Guide7Helpers.matrix_by_matrix(a, b);
        double[][] BA = Guide7Helpers.matrix_by_matrix(b, a);
        double[][] identity = Guide7Helpers.identity(a.length);
        testInverseHelper(AB, identity);
        testInverseHelper(BA, identity);
    }

    private void testInverseHelper(double[][] matrix, double[][] identity) {
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals(matrix[i], identity[i], 0.1);
        }
    }

    @Test
    public void exercise_10() {
        double[][] A1 = {{2, -1, -2}, {-4, 6, 3}, {-4, -2, 8}};
        MatrixContainer result1 = guide8.exercise_10(A1);
        assertTrue(Guide8Helpers.check_lower_triangular(result1.getLower()));
        assertTrue(Guide8Helpers.check_upper_triangular(result1.getUpper()));

        double[][] multiplication1 = Guide7Helpers.matrix_by_matrix(result1.getLower(), result1.getUpper());
        assertArrayEquals(A1, multiplication1);

        double[][] A2 = {{2, 4, 3, 5}, {-4, -7, -5, -8}, {6, 8, 2, 9}, {4, 9, -2, 14}};
        MatrixContainer result2 = guide8.exercise_10(A2);
        assertTrue(Guide8Helpers.check_lower_triangular(result2.getLower()));
        assertTrue(Guide8Helpers.check_upper_triangular(result2.getUpper()));

        double[][] multiplication2 = Guide7Helpers.matrix_by_matrix(result2.getLower(), result2.getUpper());
        assertArrayEquals(A2, multiplication2);
    }

}
