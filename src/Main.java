

public class Main {

    public static void main(String[] args) {


        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        System.out.println("Operatory arytmetyczne:" + "\na = true\tb = false\tc = true\td= false");

        System.out.println("(a && b) : " + (a && b));
        System.out.println("(a && c) : " + (a && c));
        System.out.println("(a && d) : " + (a && d));
        System.out.println("(b && a) : " + (b && a));
        System.out.println("(b && c) : " + (b && c));
        System.out.println("(b && d) : " + (b && d));
        System.out.println("(c && a) : " + (c && a));
        System.out.println("(c && b) : " + (c && b));
        System.out.println("(c && d) : " + (c && d));
        System.out.println("(d && a) : " + (d && a));
        System.out.println("(d && b) : " + (d && b));
        System.out.println("(d && c) : " + (d && c));

        System.out.println("");

        System.out.println("(a || b) : " + (a || b));
        System.out.println("(a || c) : " + (a || c));
        System.out.println("(a || d) : " + (a || d));
        System.out.println("(b || a) : " + (b || a));
        System.out.println("(b || c) : " + (b || c));
        System.out.println("(b || d) : " + (b || d));
        System.out.println("(c || a) : " + (c || a));
        System.out.println("(c || b) : " + (c || b));
        System.out.println("(c || d) : " + (c || d));
        System.out.println("(d || a) : " + (d || a));
        System.out.println("(d || b) : " + (d || b));
        System.out.println("(d || c) : " + (d || c));

        System.out.println("");

        System.out.println("!a : " + !a);
        System.out.println("!b : " + !b);
        System.out.println("!c : " + !c);
        System.out.println("!d : " + !d);

        System.out.println("");

        System.out.println("!(a && b) : " + !(a && b));
        System.out.println("!(b && c) : " + !(b && c));
        System.out.println("!(c && d) : " + !(c && d));

        System.out.println("");

        System.out.println("!((a && c) || (!a || b) && (!a || d) : " + !((a && c) || (!a || b) && (!a || d)));
        System.out.println("!((a && c) && (!a || b) && (!a || d) || (!d || b) : " + !((a && c) && (!a || b) && (!a || d) || (!d || b)));

        System.out.println();

        int x = 2;
        int y = 5;
        int z = 2;

        System.out.printf("Operatory porównania:" + "\nx = %d\ty = %d\tz = %d\n", x, y, z);

        System.out.println("((x > y) || (a && b) || (b && d) && (x <= z)) : " + ((x > y) || (a && b) || (b && d) && (x <= z)));
    }
}
