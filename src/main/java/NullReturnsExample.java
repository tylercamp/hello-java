public class NullReturnsExample {
    static int count = 0;

    public static Object returnA() {
        return null;
    }
    public static Object returnB() {
        return new Object();
    }
    public static void testA() {
        // This demonstrates a very straightforward null-return bug because we are passing null in.
        returnA().toString();
    }
    public static void testB() {
        // no bug here
        returnB().toString();
    }
}
