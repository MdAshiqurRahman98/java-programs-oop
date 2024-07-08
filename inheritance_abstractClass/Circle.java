
package inheritance_abstractClass;

import java.text.DecimalFormat;

public class Circle extends Shape {
    // dim1, dim2
    Circle(double r) {
        super(r, r);
    }
    
    @Override
    void area() {
        DecimalFormat ob = new DecimalFormat("0.000");
        
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle area: " +ob.format(result));
    }
}
