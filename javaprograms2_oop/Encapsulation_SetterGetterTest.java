
package javaprograms2_oop;

public class Encapsulation_SetterGetterTest {
    public static void main(String[] args) {
        Encapsulation_SetterGetter p1 = new Encapsulation_SetterGetter();
        
        p1.setName("Md Ashiqur Rahman");
        System.out.println("Name: " +p1.getName());
        
        p1.setAge(25);
        System.out.println("Age: " +p1.getAge());
    }
}
