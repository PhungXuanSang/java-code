public class Dog {
    String name ;
    int age;

//    @Override
//    public String toString() {
//       return String.format("Dog[name=%s,age=%d]", name,age);
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (!(obj instanceof Dog))return false;
        Dog that = (Dog) obj;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() +2;
    }
}
