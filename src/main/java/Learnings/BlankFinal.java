package Learnings;

class BlankFinal {

    // A sample Java program to demonstrate use and
// working of blank final

    // We can initialize here, but if we
    // initialize here, then all objects get
    // the same value. So we use blank final
    final int i;

    BlankFinal(int x) {
        // Since we have initialized above, we
        // must initialize i in constructor.
        // If we remove this line, we get compiler
        // error.
        i = x;
    }

    public static void main(String args[]) {
        BlankFinal bf = new BlankFinal(10);
        System.out.println(bf.i);

        BlankFinal bf2 = new BlankFinal(20);
        System.out.println(bf2.i);
    }
}