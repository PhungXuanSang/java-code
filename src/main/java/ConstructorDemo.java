import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor : Hàm khởi tạo
        // 1. Tên constructor trùng với ten class
        // 2. Constructor khong có kiểu trả về

        Dog dog = new Dog("Long",2);

        Dog dog1 = new Dog("LInh");
        // Mặc định là không tham số

        Dog dog2 = new Dog();
    }
}
