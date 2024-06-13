package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng

        // Abstract class
        // Trừu tượng khoong hoàn toàn (<100%)
        Circle circle = new Circle(1.0);
        System.out.println("circle.area() = " + circle.area());
        // Khong the khởi tạo
        //  Shape shape = new Shape();  --- loix

        // Interface
        // Trừu tuượng hoàn toàn (100%)
        // Mac dịnh : public abstract

        // Đa ke thừa
        circle.draw();
        circle.extend();

    }
}
