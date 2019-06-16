public class JNITest {
    static {
        System.loadLibrary("myclib-jni");
    }

    public static void main(String[] args) {
        double a = 3.12;
        double b = 4.28;
        if (Math.abs(myclib.sum(a, b) - (a+b)) > 0.01) {
            System.exit(1);
        }
        System.exit(0);
    }
}
