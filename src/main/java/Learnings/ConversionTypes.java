package Learnings;

public class ConversionTypes {
    // 1.overloaded method with primitive formal argument
    public void method(int i)
    {

        System.out.println("Primitive type int formal argument :" + i);
    }

    // overloaded method with reference formal argument
    public void method(Integer i)
    {

        System.out.println("Reference type Integer formal argument :" + i);
    }

    // 2. overloaded method primitive formal argument
    // and to be invoked for wrapper Object as overloaded method
    // with wrapper object of same(Long) type as an argument is not
    // available.
    public void method(long i)
    {

        System.out.println("Primitive type long formal argument :" + i);
    }

}

class Geeksforgees
{

    public static void main (String[] args)
    {
        ConversionTypes c = new ConversionTypes();


        // invoking the method with different signature.
        c.method(10);
        c.method(new Integer(15));
        c.method((long)(100));
        c.method(new Long(100));

        // Using short will give, argument mismatch;
        // possible lossy conversion from int to short
        // c.method(new Short(15));

    }
}
