package pl.zajecia;
public class Silnia {
    public static void main(String[] args) {
        System.out.println("Silnia iteracyjnie: " + silnia_iteracyjnie(6));
        System.out.println("Silnia rekurencyjnie: " + silnia_rekurencyjna(6));
    }
    private static long silnia_rekurencyjna(int n) {
        if (n == 0)
            return 1;
        else
            return (n * silnia_rekurencyjna(n - 1));
    }
    private static long silnia_iteracyjnie(int n) {
        int iloczyn = 1;
        for (int i = 1; i <= n; i++) {
            iloczyn *= i;
        }
        return iloczyn;
    }
}