public class AlgGuia1 {

    public static void main(String[] args) {

        System.out.println(polinomioEvaluado(new int[]{2,8,1},3));// El algoritmo evalua en la forma de 2+8x+x^2
        System.out.println(hornerIterative(new int[]{2,8,1},3));// El algoritmo evalua en la forma de 2+8x+x^2
        System.out.println(hornerRecursive(new int[]{1,8,2},3,2)); //2 = array.length - 1. El algoritmo evalua en la forma de x^2+8x+2
        System.out.println(isPrime(7));
    }

    public static int sumOfNaturals(int n){ // Suma de numeros naturales. Ej 1.a resuelto por Gauss
        return n*(n+1)/2;
    }
    public static int sumOfNaturalsIterative(int n){ // Suma de numeros naturales. Ej 1.a resuelto por un for
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
    public static int sumOfNaturalsRecursive(int n){ // Suma de numeros naturales. Ej 1.a resuelto por Recursividad
        if(n==0){
            return 0;
        }
        return n+sumOfNaturalsRecursive(n-1);
    }
    public static int twoToTheN(int n){ // Potencia de 2. Ej 2.b resuelto por potencia
        return (int) Math.pow(2,n);
    }
    public static int twoToTheNIterative(int n){ // Potencia de 2. Ej 2.b resuelto por un for
        int result = 1;
        for(int i=0;i<n;i++){
            result*=2;
        }
        return result;
    }
    public static int twoToTheNRecursive(int n){ // Potencia de 2. Ej 2.b resuelto por recursividad
        if (n == 0) {
            return 1;
        }
        return 2 * twoToTheNRecursive(n - 1);
    }

    public static boolean isPrime(int n){// Ej 6b i. numero entero positivo es primo?
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
    public static int firstPrimeAfter(int n){// Ej 6b ii. primer numero primo despues de n (si el n es primo lo devuelve)
        if (isPrime(n)) {
            return n;
        }
        else {
            return firstPrimeAfter(n+1);
        }
    }

    public static int hornerRecursive(int[] array,int x,int n){ //Ej 8 Horner recursivo  n = array.length - 1
        int h;
        if(n>0)
            h = hornerRecursive(array, x, n-1);
        else
            return array[n];

        return h*x+array[n];
    }

    public static int hornerIterative(int[] array,int x){ //Ej 8 Horner iterativo evaluado en x
        int[] aux = new int[array.length];
        aux[array.length-1] = array[array.length-1];
        for (int i = array.length-2; i >= 0; i--) {
            aux[i] = array[i] + aux[i+1]*x;
        }
        return aux[0];
    }

    public static int polinomioEvaluado(int[] array,int n){ //Polinomio en forma c + bx + ax^2...nx^m  Usado para comparar con horner
        int result = 0;
        for(int i=0;i<array.length;i++){
            result+=array[i]*(int)Math.pow(n,i);
        }
        return result;
    }

    //Resolucion del resto de la guia 1
    public static int factorialRecursive(int n){
        if(n==0){
            return 1;
        }
        return n*factorialRecursive(n-1);
    }
    public static int factorialIterative(int n){
        int result = 1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public static int fibonacciRecursive(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }
    public static int fibonacciIterative(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=0;i<n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
    public static int numberOfZeros(int n){
        int result = 0;
        while(n>0){
            if(n%10==0){
                result++;
            }
            n/=10;
        }
        return result;
    }
    public static int numberOfZerosRecursive(int n){
        if(n==0){
            return 0;
        }
        if(n%10==0){
            return 1+numberOfZerosRecursive(n/10);
        }
        return numberOfZerosRecursive(n/10);
    }
    public static boolean isPalindrome(int n){
        int reverse = 0;
        int copy = n;
        while(copy>0){
            reverse = reverse*10+copy%10;
            copy/=10;
        }
        return reverse==n;
    }
    public static boolean isPalindromeRecursive(int n){
        if(n<10){
            return true;
        }
        if(n%10==n/10){
            return isPalindromeRecursive(n/10);
        }
        return false;
    }
    public static boolean isInArray(int[] array,int n){
        for (int j : array) {
            if (j == n) {
                return true;
            }
        }
        return false;
    }
}
