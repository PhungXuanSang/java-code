package abstraction;

public class Circle extends Shape implements Drawable,Extendable{
    @Override
    public void draw() {
        System.out.println("Drow circle");
    }

    private double radius;

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
public Circle(double radius){
        this.radius = radius;
}

    @Override
    public void extend() {
        System.out.println("dang mo rộng");
    }
}
