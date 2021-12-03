package study;

public class PassByValue {

    public static String s2 = "123";
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("StringBuffer");
        String s = "String";
        callStringBuilder(sb);
        callString(s);
        System.out.println(sb);
        System.out.println(s);
        System.out.println(s2);
    }

    public static void callStringBuilder(StringBuilder s1) {
        //s1 = new StringBuilder("newStringBuffer");
        s1.append("appended");
    }

    public static void callString(String s1) {
        //s1 = "newString";
        s2 = s2.concat("concatenated");
    }
}
