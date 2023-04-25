package part2;

public class OuterWithLocal {
    private int outerValue = 10;

    public void outerMethod() {
        class LocalClass {
            public void localMethod() {
                System.out.println("Local value: " + outerValue);
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.localMethod();
    }

    public static void main(String[] args) {
        System.out.println("Part 2 local class");
        OuterWithLocal outerObj = new OuterWithLocal();
        outerObj.outerMethod();
    }
}
