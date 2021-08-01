package Learnings;

public class PassNullArgument {

    public static void main(String[] args) {
        test(null);
    }

    public static void test(Object o) {
        System.out.println("Object Argument");
    }

    public static void test(String string) {
        System.out.println("String Argument");
    }
    public static void test(int a) {
        System.out.println("Int Argument");
    }
}
