public class StringDemo {
    public static void main(String[] args) {
        //  Nguyên thủy (Primitive)
        String s1 = "Java Code";
        String s2 = "Java Code";
        // Non primitive
        String s3 = new String("Java Code");
        String s4 = new String("Java Code");
    // so sách == v equals
        System.out.println(s1 == s2); // true
        System.out.println(s2 == s3); // false
        System.out.println(s3 == s4);   // false

        System.out.println(s1.equals(s2));// true
        System.out.println(s2.equals(s3));// true
        System.out.println(s3.equals(s4));// true


    }
}
