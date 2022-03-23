package tp4.answers.utils;

// An auxiliary class for the LU matrix decomposition result
public class MatrixContainer {
    private final double[][] lower;
    private final double[][] upper;

    public MatrixContainer(double[][] lower, double[][] upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public double[][] getLower() {
        return lower;
    }

    public double[][] getUpper() {
        return upper;
    }
}
