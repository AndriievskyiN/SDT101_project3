package part2;

public class OuterWithInner {
    private int outerValue = 10;

    public void outerMethod() {
        InnerClass innerObj = new InnerClass();
        innerObj.innerMethod();
    }

    private class InnerClass {
        public void innerMethod() {
            System.out.println("Inner value: " + outerValue);
        }
    }

    public static void main(String[] args) {
        System.out.println("Part 2 Inner class");
        OuterWithInner outerObj = new OuterWithInner();
        outerObj.outerMethod();
    }
}
