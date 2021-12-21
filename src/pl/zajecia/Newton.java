package pl.zajecia;
public class Newton {
    public static void main(String[] args) {
        System.out.println("newton rekurencyjnie: " + newton_rek(7, 2));
        System.out.println("newton iteracyjnie: " + newton_ite(7, 2));
    }
    private static long newton_rek(int n, int k) {
        if (k == n || k == 0)
            return 1;
        return newton_rek(n - 1, k - 1) + newton_rek(n - 1, k);
    }
    private static long newton_ite(int n, int k) {
        long wynik = 1;
        if (k == 0 || k == n)
            return 1;
        else {
            for (int i = 1; i <= k; i++) {
                wynik = wynik * (n - i + 1) / i;
            }
        }
        return wynik;
    }
}
