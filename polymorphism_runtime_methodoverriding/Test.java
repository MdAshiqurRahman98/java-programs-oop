
package polymorphism_runtime_methodoverriding;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("Md Ashiqur Rahman", 25);
        p.displayInformation();
        
        System.out.println();
        
        p = new Teacher("Md Ashiqur Rahman", 25, "BSc in CSE");
        p.displayInformation();
    }
}
