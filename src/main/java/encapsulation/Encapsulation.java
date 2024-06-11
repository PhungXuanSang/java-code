package encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        // Tính đóng gói : che dấu lữ liệu
        // 1. các thuộc tính private
        // 2. Cung cap getter// setter
        Cat cat = new Cat("Long",2);
        System.out.println("cat.getName() = " + cat.getName());

    }
}
