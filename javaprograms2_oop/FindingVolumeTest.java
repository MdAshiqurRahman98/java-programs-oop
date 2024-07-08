
package javaprograms2_oop;

public class FindingVolumeTest {
    public static void main(String[] args) {
        FindingVolume box1 = new FindingVolume(5, 5, 5);
        FindingVolume box2 = new FindingVolume(25, 15, 5);
        
        box1.displayVolume();
        box2.displayVolume();
    }
}
