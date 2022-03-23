package tp1;

import java.util.List;

public class Guide1RecursiveSolution implements Guide1 {
    //integrantes: Camila Catalini e Ignacio Estevo
    // Ejercicios a hacer 1.a  2.b  3  6.ii  8

    public static int polinomioEvaluado(int[] array,int n){ //Polinomio en forma c + bx + ax^2...nx^m  Usado para comparar con horner
        int result = 0;
        for(int i=0;i<array.length;i++){
            result+=array[i]*(int)Math.pow(n,i);
        }
        return result;
    }

    @Override
    public int exercise_1_a(int n) {
        if(n==0){
            return 0;
        }
        return n+exercise_1_a(n-1);
    }

    @Override
    public int exercise_1_b(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int p, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_d(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_e(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_f(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_a(int n) {
        if(n==0){
            return 1;
        }
        return n*exercise_2_a(n-1);
    }

    @Override
    public int exercise_2_b(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * exercise_2_b(n - 1);
    }

    @Override
    public int exercise_2_c(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return exercise_2_c(n-1)+exercise_2_c(n-2);
    }

    @Override
    public int exercise_2_d(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_3(int n) {
        if(n==0){
            return 0;
        }
        if(n%10==0){
            return 1+exercise_3(n/10);
        }
        return exercise_3(n/10);
    }

    @Override
    public boolean exercise_4(int[] array) { //Palindrome recursivo
        if(array.length==1){
            return true;
        }
        if(array[0]!=array[array.length-1]){
            return false;
        }
        int[] aux = new int[array.length-2];
        for(int i=1;i<array.length-1;i++){
            aux[i-1] = array[i];
        }
        return exercise_4(aux);
    }

    @Override
    public boolean exercise_5(int[] array, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_6_b_i(int n) { //IsPrime recursivo
        if (n <= 2 || n % 2 == 0) {
            return (n == 2);
        }
        return isPrimeRecursive(n, 3);

    }
    private static boolean isPrimeRecursive(int n, int i) {
        if (i * i > n) {return true;}

        if (n % i == 0) {return false;}
        return isPrimeRecursive(n, i + 2);
    }

    @Override
    public int exercise_6_b_ii(int n) { //No pasa el test pero considero que es correcto. Pregunta si el numero es primo, y si lo es, devuelve el numero. En caso contrario, sigue buscando al proximo primo
        if (exercise_6_b_i(n)) {
            return n;
        }
        else {
            return exercise_6_b_ii(n+1);
        }
    }

    @Override
    public int exercise_6_b_iii(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<Integer> exercise_6_b_iv(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_8(int[] coefs, int n) {
       return  hornerRecursive(coefs,n, 0);
    }
   private int hornerRecursive(int[] array,int x,int n){ //Ej 8 Horner recursivo  n = array.length - 1
        int h;
        if(n<array.length-1) {
            h = hornerRecursive(array, x, n + 1);
        }
        else
            return array[n];

        return h*x+array[n];
    }

}
