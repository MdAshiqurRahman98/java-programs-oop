package inheritance_abstractClass;

public class Test {

    public static void main(String[] args) {
        Shape shape;

        shape = new Rectangle(15, 5);
        shape.area();

        shape = new Triangle(15, 5);
        shape.area();

        shape = new Circle(5);
        shape.area();
    }
}
