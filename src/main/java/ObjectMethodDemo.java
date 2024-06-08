public class ObjectMethodDemo {
    public static void main(String[] args) {
        // toString
        Dog dog = new Dog();
        dog.age = 18;
        dog.name = "Long";
        System.out.println("dog = " + dog);
        // equals
        Dog dog1 = new Dog();
        dog.age = 18;
        dog.name = "Long";

        Dog dog2 = new Dog();
        dog.age = 18;
        dog.name = "Long";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        // hashCode

    }
}
