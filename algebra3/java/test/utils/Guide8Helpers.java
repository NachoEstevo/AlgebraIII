package utils;

public class Guide8Helpers {
    public static boolean check_lower_triangular(double mat[][]) {
        int N = mat.length;
        int i, j;
        for (i = 0; i < N; i++)
            for (j = i + 1; j < N; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    }

    public static boolean check_upper_triangular(double mat[][]) {
        int i, j;
        for (i = 1; i < mat.length; i++)
            for (j = 0; j < i; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    }
}
