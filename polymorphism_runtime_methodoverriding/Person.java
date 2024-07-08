
package polymorphism_runtime_methodoverriding;

public class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayInformation() {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}
