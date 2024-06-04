public class OutputDemo {
    public static void main(String[] args) {

        //  Escape characters
        // \" --> "
        // \' --> '
        // \\ --> \
        // \n --> Xuống dòng
        // \t --> Tab


        // println : Xuống dòng
        System.out.println("java Code");
        System.out.println("java Code");
        System.out.println("java Code");

        // print : không xuống dòng
        System.out.print("java Code");
        System.out.print("java Code %n");

        // printf : In theo định dạng
        // %s : Đại diện cho String
        // %d : Đại diện cho số nguyên
        // %f : Đại diện cho số thực
        // %c : Đại diện cho 1 kí tự
        // %n : Xuống dòng
        System.out.printf("Họ tên: %s, Tuổi: %d. %n","Sáng",20);
        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.println("| ID |     FULL NAME      |");
        System.out.println("+----+--------------------+");
        System.out.printf("| %2d | %18s |%n", 1, "Khoa");
        System.out.println("+----+--------------------+");
        System.out.printf("| %-2d | %-18s |%n", 2, "Long");
        System.out.println("+----+--------------------+");

        // Gom nhóm ,Làm tròn

        double money = 123456567.789;
        System.out.printf("money = %.2f %n",money);
        System.out.printf("money = %,f %n",money);
        System.out.printf("money = %,.2f %n",money);

    }
}
