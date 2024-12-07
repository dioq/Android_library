package cn.my.core2;

public class MathUtils {
    static {
        System.loadLibrary("math");
    }

    public native static int mul(int a, int b);

    public int mul_java(int a, int b) {
        int result = mul(a, b);
        return result;
    }
}
