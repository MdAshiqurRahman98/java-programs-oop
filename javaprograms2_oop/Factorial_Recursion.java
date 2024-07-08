
package javaprograms2_oop;

public class Factorial_Recursion {
    int fact(int n) {
        if(n == 1) {  // Base case
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
}
