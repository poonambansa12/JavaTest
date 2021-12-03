package study;

public class StaticTest {
    private static final int staticVar;
    private int nonStatic;
    private int nonStatic2;
    static {
        staticVar=1;
    }
    public static void main(String[] args) {
        int staticInMethod = staticVar;
        staticInMethod +=2;
        new StaticTest().nonStatic = 5;
        StaticTest ref = new StaticTest();
        ref.nonStatic2 = 1;
        ref.nonStatic2 += 10;
        System.out.println(staticInMethod);
        System.out.println(staticVar);
        System.out.println(ref.nonStatic);
        System.out.println(new StaticTest().nonStatic);
        System.out.println(ref.nonStatic2);
    }

}
