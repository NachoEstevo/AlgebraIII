import org.junit.Test;
import tp3.Guide7;
import tp3.Guide7Solution;
import tp3.utils.Matrix;
import tp3.utils.MatrixMatrixOperation;
import tp3.utils.MatrixVectorOperation;
import tp3.utils.Vector;
import utils.Guide6Helpers;
import utils.SkipRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Guide7Test extends SkipRule {
    Guide7 guide7 = new Guide7Solution();

    @Test
    public void exercise_1_a() {
        assertEquals(7, guide7.exercise_1_a(new int[][]{{2, 3}, {4, 5}}));
        assertEquals(3, guide7.exercise_1_a(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertEquals(34, guide7.exercise_1_a(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));
    }

    @Test
    public void exercise_1_b() {
        assertEquals(7, guide7.exercise_1_b(new int[][]{{2, 3}, {4, 5}}));
        assertEquals(1, guide7.exercise_1_b(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertEquals(34, guide7.exercise_1_b(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));
    }

    @Test
    public void exercise_1_c() {
        assertArrayEquals(new int[]{1, 1, 1, 6}, guide7.exercise_1_c(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {1, 2, 3}}));
        assertArrayEquals(new int[]{6, 6}, guide7.exercise_1_c(new int[][]{{1, 1, 1, 1, 1, 1}, {2, 2, 2}}));
        assertArrayEquals(new int[]{7, 14, 11, 6, 6}, guide7.exercise_1_c(new int[][]{{1, 2, 4}, {2, 8, 4}, {6, 2, 3}, {1, 2, 3}, {1, 2, 3}}));
    }

    @Test
    public void exercise_1_d() {
        assertArrayEquals(new int[]{8, 14}, guide7.exercise_1_d(new int[][]{{2, 3}, {4, 5}}, new int[]{1, 2}));
        assertArrayEquals(new int[]{7, 8, 9}, guide7.exercise_1_d(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[]{7, 8, 9}));
        assertArrayEquals(new int[]{9, 9, 9}, guide7.exercise_1_d(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, new int[]{2, 3, 4}));
    }

    @Test
    public void exercise_1_e() {
        assertArrayEquals(new int[][]{{2, 4, 6}, {8, 10, 12}, {14, 16, 18}}, guide7.exercise_1_e(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertArrayEquals(new int[][]{{2, 2, 3}, {4, 6, 6}, {7, 8, 10}}, guide7.exercise_1_e(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertArrayEquals(new int[][]{{2, 0, 0}, {0, 2, 0}, {0, 0, 2}}, guide7.exercise_1_e(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }

    @Test
    public void exercise_1_f() {
        assertArrayEquals(new int[][]{{30, 36, 42}, {66, 81, 96}, {102, 126, 150}}, guide7.exercise_1_f(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, guide7.exercise_1_f(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertArrayEquals(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, guide7.exercise_1_f(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertArrayEquals(new int[][]{{2, 4, 6}, {0, 2, 4}, {0, 0, 2}}, guide7.exercise_1_f(new int[][]{{1, 1, 1}, {0, 1, 1}, {0, 0, 1}}, new int[][]{{2, 2, 2}, {0, 2, 2}, {0, 0, 2}}));
        assertArrayEquals(new int[][]{{6, 6, 6}, {12, 12, 12}, {18, 18, 18}}, guide7.exercise_1_f(new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}, new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}));
    }

    @Test
    public void exercise_1_g() {
        assertArrayEquals(new int[][]{{1, 3}, {2, 4},}, guide7.exercise_1_g(new int[][]{{1, 2}, {3, 4}}));
        assertArrayEquals(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, guide7.exercise_1_g(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertArrayEquals(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}, guide7.exercise_1_g(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    public void exercise_1_h() {
        assertEquals(9, guide7.exercise_1_h(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {1, 2, 3}}));
        assertEquals(6, guide7.exercise_1_h(new int[][]{{-2, 2, 1}, {1, 3, 2}, {1, -2, 0}}));
    }

    @Test
    public void exercise_1_i() {
        assertEquals(6, guide7.exercise_1_i(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {1, 2, 3}}));
        assertEquals(1, guide7.exercise_1_i(new int[][]{{-2, 2, 1}, {1, 3, 2}, {1, -2, 0}}));
        assertEquals(0, guide7.exercise_1_i(new int[][]{{-2, 2, 1}, {1, 3, 2}, {1, -2, 6}}));
    }

    @Test
    public void exercise_1_j() {
        assertArrayEquals(new int[][]{{-3, -6, -9, -12}, {-15, -18, -21, -24}, {-27, -30, -33, -36}, {-39, -42, -45, -48}}, guide7.exercise_1_j(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}, -3));
        assertArrayEquals(new int[][]{{-10, 10, 5}, {5, 15, 10}, {5, -10, 0}}, guide7.exercise_1_j(new int[][]{{-2, 2, 1}, {1, 3, 2}, {1, -2, 0}}, 5));
    }

    @Test
    public void exercise_2_a() {
        assertTrue(guide7.exercise_2_a(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertFalse(guide7.exercise_2_a(new int[][]{{1, 0, 1}, {0, 1, 0}, {0, 0, 1}}));
        assertFalse(guide7.exercise_2_a(new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 0, 1}}));
    }

    @Test
    public void exercise_2_b() {
        assertTrue(guide7.exercise_2_b(new int[][]{{4, -2, 1}, {1, -4, 2}, {-1, 2, 4}}));
        assertFalse(guide7.exercise_2_b(new int[][]{{-2, 2, 1}, {1, 3, 2}, {1, -2, 0}}));
        assertFalse(guide7.exercise_2_b(new int[][]{{4, -2, 1}, {1, -4, 2}, {-1, 2, 3}}));
    }

    @Test
    public void exercise_3_a_i() {
        MatrixVectorOperation op1 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 1}, {9, 1, 1}, {9, 9, 1}}), new Vector(new int[]{7, 8, 9}));
        assertEquals(new Vector(new int[]{24, 17, 9}), guide7.exercise_3_a_i(op1).getResult());
        assertTrue(op1.getCounter() <= 12);
        assertTrue(op1.getCounter() > 0);

        MatrixVectorOperation op2 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 1, 1}, {9, 1, 1, 1}, {9, 9, 1, 1}, {9, 9, 9, 1}}), new Vector(new int[]{1, 2, 3, 4}));
        assertEquals(new Vector(new int[]{10, 9, 7, 4}), guide7.exercise_3_a_i(op2).getResult());
        assertTrue(op2.getCounter() <= 20);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_a_ii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 2, 3}, {9, 5, 6}, {9, 9, 9}}), new Matrix(new int[][]{{1, 2, 3}, {9, 5, 6}, {9, 9, 9}}));
        assertEquals(new Matrix(new int[][]{{2, 4, 6}, {0, 10, 12}, {0, 0, 18}}), guide7.exercise_3_a_ii(op1).getResult());
        assertTrue(op1.getCounter() <= 12);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 1, 1}, {9, 1, 1, 1}, {9, 9, 1, 1}, {9, 9, 9, 1}}), new Matrix(new int[][]{{2, 2, 2, 2}, {9, 2, 2, 2}, {9, 9, 2, 2}, {9, 9, 9, 2}}));
        assertEquals(new Matrix(new int[][]{{3, 3, 3, 3}, {0, 3, 3, 3}, {0, 0, 3, 3,}, {0, 0, 0, 3}}), guide7.exercise_3_a_ii(op2).getResult());
        assertTrue(op2.getCounter() <= 20);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_a_iii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 1}, {9, 1, 1}, {9, 9, 1}}), new Matrix(new int[][]{{2, 2, 2}, {9, 2, 2}, {9, 9, 2}}));
        assertEquals(new Matrix(new int[][]{{2, 4, 6}, {0, 2, 4}, {0, 0, 2}}), guide7.exercise_3_a_iii(op1).getResult());
        assertTrue(op1.getCounter() <= 20);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 1, 1}, {9, 1, 1, 1}, {9, 9, 1, 1}, {9, 9, 9, 1}}), new Matrix(new int[][]{{2, 2, 2, 2}, {9, 2, 2, 2}, {9, 9, 2, 2}, {9, 9, 9, 2}}));
        assertEquals(new Matrix(new int[][]{{2, 4, 6, 8}, {0, 2, 4, 6}, {0, 0, 2, 4}, {0, 0, 0, 2}}), guide7.exercise_3_a_iii(op2).getResult());
        assertTrue(op2.getCounter() <= 40);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_b_i() {
        MatrixVectorOperation op1 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 9}, {1, 1, 1}, {1, 1, 1}}), new Vector(new int[]{2, 3, 4}));
        assertEquals(new Vector(new int[]{5, 9, 9}), guide7.exercise_3_b_i(op1).getResult());
        assertTrue(op1.getCounter() <= 16);
        assertTrue(op1.getCounter() > 0);

        MatrixVectorOperation op2 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 9, 9}, {1, 1, 1, 9}, {1, 1, 1, 1}, {1, 1, 1, 1}}), new Vector(new int[]{1, 2, 3, 4}));
        assertEquals(new Vector(new int[]{3, 6, 10, 10}), guide7.exercise_3_b_i(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_b_ii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 9}, {1, 1, 1}, {1, 1, 1}}), new Matrix(new int[][]{{2, 2, 9}, {2, 2, 2}, {2, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{3, 3, 0}, {3, 3, 3}, {3, 3, 3}}), guide7.exercise_3_b_ii(op1).getResult());
        assertTrue(op1.getCounter() <= 16);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 9, 9}, {1, 1, 1, 9}, {1, 1, 1, 1}, {1, 1, 1, 1}}), new Matrix(new int[][]{{2, 2, 9, 9}, {2, 2, 2, 9}, {2, 2, 2, 2}, {2, 2, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{3, 3, 0, 0}, {3, 3, 3, 0}, {3, 3, 3, 3,}, {3, 3, 3, 3}}), guide7.exercise_3_b_ii(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_b_iii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 9}, {1, 1, 1}, {1, 1, 1}}), new Matrix(new int[][]{{2, 2, 9}, {2, 2, 2}, {2, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{4, 4, 2}, {6, 6, 4}, {6, 6, 4}}), guide7.exercise_3_b_iii(op1).getResult());
        assertTrue(op1.getCounter() <= 42);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 9, 9}, {1, 1, 1, 9}, {1, 1, 1, 1}, {1, 1, 1, 1}}), new Matrix(new int[][]{{2, 2, 9, 9}, {2, 2, 2, 9}, {2, 2, 2, 2}, {2, 2, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{4, 4, 2, 0}, {6, 6, 4, 2}, {8, 8, 6, 4}, {8, 8, 6, 4}}), guide7.exercise_3_b_iii(op2).getResult());
        assertTrue(op2.getCounter() <= 80);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_c_i() {
        MatrixVectorOperation op1 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 9}, {1, 1, 1}, {9, 1, 1}}), new Vector(new int[]{2, 3, 4}));
        assertEquals(new Vector(new int[]{5, 9, 7}), guide7.exercise_3_c_i(op1).getResult());
        assertTrue(op1.getCounter() <= 14);
        assertTrue(op1.getCounter() > 0);

        MatrixVectorOperation op2 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 9, 9}, {1, 1, 1, 9}, {9, 1, 1, 1}, {9, 9, 1, 1}}), new Vector(new int[]{1, 2, 3, 4}));
        assertEquals(new Vector(new int[]{3, 6, 9, 7}), guide7.exercise_3_c_i(op2).getResult());
        assertTrue(op2.getCounter() <= 20);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_c_ii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 9}, {1, 1, 1}, {9, 1, 1}}), new Matrix(new int[][]{{2, 2, 9}, {2, 2, 2}, {9, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{3, 3, 0}, {3, 3, 3}, {0, 3, 3}}), guide7.exercise_3_c_ii(op1).getResult());
        assertTrue(op1.getCounter() <= 16);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 9, 9}, {1, 1, 1, 9}, {9, 1, 1, 1}, {9, 9, 1, 1}}), new Matrix(new int[][]{{2, 2, 9, 9}, {2, 2, 2, 9}, {9, 2, 2, 2}, {9, 9, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{3, 3, 0, 0}, {3, 3, 3, 0}, {0, 3, 3, 3,}, {0, 0, 3, 3}}), guide7.exercise_3_c_ii(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_c_iii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 9}, {1, 1, 1}, {9, 1, 1}}), new Matrix(new int[][]{{2, 2, 9}, {2, 2, 2}, {9, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{4, 4, 2}, {4, 6, 4}, {2, 4, 4}}), guide7.exercise_3_c_iii(op1).getResult());
        assertTrue(op1.getCounter() <= 34);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 9, 9}, {1, 1, 1, 9}, {9, 1, 1, 1}, {9, 9, 1, 1}}), new Matrix(new int[][]{{2, 2, 9, 9}, {2, 2, 2, 9}, {9, 2, 2, 2}, {9, 9, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{4, 4, 2, 0}, {4, 6, 4, 2}, {2, 4, 6, 4}, {0, 2, 4, 4}}), guide7.exercise_3_c_iii(op2).getResult());
        assertTrue(op2.getCounter() <= 52);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_d_i() {
        MatrixVectorOperation op1 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 1}, {1, 1, 1}, {9, 1, 1}}), new Vector(new int[]{2, 3, 4}));
        assertEquals(new Vector(new int[]{9, 9, 7}), guide7.exercise_3_d_i(op1).getResult());
        assertTrue(op1.getCounter() <= 16);
        assertTrue(op1.getCounter() > 0);

        MatrixVectorOperation op2 = new MatrixVectorOperation(new Matrix(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {9, 1, 1, 1}, {9, 1, 1, 1}}), new Vector(new int[]{1, 2, 3, 4}));
        assertEquals(new Vector(new int[]{10, 10, 9, 7}), guide7.exercise_3_d_i(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_d_ii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 1}, {1, 1, 1}, {9, 1, 1}}), new Matrix(new int[][]{{2, 2, 2}, {2, 2, 2}, {9, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{3, 3, 3}, {3, 3, 3}, {0, 3, 3}}), guide7.exercise_3_d_ii(op1).getResult());
        assertTrue(op1.getCounter() <= 16);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {9, 1, 1, 1}, {9, 9, 1, 1}}), new Matrix(new int[][]{{2, 2, 2, 2}, {2, 2, 2, 2}, {9, 2, 2, 2}, {9, 9, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{3, 3, 3, 3}, {3, 3, 3, 3}, {0, 3, 3, 3}, {0, 0, 3, 3}}), guide7.exercise_3_d_ii(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_d_iii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 1}, {1, 1, 1}, {9, 1, 1}}), new Matrix(new int[][]{{2, 2, 2}, {2, 2, 2}, {9, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{4, 6, 6}, {4, 6, 6}, {2, 4, 4}}), guide7.exercise_3_d_iii(op1).getResult());
        assertTrue(op1.getCounter() <= 42);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {9, 1, 1, 1}, {9, 9, 1, 1}}), new Matrix(new int[][]{{2, 2, 2, 2}, {2, 2, 2, 2}, {9, 2, 2, 2}, {9, 9, 2, 2}}));
        assertEquals(new Matrix(new int[][]{{4, 6, 8, 8}, {4, 6, 8, 8}, {2, 4, 6, 6}, {0, 2, 4, 4}}), guide7.exercise_3_d_iii(op2).getResult());
        assertTrue(op2.getCounter() <= 80);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_3_e() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 9, 9}, {1, 1, 9}, {1, 1, 1}}), new Matrix(new int[][]{{1, 1, 1}, {9, 1, 1}, {9, 9, 1}}));
        assertEquals(new Matrix(new int[][]{{1, 1, 1}, {1, 2, 2}, {1, 2, 3}}), guide7.exercise_3_e(op1).getResult());
        assertTrue(op1.getCounter() <= 28);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 9, 9, 9}, {1, 1, 9, 9}, {1, 1, 1, 9}, {1, 1, 1, 1}}), new Matrix(new int[][]{{1, 1, 1, 1}, {9, 1, 1, 1}, {9, 9, 1, 1}, {9, 9, 9, 1}}));
        assertEquals(new Matrix(new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}, {1, 2, 3, 4}}), guide7.exercise_3_e(op2).getResult());
        assertTrue(op2.getCounter() <= 60);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_4() {
        ArrayList<double[]> vectors1 = new ArrayList<>(Arrays.asList(new double[]{2, 2, 0}, new double[]{1, 1, 1}));
        List<double[]> result1 = guide7.exercise_4(vectors1);
        orthogonal_test(result1);

        ArrayList<double[]> vectors2 = new ArrayList<>(Arrays.asList(new double[]{0, 0, 1, 1}, new double[]{0, 1, 1, 0}, new double[]{1, 1, 0, 0}));
        List<double[]> result2 = guide7.exercise_4(vectors2);
        orthogonal_test(result2);

        ArrayList<double[]> vectors3 = new ArrayList<>(Arrays.asList(new double[]{1, 3}, new double[]{-1, 2}));
        List<double[]> result3 = guide7.exercise_4(vectors3);
        orthogonal_test(result3);
    }

    private void orthogonal_test(List<double[]> result) {
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                double actual = Guide6Helpers.dotProduct(result.get(i), result.get(j));
                assertEquals(0.0, actual, 0.1);
            }
        }
    }

}
