public class Main {

    public static void main(String[] args) {

        /* ĆW#2 */
        byte zmiennaByte = 22;
        short zmiennaShort = 1231;
        int zmiennaInt = 10213;
        long zmiennaLong = 123000123000L;
        float zmiennaFloat = 22.12f;
        double zmiennaDouble = 129000.1299;
        boolean zmiennaBoolean = true;
        char zmiennaChar = 't';
        String zmiennaString = "Witaj świecie!";
        int liczbaA = 25;
        int liczbaB = 5;
        double liczbaX = 20.5;
        double liczbaY = 5.5;
        System.out.println("Wyświetlanie zmiennych: ");

        System.out.println(zmiennaByte);
        System.out.println(zmiennaShort);
        System.out.println(zmiennaInt);
        System.out.println(zmiennaLong);
        System.out.println(zmiennaFloat);
        System.out.println(zmiennaDouble);
        System.out.println(zmiennaBoolean);
        System.out.println(zmiennaChar);
        System.out.println(zmiennaString);
        System.out.println(liczbaA);
        System.out.println(liczbaB);
        System.out.println(liczbaX);
        System.out.println(liczbaY);

        System.out.println(" ");

        System.out.println("Dodawanie zmiennych typu INT"+" "+ (liczbaA + liczbaB));
        System.out.println("Odejmowanie zmiennych typu INT"+" "+ (liczbaA - liczbaB));
        System.out.println("Mnożenie zmiennych typu INT"+" "+ (liczbaA * liczbaB));
        System.out.println("Dzielenie zmiennych typu INT"+" "+ (liczbaA / liczbaB));
        System.out.println("Modulo zmiennych typu INT"+" "+ (liczbaB % liczbaA));
        System.out.println("Inkrementacja zmiennej LiczbaA"+" "+ (++liczbaA));
        System.out.println("Inkrementacja zmiennej LiczbaB"+" "+ (++liczbaB));
        System.out.println("Dekrementacja zmiennej LiczbaA"+" "+ (--liczbaA));
        System.out.println("Dekrementacja zmiennej LiczbaB"+" "+ (--liczbaB));

        System.out.println(" ");

        System.out.println("Dodawanie zmiennych typu Double"+" "+ (liczbaX + liczbaY));
        System.out.println("Odejmowanie zmiennych typu Double"+" "+ (liczbaX - liczbaY));
        System.out.println("Mnożenie zmiennych typu Double"+" "+ (liczbaX + liczbaY));
        System.out.println("Dzielenie zmiennych typu Double"+" "+ (liczbaX - liczbaY));
        System.out.println("Modulo zmiennych typu Double"+" "+ (liczbaY % liczbaX));
        System.out.println("Inkrementacja zmiennej LiczbaX"+" "+ (++liczbaX));
        System.out.println("Inkrementacja zmiennej LiczbaY"+" "+ (++liczbaY));
        System.out.println("Dekrementacja zmiennej LiczbaX"+" "+ (--liczbaX));
        System.out.println("Dekrementacja zmiennej LiczbaY"+" "+ (--liczbaY));

    }
}
