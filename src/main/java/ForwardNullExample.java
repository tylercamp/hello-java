public class ForwardNullExample {
    public static Object callA() {
        Object Aprime = null;
        // This causes a FORWARD_NULL defect report
        return testA(Aprime);
    }

    public static Object callB() {
        // No defect report
        return testA(new Object());
    }

    public static String testA(Object o) {
        return o.toString();
    }
}
