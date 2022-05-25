package tp2;

import tp2.utils.Infraction;
import tp2.utils.Survey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guide6Solution implements Guide6 {
    //integrantes: Camila Catalini e Ignacio Estevo
    // Ejercicios a hacer 1 g   2    3   5

    @Override
    public int exercise_1_a(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int[] a, int value) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_d(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_e(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_f(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    /*Concatenar dos arreglos, esto es dados v y w, la función debe construir un arreglo formado
    por los elementos de v y a continuación los de w*/
    @Override
    public int[] exercise_1_g(int[] v, int[] w) { //Can also be solved using the method "concat" or "addAll" or for loops
        int[] concatenated = new int[v.length + w.length];
        System.arraycopy(v, 0, concatenated, 0, v.length);
        System.arraycopy(w, 0, concatenated, v.length, w.length);
        //Arrays.concatenate(v, w);

        return concatenated;
    }

    @Override
    public int[] exercise_1_h(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_i(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_j(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_k(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    /*Dado un arreglo A de números enteros, construir un nuevo arreglo B tal que en la posición i contenga
    la cantidad de elementos de A que son mayores a A(i). Ejemplo: si A = [5 7 2 4] entonces B = [1 0 3 2].*/
    @Override
    public int[] exercise_2(int[] a) {
        int[] B = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[i]) {
                    count++;
                }
            }
            B[i] = count;
        }
        return B;
    }

    /*Se dice que un vector v de enteros es melchoriforme si alguno de sus elementos es rubio. Diremos que
    un elemento es rubio si su valor coincide con la suma de los restantes elementos del vector. Realizar
    una función que dado un vector verifique si es o no melchoriforme*/
    @Override
    public boolean exercise_3(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) { //Sumo todos los elementos del vector
            sum += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum - a[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean exercise_4(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<Integer> exercise_5_a(Infraction[] a) {
        List<Integer> maxInfractions = new ArrayList<>();

        /*int max = 0;
        for (Infraction infraction : a) {
            if (infraction.numberOfInfractions > max) {
                max = infraction.numberOfInfractions;
            }
        }
        for (Infraction infraction : a) {
            if (infraction.numberOfInfractions == max) {
                maxInfractions.add(infraction.monthNumber);

            }
        }*/

        int[][] infractions = new int[12][1];

        for (int i = 0; i < 12; i++) { //Lleno el array con las infracciones por mes
            for (Infraction infraction : a) {
                if (infraction.monthNumber == i + 1) {
                    infractions[i][0] += infraction.numberOfInfractions;
                }
            }
        }
      int max = 0;
        for (int i = 0; i < 12; i++) { //Busco el o los maximos
            if (infractions[i][0] >= max) {
                max = infractions[i][0];
                maxInfractions.add(i+1);
            }
        }
        return maxInfractions;
    }

    @Override
    public List<Integer> exercise_5_b(Infraction[] infraction) { //Empezamos con que todos los meses pueden tener infracciones y vamos restando los cuando realmente las tienen
        List<Integer> zeroInfractionMonths = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        for (Infraction item : infraction) {
            if (item.numberOfInfractions > 0 ) {
                zeroInfractionMonths.remove(Integer.valueOf(item.monthNumber));
            }
        }
        return zeroInfractionMonths;
    }

    @Override
    public int exercise_5_c(Infraction[] infraction) {
        int totalInfractions = 0;
        for (Infraction item : infraction) {
            totalInfractions += item.numberOfInfractions;
        }
        return totalInfractions;
    }

    @Override
    public int[] exercise_6(int[] infraction) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public double exercise_7_a(Survey[] surveys) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public double exercise_7_b(Survey[] surveys) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_7_c(Survey[] surveys) {
        throw new UnsupportedOperationException("TODO");
    }
}
