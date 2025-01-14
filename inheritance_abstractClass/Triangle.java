
package inheritance_abstractClass;

public class Triangle extends Shape {
    // dim1, dim2
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Triangle area: " +result);
    }
}
