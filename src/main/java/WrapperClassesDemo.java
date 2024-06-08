public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Primitive             Wrapper class
        // byte                  Byte
        // short                 Short
        // int                   Integer
        // long                  Long
        // float                 Float
        // double                Double
        // char                  Character
        // boolean               Boolean


        //Boxing : Primitive --> Wrapper class
        int a = 100;
        Integer b = Integer.valueOf(a);

        // Unboxing : Wrapper class --> Primitive
        Integer x = Integer.valueOf(100);
        int y = x.intValue();

        // Ứng dụng
        // 1. Kiểm tra kí tu in hoa ,in thường
        System.out.println("Character.isDigit('1') = " + Character.isDigit('1'));
        System.out.println("Character.isUpperCase('c') = " + Character.isUpperCase('c'));
        System.out.println("Character.isAlphabetic('@') = " + Character.isAlphabetic('@'));
        // 2. Chuyển String sang số
        String s = "12346";
        int n = Integer.parseInt(s);
        System.out.println("n = " + n);
        double m = Double.parseDouble("123.456");
        System.out.println("m = " + m+10);

    }
}
