
package javaprograms2_oop;

public class Factorial_RecursionTest {
    public static void main(String[] args) {
        Factorial_Recursion ob = new Factorial_Recursion();
        int result = ob.fact(3);
        System.out.println("Factorial of 3: " +result);
        
        result = ob.fact(5);
        System.out.println("Factorial of 5: " +result);
        
        result = ob.fact(7);
        System.out.println("Factorial of 7: " +result);
    }
}
