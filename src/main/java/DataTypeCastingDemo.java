public class DataTypeCastingDemo {
    public static void main(String[] args) {
        // Widening
        // byte --> short --> int --> long --> float --> double
        byte a = 10;
        int b = (int) a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        // Narrowing
        // double --> float --> long --> int --> short --> byte
        long m = 8000000000L;
        int n = (int) m;
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        // chú ý
        int x = 1;
        int y = 2;
        System.out.println((float) x / y);
      Double dc =1.0;
      double da = 1;
        System.out.println("dc = " + dc);
        System.out.println("da = " + da);

    }
}
