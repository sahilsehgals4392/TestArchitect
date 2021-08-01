package Learnings;

public class IntegerCaching {

    public static void main(String[] args) {
        int a=132;
        int b=132;
        int c= new Integer((int) 132.8);
        int d= ((int) 132.8);

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
    }
}
