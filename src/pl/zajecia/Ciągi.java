package pl.zajecia;
public class Ciągi {
    public static void main(String[] args) {
        System.out.println("Fibonacii iteracyjnie: " + Fib_Iteracyjnie(6));
        System.out.println("FIbonacii rekurecyjnie: " + Ciag_fib(6));
    }
    private static long Ciag_fib(int n){
        if (n==1 || n==2)
            return 1;
        else
            return Ciag_fib(n-1)+ Ciag_fib(n-2);
    }
    private static long Fib_Iteracyjnie(int n){
        int a=0, b=1;
        for (int i=0; i< n-1; i++)
        {
            a = b-a;
            b = a+b;
        }
        return b;
    }
}