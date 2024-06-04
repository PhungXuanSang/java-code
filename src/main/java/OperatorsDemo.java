public class OperatorsDemo {
    public static void main(String[] args) {
        // Toán tử số học
        // +, -,*, / , %
        // % là toán tử chia lấy dư
        System.out.println(99 + 1);
        System.out.println(99 - 1);
        System.out.println(99 * 20);
        System.out.println(99 / 9.4);
        System.out.println(99 % 2);

        // Toán tử viết tắt : +=, -=, *=, /=,%=
        int a = 100;
        a += 10;
        System.out.println("a = " + a);

        // ++ ,--
        int b = 1000;
        b++;
        System.out.println("b = " + b);

        // Chú ý
        int c = ++b;
        // <=>
        // b = b+1
        // int c = b
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        //
        int d = b++;
        // int d = b;
        // b = b + 1;
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Toán tủ quan hệ
        // ==,>,>=,<,<=,!=;
        // Toán tử logic
        // AND : &&
        // OR : ||
        // NOT : !

        //
        boolean ok = (b > 5) && (b < 109999);
        boolean notTrue = false;

        ///////////////

    }

}
