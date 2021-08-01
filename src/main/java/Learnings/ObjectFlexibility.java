package Learnings;

public class ObjectFlexibility {



    public static void main(String arr[]) {
        Object y;

        y = 'A';
        System.out.println(y.getClass().getName());

        y = 1;
        System.out.println(y.getClass().getName());

        y = "Hi";
        System.out.println(y.getClass().getName());

        y = 1.222;
        System.out.println(y.getClass().getName());

        y = false;
        System.out.println(y.getClass().getName());
    }
}
