public class AlgGuia1 {

    public static void main(String[] args) {

        System.out.println(polinomioEvaluado(new int[]{2,8,1},3));
        System.out.println(hornerIterative(new int[]{2,8,1},3));
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
    public static int hornerRecursive(int[] array,int n){
        if(n<array.length){
            return array[n]+hornerRecursive(array,n+1);
        }
        return 0;
    }
    public static int hornerIterative(int[] array,int n){
        int[] aux = new int[array.length];
        aux[array.length-1] = array[array.length-1];
        for (int i = array.length-2; i >= 0; i--) {
            aux[i] = array[i] + aux[i+1]*n;
        }
        return aux[0];
    }

    public static int polinomioEvaluado(int[] array,int n){ //Polinomio en forma c + bx + ax^2...nx^m
        int result = 0;
        for(int i=0;i<array.length;i++){
            result+=array[i]*(int)Math.pow(n,i);
        }
        return result;
    }

}
