# -*- coding: utf-8 -*-
import unittest
from tp1.exceptions import ToDoException
from tp1.Guide1IterativeSolution import Guide1IterativeSolution
from tp1.Guide1RecursiveSolution import Guide1RecursiveSolution


class Guide1TestMixin(object):

    guide1 = None

    def test_exercise_1_a(self):
        try:
            self.assertEqual(1, self.guide1.exercise_1_a(1))
            self.assertEqual(3, self.guide1.exercise_1_a(2))
            self.assertEqual(6, self.guide1.exercise_1_a(3))
            self.assertEqual(10, self.guide1.exercise_1_a(4))
            self.assertEqual(15, self.guide1.exercise_1_a(5))
            self.assertEqual(21, self.guide1.exercise_1_a(6))
            self.assertEqual(25425, self.guide1.exercise_1_a(225))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_1_b(self):
        try:
            self.assertEqual(1, self.guide1.exercise_1_b(1))
            self.assertEqual(5, self.guide1.exercise_1_b(2))
            self.assertEqual(14, self.guide1.exercise_1_b(3))
            self.assertEqual(30, self.guide1.exercise_1_b(4))
            self.assertEqual(55, self.guide1.exercise_1_b(5))
            self.assertEqual(91, self.guide1.exercise_1_b(6))
            self.assertEqual(3822225, self.guide1.exercise_1_b(225))
        except ToDoException:
            self.skipTest("skipped test")


    def test_exercise_1_c(self):
        try:
            self.assertEqual(2, self.guide1.exercise_1_c(1, 1))
            self.assertEqual(15, self.guide1.exercise_1_c(2, 3))
            self.assertEqual(13, self.guide1.exercise_1_c(3, 2))
            self.assertEqual(341, self.guide1.exercise_1_c(4, 4))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_1_d(self):
        try:
            self.assertEqual(1, self.guide1.exercise_1_d(1))
            self.assertEqual(4, self.guide1.exercise_1_d(2))
            self.assertEqual(9, self.guide1.exercise_1_d(3))
            self.assertEqual(16, self.guide1.exercise_1_d(4))
            self.assertEqual(25, self.guide1.exercise_1_d(5))
            self.assertEqual(36, self.guide1.exercise_1_d(6))
            self.assertEqual(50625, self.guide1.exercise_1_d(225))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_1_e(self):
        try:
            self.assertEqual(2, self.guide1.exercise_1_e(1))
            self.assertEqual(8, self.guide1.exercise_1_e(2))
            self.assertEqual(20, self.guide1.exercise_1_e(3))
            self.assertEqual(40, self.guide1.exercise_1_e(4))
            self.assertEqual(70, self.guide1.exercise_1_e(5))
            self.assertEqual(112, self.guide1.exercise_1_e(6))
            self.assertEqual(3847650, self.guide1.exercise_1_e(225))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_1_f(self):
        try:
            self.assertEqual(0, self.guide1.exercise_1_f(0))
            self.assertEqual(1, self.guide1.exercise_1_f(1))
            self.assertEqual(9, self.guide1.exercise_1_f(2))
            self.assertEqual(36, self.guide1.exercise_1_f(3))
            self.assertEqual(100, self.guide1.exercise_1_f(4))
            self.assertEqual(225, self.guide1.exercise_1_f(5))
            self.assertEqual(441, self.guide1.exercise_1_f(6))
            self.assertEqual(646430625, self.guide1.exercise_1_f(225))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_2_a(self):
        try:
            self.assertEqual(1, self.guide1.exercise_2_a(0))
            self.assertEqual(1, self.guide1.exercise_2_a(1))
            self.assertEqual(2, self.guide1.exercise_2_a(2))
            self.assertEqual(6, self.guide1.exercise_2_a(3))
            self.assertEqual(24, self.guide1.exercise_2_a(4))
            self.assertEqual(479001600, self.guide1.exercise_2_a(12))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_2_b(self):
        try:
            self.assertEqual(1, self.guide1.exercise_2_b(0))
            self.assertEqual(2, self.guide1.exercise_2_b(1))
            self.assertEqual(4, self.guide1.exercise_2_b(2))
            self.assertEqual(8, self.guide1.exercise_2_b(3))
            self.assertEqual(16, self.guide1.exercise_2_b(4))
            self.assertEqual(33554432, self.guide1.exercise_2_b(25))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_2_c(self):
        try:
            self.assertEqual(0, self.guide1.exercise_2_c(0))
            self.assertEqual(1, self.guide1.exercise_2_c(1))
            self.assertEqual(1, self.guide1.exercise_2_c(2))
            self.assertEqual(2, self.guide1.exercise_2_c(3))
            self.assertEqual(3, self.guide1.exercise_2_c(4))
            self.assertEqual(5, self.guide1.exercise_2_c(5))
            self.assertEqual(8, self.guide1.exercise_2_c(6))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_2_d(self):
        try:
            self.assertEqual(1, self.guide1.exercise_2_d(1, 1))
            self.assertEqual(3, self.guide1.exercise_2_d(111, 201))
            self.assertEqual(139, self.guide1.exercise_2_d(14039, 1529))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_3(self):
        try:
            self.assertEqual(0, self.guide1.exercise_3(1))
            self.assertEqual(1, self.guide1.exercise_3(10))
            self.assertEqual(2, self.guide1.exercise_3(93020))
            self.assertEqual(3, self.guide1.exercise_3(3012100))
            self.assertEqual(8, self.guide1.exercise_3(200000000))
            self.assertEqual(4, self.guide1.exercise_3(20202020))
            self.assertEqual(0, self.guide1.exercise_3(1989))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_4(self):
        try:
            self.assertFalse(self.guide1.exercise_4([1, 2, 3]))
            self.assertFalse(self.guide1.exercise_4([1, 2, 3, 4, 3, 1, 2]))
            self.assertFalse(self.guide1.exercise_4([1, 2, 2, 1, 1]))
            self.assertTrue(self.guide1.exercise_4([8, 9, 8]))
            self.assertTrue(self.guide1.exercise_4([1, 2, 3, 4, 5, 4, 3, 2, 1]))
            self.assertTrue(self.guide1.exercise_4([1, 1, 1, 1, 1]))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_5(self):
        try:
            self.assertFalse(self.guide1.exercise_5([1, 2, 3], 6))
            self.assertFalse(self.guide1.exercise_5([1, 2, 3, 4, 3, 1, 2], 5))
            self.assertFalse(self.guide1.exercise_5([1, 2, 2, 1, 1], 9))
            self.assertTrue(self.guide1.exercise_5([8, 9, 8], 8))
            self.assertTrue(self.guide1.exercise_5([1, 2, 3, 4, 5, 4, 3, 2, 1], 3))
            self.assertTrue(self.guide1.exercise_5([1, 1, 1, 1, 1], 1))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_6_b_i(self):
        try:
            self.assertTrue(self.guide1.exercise_6_b_i(2))
            self.assertTrue(self.guide1.exercise_6_b_i(3))
            self.assertTrue(self.guide1.exercise_6_b_i(5))
            self.assertTrue(self.guide1.exercise_6_b_i(7))
            self.assertTrue(self.guide1.exercise_6_b_i(11))
            self.assertTrue(self.guide1.exercise_6_b_i(13))
            self.assertFalse(self.guide1.exercise_6_b_i(4))
            self.assertFalse(self.guide1.exercise_6_b_i(8))
            self.assertFalse(self.guide1.exercise_6_b_i(9))
            self.assertFalse(self.guide1.exercise_6_b_i(10))
            self.assertFalse(self.guide1.exercise_6_b_i(12))
            self.assertFalse(self.guide1.exercise_6_b_i(14))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_6_b_ii(self):
        try:
            self.assertEqual(2, self.guide1.exercise_6_b_ii(2))
            self.assertEqual(3, self.guide1.exercise_6_b_ii(3))
            self.assertEqual(5, self.guide1.exercise_6_b_ii(5))
            self.assertEqual(7, self.guide1.exercise_6_b_ii(7))
            self.assertEqual(11, self.guide1.exercise_6_b_ii(8))
            self.assertEqual(11, self.guide1.exercise_6_b_ii(9))
            self.assertEqual(11, self.guide1.exercise_6_b_ii(10))
            self.assertEqual(5, self.guide1.exercise_6_b_ii(4))
            self.assertEqual(13, self.guide1.exercise_6_b_ii(12))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_6_b_iii(self):
        try:
            self.assertEqual(1, self.guide1.exercise_6_b_iii(2))
            self.assertEqual(1, self.guide1.exercise_6_b_iii(3))
            self.assertEqual(2, self.guide1.exercise_6_b_iii(4))
            self.assertEqual(1, self.guide1.exercise_6_b_iii(5))
            self.assertEqual(1, self.guide1.exercise_6_b_iii(7))
            self.assertEqual(2, self.guide1.exercise_6_b_iii(6))
            self.assertEqual(3, self.guide1.exercise_6_b_iii(8))
            self.assertEqual(2, self.guide1.exercise_6_b_iii(9))
            self.assertEqual(2, self.guide1.exercise_6_b_iii(10))
            self.assertEqual(4, self.guide1.exercise_6_b_iii(16))
            self.assertEqual(3, self.guide1.exercise_6_b_iii(30))
            self.assertEqual(3, self.guide1.exercise_6_b_iii(66))
            self.assertEqual(4, self.guide1.exercise_6_b_iii(315))
        except ToDoException:
            self.skipTest("skipped test")

    def test_xercise_6_b_iv(self):
        try:
            self.assertEqual(set(self.guide1.exercise_6_b_iv(2)), set([2]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(3)), set([2]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(4)), set([2, 2]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(5)), set([5]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(7)), set([7]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(8)), set([2, 2, 2]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(9)), set([3, 3]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(10)), set([2, 5]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(16)), set([2, 2, 2, 2]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(30)), set([2, 3, 5]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(66)), set([2, 3, 11]))
            self.assertEqual(set(self.guide1.exercise_6_b_iv(315)), set([3, 3, 5, 7]))
        except ToDoException:
            self.skipTest("skipped test")

    def test_exercise_8(self):
        try:
            self.assertEqual(340, self.guide1.exercise_8([1, 8, 5, 10], 3))
            self.assertEqual(117, self.guide1.exercise_8([1, 8, 5, 10], 2))
            self.assertEqual(24, self.guide1.exercise_8([1, 8, 5, 10], 1))
            self.assertEqual(1, self.guide1.exercise_8([1, 8, 5, 10], 0))
        except ToDoException:
            self.skipTest("skipped test")


class Guide1IterativeSolutionTest(Guide1TestMixin, unittest.TestCase):
    guide1 = Guide1IterativeSolution()


class Guide1RecursiveSolutionTest(Guide1TestMixin, unittest.TestCase):
    guide1 = Guide1RecursiveSolution()


if __name__ == '__main__':
    unittest.main()
