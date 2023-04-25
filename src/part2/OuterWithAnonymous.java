package part2;

public class OuterWithAnonymous {
    public void outerMethod() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside anonymous class");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args) {
        System.out.println("Part 2 anonymous class");
        OuterWithAnonymous outerObj = new OuterWithAnonymous();
        outerObj.outerMethod();
    }
}
