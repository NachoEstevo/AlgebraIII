import org.hamcrest.CoreMatchers;
import org.junit.Test;
import tp2.Guide6;
import tp2.Guide6Solution;
import tp2.utils.Infraction;
import tp2.utils.Survey;
import utils.SkipRule;

import static org.junit.Assert.*;

public class Guide6Test extends SkipRule {
    Guide6 guide6 = new Guide6Solution();

    @Test
    public void exercise_1_a() {
        assertEquals(12, guide6.exercise_1_a(new int[]{1, 1, 2, 3, 5}));
        assertEquals(0, guide6.exercise_1_a(new int[]{1, -1, 2, -2, 3, -3}));
    }

    @Test
    public void exercise_1_b() {
        assertEquals(5, guide6.exercise_1_b(new int[]{1, 1, 2, 3, 5}));
        assertEquals(355, guide6.exercise_1_b(new int[]{1, -1, 2, -2, 3, -3, 2, 11, 355, 21, 35, 78, 11, 90}));
    }

    @Test
    public void exercise_1_c() {
        assertEquals(1, guide6.exercise_1_c(new int[]{1, 1, 2, 3, 5}, 2));
        assertEquals(4, guide6.exercise_1_c(new int[]{1, -1, 5, 2, 5, -2, 3, -3, 5, 5}, 5));
    }

    @Test
    public void exercise_1_d() {
        assertEquals(1, guide6.exercise_1_d(new int[]{1, 1, 2, 3, 5}));
        assertEquals(2, guide6.exercise_1_d(new int[]{1, -1, 5, 7, 2, 7, 5, -2, 3, -3, 5, 5}));
        assertEquals(4, guide6.exercise_1_d(new int[]{1, -1, 5, 2, 5, -2, 3, -3, 5, 5}));
    }

    @Test
    public void exercise_1_e() {
        assertArrayEquals(new int[]{0, 1, 4, 9, 20}, guide6.exercise_1_e(new int[]{1, 1, 2, 3, 5}));
        assertArrayEquals(new int[]{0, -1, 10, 21, 8, 35, 30, -14, 24, -27, 50, 55}, guide6.exercise_1_e(new int[]{1, -1, 5, 7, 2, 7, 5, -2, 3, -3, 5, 5}));
        assertArrayEquals(new int[]{0, -1, 10, 6, 0, -10, 18, -21, 40, 45}, guide6.exercise_1_e(new int[]{1, -1, 5, 2, 0, -2, 3, -3, 5, 5}));
    }

