package pl.zajecia; //zmiana
public class Main {
    public static void main(String[] args) {
        System.out.println("Iteracja: " + Iteracja(6));
        System.out.println("rekurencja: " + rekurencja(6));
    }
    private static long Iteracja(int n) {
        int suma = 0;
        while (n > 0) {
            suma =suma + n;
            n--;
        }
        return suma;
    }
    private static long rekurencja(int n) {
        if (n > 0) {
            return n + rekurencja(n - 1);
        } else {
            return 0;
        }
    }
}
