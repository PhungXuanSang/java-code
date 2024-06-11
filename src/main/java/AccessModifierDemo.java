import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // Phạm vi truy cap
        // Public:có thể truy cap duoc tu moi noi
        Dog dog1 = new Dog("long",2);
        System.out.println("dog1 = " + dog1.name);
        // protected:CÙng package hoặc class con
        Dog dog2 = new Dog("Long",2);
    //    System.out.println("dog2.age = " + dog2.age);
        // default:Cùng package
        Dog dog3 = new Dog("Long",3);
    //   System.out.println("dog3.color = " + dog3.color);
        // private: Cùng class
        Dog dog4 = new Dog("Long",2);
        //    System.out.println("dog4.age = " + dog4.id);

    }
}
