package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역변수1
        final int data1;
        data1 = 10; // 최초 1회 할당 가능.
        // data1 = 20; // compile error

        // final 지역변수2
        final int data2 = 10;
        // data2 = 20; // compile error
        method(10);
    }

    private static void method(final int parameter) {
        // parameter = 20;
    }
}
