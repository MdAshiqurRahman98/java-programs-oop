
package polymorphism_runtime_methodoverriding;

public class Teacher extends Person {
   String qualification;
   
   Teacher(String n, int a, String q) {
       super(n, a);
       qualification = q;
   }
   
   @Override
   void displayInformation() {
       super.displayInformation();
       System.out.println("Qualification: " +qualification);
   }
}
