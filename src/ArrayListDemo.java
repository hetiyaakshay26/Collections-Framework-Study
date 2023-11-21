import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // creating arraylist
        ArrayList l = new ArrayList();

        // adding object in the arraylist
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l);
        // removing objects at specified index
        l.remove(2);
        System.out.println(l);

        // adding elements at the specified index
        l.add(2,"M");
        l.add("N");
        System.out.println(l);
        // removing specific object
        l.remove("M");
        System.out.println(l);
    }
}