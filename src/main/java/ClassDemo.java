public class ClassDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Shiba";
        dog.age = 18;

        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.age = " + dog.age);
        dog.bark();

        int sum = dog.sum(7,9);
        System.out.println("sum = " + sum);

    }
}
