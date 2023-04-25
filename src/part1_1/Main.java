package part1_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1.1");
        Super a = new Sub();
        a.theMethod(); // This will call the overridden method in the subclass

        // the JVM determines at runtime that the actual object being referred to is an instance of the subclass,
        // and so it calls the overridden method in the subclass rather than the method in the superclass.
    }
}