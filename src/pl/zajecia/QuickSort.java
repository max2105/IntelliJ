package pl.zajecia;

public class QuickSort {

    public static void main(String[] args)
    {
        int[] tab = { 5,3,2,1,9,13,4,7 };
        int n = tab.length;
        QuickSort(tab, 0, n - 1);
        System.out.println("Posortowana tablica: ");
        wyswietlTablice(tab, n);
    }

    private static void zamien(int[] tab, int i, int j)
    {
        int T = tab[i];
        tab[i] = tab[j];
        tab[j] = T;
    }

    private static int pozycja(int[] tab, int poczatek, int koniec)
    {
        int x = tab[koniec];

        int i = (poczatek - 1);

        for(int j = poczatek; j <= koniec - 1; j++)
        {
            if (tab[j] < x)
            {
                i++;
                zamien(tab, i, j);
            }
        }
        zamien(tab, i + 1, koniec);
        return (i + 1);
    }

    private static void QuickSort(int[] tab, int poczatek, int koniec)
    {
        if (poczatek < koniec)
        {
            int index = pozycja(tab, poczatek, koniec);

            QuickSort(tab, poczatek, index - 1);
            QuickSort(tab, index + 1, koniec);
        }
    }

    private static void wyswietlTablice(int[] tab, int rozmiar)
    {
        for(int i = 0; i < rozmiar; i++)
            System.out.print(tab[i] + " ");

        System.out.println();
    }

}