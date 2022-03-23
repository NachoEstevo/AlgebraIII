import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import tp1.Guide1;
import tp1.Guide1IterativeSolution;
import tp1.Guide1RecursiveSolution;
import utils.SkipRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Guide1Test extends SkipRule {
    private Guide1 guide1;

    public Guide1Test(Guide1 guide) {
        guide1 = guide;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Guide1> parameters() {
        return new ArrayList<>(Arrays.asList(new Guide1IterativeSolution(), new Guide1RecursiveSolution()));
    }


    @Test
    public void exercise_1_a() {
        assertEquals(1, guide1.exercise_1_a(1));
        assertEquals(3, guide1.exercise_1_a(2));
        assertEquals(6, guide1.exercise_1_a(3));
        assertEquals(10, guide1.exercise_1_a(4));
        assertEquals(15, guide1.exercise_1_a(5));
        assertEquals(21, guide1.exercise_1_a(6));
        assertEquals(25425, guide1.exercise_1_a(225));
    }

    @Test
    public void exercise_1_b() {
        assertEquals(1, guide1.exercise_1_b(1));
        assertEquals(5, guide1.exercise_1_b(2));
        assertEquals(14, guide1.exercise_1_b(3));
        assertEquals(30, guide1.exercise_1_b(4));
        assertEquals(55, guide1.exercise_1_b(5));
        assertEquals(91, guide1.exercise_1_b(6));
        assertEquals(3822225, guide1.exercise_1_b(225));
    }

    @Test
    public void exercise_1_c() {
        assertEquals(2, guide1.exercise_1_c(1, 1));
        assertEquals(15, guide1.exercise_1_c(2, 3));
        assertEquals(13, guide1.exercise_1_c(3, 2));
        assertEquals(341, guide1.exercise_1_c(4, 4));
    }

    @Test
    public void exercise_1_d() {
        assertEquals(1, guide1.exercise_1_d(1));
        assertEquals(4, guide1.exercise_1_d(2));
        assertEquals(9, guide1.exercise_1_d(3));
        assertEquals(16, guide1.exercise_1_d(4));
        assertEquals(25, guide1.exercise_1_d(5));
        assertEquals(36, guide1.exercise_1_d(6));
        assertEquals(50625, guide1.exercise_1_d(225));
    }

    @Test
    public void exercise_1_e() {
        assertEquals(2, guide1.exercise_1_e(1));
        assertEquals(8, guide1.exercise_1_e(2));
        assertEquals(20, guide1.exercise_1_e(3));
        assertEquals(40, guide1.exercise_1_e(4));
        assertEquals(70, guide1.exercise_1_e(5));
        assertEquals(112, guide1.exercise_1_e(6));
        assertEquals(3847650, guide1.exercise_1_e(225));
    }

    @Test
    public void exercise_1_f() {
        assertEquals(0, guide1.exercise_1_f(0));
        assertEquals(1, guide1.exercise_1_f(1));
        assertEquals(9, guide1.exercise_1_f(2));
        assertEquals(36, guide1.exercise_1_f(3));
        assertEquals(100, guide1.exercise_1_f(4));
        assertEquals(225, guide1.exercise_1_f(5));
        assertEquals(441, guide1.exercise_1_f(6));
        assertEquals(646430625, guide1.exercise_1_f(225));
    }

    @Test
    public void exercise_2_a() {
        assertEquals(1, guide1.exercise_2_a(0));
        assertEquals(1, guide1.exercise_2_a(1));
        assertEquals(2, guide1.exercise_2_a(2));
        assertEquals(6, guide1.exercise_2_a(3));
        assertEquals(24, guide1.exercise_2_a(4));
        assertEquals(479001600, guide1.exercise_2_a(12));
    }

    @Test
    public void exercise_2_b() {
        assertEquals(1, guide1.exercise_2_b(0));
        assertEquals(2, guide1.exercise_2_b(1));
        assertEquals(4, guide1.exercise_2_b(2));
        assertEquals(8, guide1.exercise_2_b(3));
        assertEquals(16, guide1.exercise_2_b(4));
        assertEquals(33554432, guide1.exercise_2_b(25));
    }

    @Test
    public void exercise_2_c() {
        assertEquals(0, guide1.exercise_2_c(0));
        assertEquals(1, guide1.exercise_2_c(1));
        assertEquals(1, guide1.exercise_2_c(2));
        assertEquals(2, guide1.exercise_2_c(3));
        assertEquals(3, guide1.exercise_2_c(4));
        assertEquals(5, guide1.exercise_2_c(5));
        assertEquals(8, guide1.exercise_2_c(6));
    }

    @Test
    public void exercise_2_d() {
        assertEquals(1, guide1.exercise_2_d(1, 1));
        assertEquals(3, guide1.exercise_2_d(111, 201));
        assertEquals(139, guide1.exercise_2_d(14039, 1529));
    }

    @Test
    public void exercise_3() {
        assertEquals(0, guide1.exercise_3(1));
        assertEquals(1, guide1.exercise_3(10));
        assertEquals(2, guide1.exercise_3(93020));
        assertEquals(3, guide1.exercise_3(3012100));
        assertEquals(8, guide1.exercise_3(200000000));
        assertEquals(4, guide1.exercise_3(20202020));
        assertEquals(0, guide1.exercise_3(1989));
    }

    @Test
    public void exercise_4() {
        assertFalse(guide1.exercise_4(new int[]{1, 2, 3}));
        assertFalse(guide1.exercise_4(new int[]{1, 2, 3, 4, 3, 1, 2}));
        assertFalse(guide1.exercise_4(new int[]{1, 2, 2, 1, 1}));
        assertTrue(guide1.exercise_4(new int[]{8, 9, 8}));
        assertTrue(guide1.exercise_4(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
        assertTrue(guide1.exercise_4(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void exercise_5() {
        assertFalse(guide1.exercise_5(new int[]{1, 2, 3}, 6));
        assertFalse(guide1.exercise_5(new int[]{1, 2, 3, 4, 3, 1, 2}, 5));
        assertFalse(guide1.exercise_5(new int[]{1, 2, 2, 1, 1}, 9));
        assertTrue(guide1.exercise_5(new int[]{8, 9, 8}, 8));
        assertTrue(guide1.exercise_5(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}, 3));
        assertTrue(guide1.exercise_5(new int[]{1, 1, 1, 1, 1}, 1));
    }

    @Test
    public void exercise_6_b_i() {
        assertTrue(guide1.exercise_6_b_i(2));
        assertTrue(guide1.exercise_6_b_i(3));
        assertTrue(guide1.exercise_6_b_i(5));
        assertTrue(guide1.exercise_6_b_i(7));
        assertTrue(guide1.exercise_6_b_i(11));
        assertTrue(guide1.exercise_6_b_i(13));
        assertFalse(guide1.exercise_6_b_i(4));
        assertFalse(guide1.exercise_6_b_i(8));
        assertFalse(guide1.exercise_6_b_i(9));
        assertFalse(guide1.exercise_6_b_i(10));
        assertFalse(guide1.exercise_6_b_i(12));
        assertFalse(guide1.exercise_6_b_i(14));
    }

    @Test
    public void exercise_6_b_ii() {
        assertEquals(2, guide1.exercise_6_b_ii(2));
        assertEquals(3, guide1.exercise_6_b_ii(3));
        assertEquals(5, guide1.exercise_6_b_ii(5));
        assertEquals(7, guide1.exercise_6_b_ii(7));
        assertEquals(11, guide1.exercise_6_b_ii(8));
        assertEquals(11, guide1.exercise_6_b_ii(9));
        assertEquals(11, guide1.exercise_6_b_ii(10));
        assertEquals(5, guide1.exercise_6_b_ii(4));
        assertEquals(13, guide1.exercise_6_b_ii(12));
    }

    @Test
    public void exercise_6_b_iii() {
        assertEquals(1, guide1.exercise_6_b_iii(2));
        assertEquals(1, guide1.exercise_6_b_iii(3));
        assertEquals(2, guide1.exercise_6_b_iii(4));
        assertEquals(1, guide1.exercise_6_b_iii(5));
        assertEquals(1, guide1.exercise_6_b_iii(7));
        assertEquals(2, guide1.exercise_6_b_iii(6));
        assertEquals(3, guide1.exercise_6_b_iii(8));
        assertEquals(2, guide1.exercise_6_b_iii(9));
        assertEquals(2, guide1.exercise_6_b_iii(10));
        assertEquals(4, guide1.exercise_6_b_iii(16));
        assertEquals(3, guide1.exercise_6_b_iii(30));
        assertEquals(3, guide1.exercise_6_b_iii(66));
        assertEquals(4, guide1.exercise_6_b_iii(315));
    }

    @Test
    public void exercise_6_b_iv() {
        assertThat(guide1.exercise_6_b_iv(2), CoreMatchers.hasItems(2));
        assertThat(guide1.exercise_6_b_iv(3), CoreMatchers.hasItems(3));
        assertThat(guide1.exercise_6_b_iv(4), CoreMatchers.hasItems(2, 2));
        assertThat(guide1.exercise_6_b_iv(5), CoreMatchers.hasItems(5));
        assertThat(guide1.exercise_6_b_iv(6), CoreMatchers.hasItems(2, 3));
        assertThat(guide1.exercise_6_b_iv(7), CoreMatchers.hasItems(7));
        assertThat(guide1.exercise_6_b_iv(8), CoreMatchers.hasItems(2, 2, 2));
        assertThat(guide1.exercise_6_b_iv(9), CoreMatchers.hasItems(3, 3));
        assertThat(guide1.exercise_6_b_iv(10), CoreMatchers.hasItems(2, 5));
        assertThat(guide1.exercise_6_b_iv(16), CoreMatchers.hasItems(2, 2, 2, 2));
        assertThat(guide1.exercise_6_b_iv(30), CoreMatchers.hasItems(2, 3, 5));
        assertThat(guide1.exercise_6_b_iv(66), CoreMatchers.hasItems(2, 3, 11));
        assertThat(guide1.exercise_6_b_iv(315), CoreMatchers.hasItems(3, 3, 5, 7));
    }

    @Test
    public void exercise_8() {
        assertEquals(340, guide1.exercise_8(new int[]{1, 8, 5, 10}, 3));
        assertEquals(117, guide1.exercise_8(new int[]{1, 8, 5, 10}, 2));
        assertEquals(24, guide1.exercise_8(new int[]{1, 8, 5, 10}, 1));
        assertEquals(1, guide1.exercise_8(new int[]{1, 8, 5, 10}, 0));
    }
}