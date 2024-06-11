package entity;

public class Dog {
   public String name;
    protected int age;
    String color;
    private int id;

    public Dog(String name, int age) {
        System.out.println("khởi tạo 2 tham số");
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        System.out.println("Khởi tạo 1 tham số");
        this.name = name;
    }

    public Dog() {
        System.out.println("Khởi tạo không tham so");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
