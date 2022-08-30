public class ForwardNullExample {
    //Need callA() method
    //public static Object callA(){}

    public static Object callB() {
        // No defect report
        return testA(new Object());
    }

    public static String testA(Object o) {
        return o.toString();
    }
}
