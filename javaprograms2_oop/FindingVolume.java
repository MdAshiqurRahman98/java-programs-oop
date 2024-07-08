
package javaprograms2_oop;

public class FindingVolume {
    double height, width, depth;
    
    FindingVolume(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    void displayVolume() {
        double volume = height * width * depth;
        System.out.println("Volume of the box is: " +volume);
    }
}