    @Test
    public void exercise_1_f() {
        assertEquals(3, guide6.exercise_1_f(new int[]{1, 1, 1, 1, 1, 1}));
        assertEquals(25, guide6.exercise_1_f(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        assertEquals(6, guide6.exercise_1_f(new int[]{1, -1, 4, 2, 5, -2, 12, -3, 6, 5}));
    }

    @Test
    public void exercise_1_g() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 1, 2, 3, 4}, guide6.exercise_1_g(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{5, 3, 8, 1, 2, 3, 4}, guide6.exercise_1_g(new int[]{5, 3, 8}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void exercise_1_h() {
        assertArrayEquals(new int[]{5, 5, 5, 5}, guide6.exercise_1_h(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{9, 6, 10, 1}, guide6.exercise_1_h(new int[]{5, 3, 8, 0}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void exercise_1_i() {
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 4, 4}, guide6.exercise_1_i(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{5, 1, 3, 2, 8, 3, 0, 4}, guide6.exercise_1_i(new int[]{5, 3, 8, 0}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void exercise_1_j() {
        assertArrayEquals(new int[]{4, 3, 2, 1}, guide6.exercise_1_j(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{8, 4, 6, 7, 3, 4, 5, 2}, guide6.exercise_1_j(new int[]{2, 5, 4, 3, 7, 6, 4, 8}));
        assertArrayEquals(new int[]{7, 5, 3, 4, 2}, guide6.exercise_1_j(new int[]{2, 4, 3, 5, 7}));
    }

    @Test
    public void exercise_1_k() {
        assertEquals(14, guide6.exercise_1_k(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertEquals(0, guide6.exercise_1_k(new int[]{1, 0, 0}, new int[]{0, 1, 0}));
        assertEquals(56, guide6.exercise_1_k(new int[]{2, 3, 4}, new int[]{5, 6, 7}));
    }

    @Test
    public void exercise_2() {
        assertArrayEquals(new int[]{1, 0, 3, 2}, guide6.exercise_2(new int[]{5, 7, 2, 4}));
        assertArrayEquals(new int[]{0, 0, 0, 0}, guide6.exercise_2(new int[]{0, 0, 0, 0}));
        assertArrayEquals(new int[]{3, 0, 2, 1, 4}, guide6.exercise_2(new int[]{2, 8, 4, 6, 1}));
    }

    @Test
    public void exercise_3() {
        assertFalse(guide6.exercise_3(new int[]{}));
        assertFalse(guide6.exercise_3(new int[]{1, 1, 2, 3, 5, 6}));
        assertTrue(guide6.exercise_3(new int[]{5, 8, 113, 238, 112}));
        assertTrue(guide6.exercise_3(new int[]{21, 1, 2, 3, 4, 5, 6}));
    }

    @Test
    //    El primer elemento no puede ser negativo, si el primer elemento es negativo debe devolver falso"
    public void exercise_4() {
        assertTrue(guide6.exercise_4(new int[]{3, -1, 3, -5}));
        assertFalse(guide6.exercise_4(new int[]{-3, 11, -3, -5}));
        assertTrue(guide6.exercise_4(new int[]{0, 5, -3, -2}));
        assertFalse(guide6.exercise_4(new int[]{0, 5, -3, -2, 1}));
        assertFalse(guide6.exercise_4(new int[]{1, -8, 3, 11, -7}));
    }

    @Test
    public void exercise_5_a() {
        assertThat(guide6.exercise_5_a(new Infraction[]{new Infraction(1, 2, 3), new Infraction(1, 3, 1), new Infraction(1, 5, 2), new Infraction(1, 6, 3)}), CoreMatchers.hasItems(1));
        assertThat(guide6.exercise_5_a(new Infraction[]{new Infraction(12, 2, 4), new Infraction(12, 3, 1), new Infraction(1, 5, 2), new Infraction(1, 6, 3)}), CoreMatchers.hasItems(1, 12));
    }

    @Test
    public void exercise_5_b() {
        assertThat(guide6.exercise_5_b(new Infraction[]{new Infraction(1, 2, 3), new Infraction(3, 3, 1), new Infraction(4, 5, 2), new Infraction(1, 6, 3)}), CoreMatchers.hasItems(2, 5, 6, 7, 8, 9, 10, 11, 12));
        assertThat(guide6.exercise_5_b(new Infraction[]{new Infraction(12, 2, 3), new Infraction(10, 3, 1), new Infraction(1, 5, 2), new Infraction(3, 6, 3)}), CoreMatchers.hasItems(2, 4, 5, 6, 7, 8, 9, 11));
    }

    @Test
    public void exercise_5_c() {
        assertEquals(9, guide6.exercise_5_c(new Infraction[]{new Infraction(1, 2, 3), new Infraction(1, 3, 1), new Infraction(1, 5, 2), new Infraction(1, 6, 3)}));
        assertEquals(16, guide6.exercise_5_c(new Infraction[]{new Infraction(12, 2, 10), new Infraction(12, 3, 1), new Infraction(1, 5, 2), new Infraction(1, 6, 3)}));
    }

    @Test
    public void exercise_6() {
        assertArrayEquals(new int[]{1, 2, 4, 7, 12}, guide6.exercise_6(new int[]{1, 1, 2, 3, 5}));
        assertArrayEquals(new int[]{1, 0, 5, 12, 14, 21, 26, 24, 27, 24, 29, 34}, guide6.exercise_6(new int[]{1, -1, 5, 7, 2, 7, 5, -2, 3, -3, 5, 5}));
        assertArrayEquals(new int[]{-1, -2, 3, 1, 1, -1, 2, -1, 4, -1}, guide6.exercise_6(new int[]{-1, -1, 5, -2, 0, -2, 3, -3, 5, -5}));
    }

    @Test
    public void exercise_7_a() {
        assertEquals(0, guide6.exercise_7_a(new Survey[]{new Survey(1, 24, 1), new Survey(1, 12, 1), new Survey(2, 22, 1), new Survey(1, 44, 1), new Survey(1, 8, 1), new Survey(1, 24, 1)}), 0.1);
        assertEquals(1, guide6.exercise_7_a(new Survey[]{new Survey(1, 24, 2), new Survey(2, 12, 1), new Survey(2, 22, 1), new Survey(1, 44, 2), new Survey(1, 8, 2), new Survey(1, 24, 2)}), 0.1);
        assertEquals(0.25, guide6.exercise_7_a(new Survey[]{new Survey(1, 24, 2), new Survey(2, 12, 1), new Survey(2, 22, 1), new Survey(1, 44, 1), new Survey(1, 8, 1), new Survey(1, 24, 1)}), 0.1);
    }

    @Test
    public void exercise_7_b() {
        assertEquals(22.33, guide6.exercise_7_b(new Survey[]{new Survey(1, 24, 1), new Survey(1, 12, 1), new Survey(2, 22, 1), new Survey(1, 44, 1), new Survey(1, 8, 1), new Survey(1, 24, 1)}), 0.1);
        assertEquals(25.16, guide6.exercise_7_b(new Survey[]{new Survey(1, 13, 1), new Survey(2, 15, 1), new Survey(2, 44, 1), new Survey(1, 60, 1), new Survey(1, 8, 1), new Survey(1, 11, 1)}), 0.1);
    }

    @Test
    public void exercise_7_c() {
        assertEquals(0, guide6.exercise_7_c(new Survey[]{new Survey(1, 24, 1), new Survey(1, 12, 1), new Survey(2, 2, 1), new Survey(1, 44, 1), new Survey(1, 8, 1), new Survey(1, 24, 1)}));
        assertEquals(1, guide6.exercise_7_c(new Survey[]{new Survey(2, 13, 2), new Survey(2, 15, 1), new Survey(2, 44, 1), new Survey(1, 60, 1), new Survey(2, 8, 1), new Survey(1, 11, 1)}));
        assertEquals(3, guide6.exercise_7_c(new Survey[]{new Survey(2, 33, 2), new Survey(2, 98, 1), new Survey(2, 44, 1), new Survey(1, 60, 1), new Survey(2, 8, 1), new Survey(1, 11, 1)}));

    }
}