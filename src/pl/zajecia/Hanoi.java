package pl.zajecia;

public class Hanoi {
    public static void main(String[] args) {
        Hanoi(3, 2, 1);

    }
    private static void Hanoi(int wysokosc, int start, int koniec) {
        if (wysokosc == 1) {
            System.out.println("[element 1] z " + start + " na " + koniec);
        } else {
            int temporary = 6 - koniec - start;
            Hanoi(wysokosc - 1, start, temporary);
            System.out.println("[element " + wysokosc + "] z " + start + " na " + koniec);
            Hanoi(wysokosc - 1, temporary, koniec);
        }

    }

}

