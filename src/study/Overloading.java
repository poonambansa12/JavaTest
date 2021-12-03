package study;

public class Overloading {

    public static void main(String[] args) {
        fly((short)1);
        fly(1L);
        fly(1,2);
        fly(new Integer[] {1,2,3});
    }

    public static void fly(int numMiles) {
        System.out.println("int");
    }

    public static void fly(long l) {
        System.out.println("long");
    }

    public static void fly(int... numFeet) {
        System.out.println("varargs");
    }

    public static void fly(Integer[] numMiles) {
        System.out.println("Integer");
    }
}
