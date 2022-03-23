package tp3;

import tp3.utils.MatrixMatrixOperation;
import tp3.utils.MatrixVectorOperation;

import java.util.List;

public interface Guide7 {
    // Exercise 1
    int exercise_1_a(int[][] A);

    int exercise_1_b(int[][] A);

    int[] exercise_1_c(int[][] A);

    int[] exercise_1_d(int[][] A, int[] b);

    int[][] exercise_1_e(int[][] A, int[][] B);

    int[][] exercise_1_f(int[][] A, int[][] B);

    int[][] exercise_1_g(int[][] A);

    int exercise_1_h(int[][] A);

    int exercise_1_i(int[][] A);

    int[][] exercise_1_j(int[][] A, int c);

    // Exercise 2
    boolean exercise_2_a(int[][] A);

    boolean exercise_2_b(int[][] A);

    // Exercise 3
    MatrixVectorOperation exercise_3_a_i(MatrixVectorOperation op);

    MatrixMatrixOperation exercise_3_a_ii(MatrixMatrixOperation op);

    MatrixMatrixOperation exercise_3_a_iii(MatrixMatrixOperation op);

    MatrixVectorOperation exercise_3_b_i(MatrixVectorOperation op);

    MatrixMatrixOperation exercise_3_b_ii(MatrixMatrixOperation op);

    MatrixMatrixOperation exercise_3_b_iii(MatrixMatrixOperation op);

    MatrixVectorOperation exercise_3_c_i(MatrixVectorOperation op);

    MatrixMatrixOperation exercise_3_c_ii(MatrixMatrixOperation op);

    MatrixMatrixOperation exercise_3_c_iii(MatrixMatrixOperation op);

    MatrixVectorOperation exercise_3_d_i(MatrixVectorOperation op);

    MatrixMatrixOperation exercise_3_d_ii(MatrixMatrixOperation op);

    MatrixMatrixOperation exercise_3_d_iii(MatrixMatrixOperation op);

    MatrixMatrixOperation exercise_3_e(MatrixMatrixOperation op);

    // Exercise 4
    List<double[]> exercise_4(List<double[]> A);
}
