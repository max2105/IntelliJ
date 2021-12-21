package pl.zajecia;

public class Ackerman {
    public static void main(String[] args) {
        System.out.println("Ackerman: " + Ackerman(3, 4));
    }
    private static int Ackerman(int m, int n) {

        if (m > 0 && n == 0)
            return Ackerman(m - 1, 1);

        if (m > 0 && n > 0)
            return Ackerman(m - 1, Ackerman(m, n - 1));

        if (m == 0)
            return n + 1;


        return n;
    }

}
