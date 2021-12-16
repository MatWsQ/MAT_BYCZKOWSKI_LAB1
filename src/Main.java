import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię:");
        String imie = scan.next();
        System.out.print("Podaj nazwisko:");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek:");
        int wiek = scan.nextInt();
        System.out.print("Podaj numer Indeksu:");
        int nr_indeksu = scan.nextInt();

        System.out.printf("Imie:  %s Naziwsko: %s ", imie, nazwisko );
        System.out.println("Wiek: "+wiek + " "+ "Numer Indeksu: "+nr_indeksu);


        System.out.println(" ");
        System.out.println("Podaj 1 liczbę: ");
        int liczbaA = scan.nextInt();
        System.out.println("Podaj 2 liczbę: ");
        int liczbaB = scan.nextInt();

        System.out.println("Dodawanie = "+ (liczbaA + liczbaB));
        System.out.println("Odejmowanie = "+ (liczbaA - liczbaB));
        System.out.println("Mnożenie = "+ (liczbaA * liczbaB));
        System.out.println("Dzielenie = "+ (liczbaA / liczbaB));
        System.out.println("Modulo = "+ (liczbaA % liczbaB));
    }
}