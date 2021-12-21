package pl.zajecia;

public class Euklides {
    public static void main(String[] args) {
        System.out.println("Iteracyjnie =" + EuklidesIteracyjnie(12, 3));
        System.out.println("Rekurencyjnie = " + EuklidesRekurencyjny(12, 3));
    }

    private static int EuklidesIteracyjnie(int a, int b) {
        while (a != b)
            if (a > b)
                a -= b;
            else b -= a;
        return a;
    }

    private static int EuklidesRekurencyjny(int a, int b) {
        if (a != b)
            return EuklidesRekurencyjny(a > b ? a - b : a, b > a ? b - a : b);
        return a;
    }

}