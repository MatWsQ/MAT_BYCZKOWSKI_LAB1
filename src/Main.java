import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();
        if (wiek % 3 == 0)
        {
            System.out.println("Podzielny przez 3");
        }
        else
            System.out.println("Niepodzielny przez 3 ");

        System.out.println("Podaj numer indeksu: ");
        int nr_indeksu = scan.nextInt();
        int wynik = (nr_indeksu % 2 == 0) ? 0 : 1;
        if (wynik == 0)
            System.out.println("Numer indeksu jest parzysty");
        else
            System.out.println("Numer indeksu jest nieparzysty");

        System.out.print("Podaj dowolną liczbę: ");
        double lp = scan.nextDouble();
        if (lp > 0)
            System.out.println("Liczba jest większa od zera");
        else if (lp == 0)
            System.out.println("Liczba jest równa zero");
        else if (lp < 0)
            System.out.println("Liczba jest mniejsza od zera");
    }
}

