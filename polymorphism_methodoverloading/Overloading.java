
package polymorphism_methodoverloading;

public class Overloading {
    void add(double a, double b) {
        System.out.println(a + b);
    }
    
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    
    void add() {
        System.out.println("Nothing to add.");
    }
    
    public static void main(String[] args) {
        Overloading ob = new Overloading();
        ob.add(15, 5);
        ob.add(25, 15, 5);
        ob.add();
    }
}
