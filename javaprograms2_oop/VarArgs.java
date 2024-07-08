
package javaprograms2_oop;

public class VarArgs {
    void add(int ... num) {
        int sum = 0;
        
        for(int x : num) {
            sum = sum + x;
        }
        
        System.out.println("The sum is: " +sum);
    }
    
    public static void main(String[] args) {
        VarArgs ob = new VarArgs();
        ob.add(3, 5, 7);
        ob.add(5, 15, 25);
        ob.add(11, 33, 55);
    }
}
