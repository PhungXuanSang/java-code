package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Tính kế thừa
        // Mục đính : tái sử dụng code
        // Từ khoóa:  extends
        Duck duck = new Duck("Long",2);
        duck.eat();

        // @Override
        duck.eat();

        // Tu khóa: super
        duck.eat();
        System.out.println("duck = " + duck);

        // Chú ý : Đơn ke thừa
    }
}
