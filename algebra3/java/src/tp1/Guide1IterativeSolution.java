package tp1;

import java.util.List;

public class Guide1IterativeSolution implements Guide1 {
    //integrantes: Camila Catalini e Ignacio Estevo
    // Ejercicios a hacer 1.a  2.b  3  6.ii  8
    @Override
    public int exercise_1_a(int n) { //return n*(n+1)/2; Gauss Version
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
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
        int result = 1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }

    @Override
    public int exercise_2_b(int n) {
        int result = 1;
        for(int i=0;i<n;i++){
            result*=2;
        }
        return result;
    }

    @Override
    public int exercise_2_c(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    @Override
    public int exercise_2_d(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_3(int n) {
        int result = 0;
        while(n>0){
            if(n%10==0){
                result++;
            }
            n/=10;
        }
        return result;
    }

    @Override
    public boolean exercise_4(int[] array) {//Palindrome iterativo
        int[] aux = new int[array.length];
        for(int i=0;i<array.length;i++){
            aux[i] = array[i];
        }
        for(int i=0;i<array.length/2;i++){
            if(array[i]!=array[array.length-1-i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean exercise_5(int[] array, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_6_b_i(int n) { //IsPrime
        if (n == 1) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) { //n/2 porque no es necesario comprobar hasta la mitad. Java redondea para abajo. En el 7, nos da 3, porque ya del 4 en adelante no es necesario comprobar.
            if (n % i == 0) { //Empezando del 2 y yendo hasta la mitad, si algun numero es divisor, no es primo. Contemplamos el caso del 1 antes y el caso del mismo n en el for.
                return false;
            }
        }
        return true;
    }

    @Override
    public int exercise_6_b_ii(int n) { // Ej 6b ii. primer numero primo despues de n (si el n es primo lo devuelve)
        int i = n;
        while(!exercise_6_b_i(i)){ //Mientras no sea primo el numero, incremento en 1.
            i++;
        }
        return i;
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
        int[] aux = new int[coefs.length];
        aux[coefs.length-1] = coefs[coefs.length-1];
        for (int i = coefs.length-2; i >= 0; i--) {
            aux[i] = coefs[i] + aux[i+1]*n;
        }
        return aux[0];
    }

}
