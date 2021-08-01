package Learnings;

class ObjectEqualAndToStringOverride {

    private double re, im;

    public ObjectEqualAndToStringOverride(double re, double im) {
        this.re = re;
        this.im = im;
    }


    public boolean equals(ObjectEqualAndToStringOverride o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        // Compare the data members and return accordingly
        return this.re == o.re
                && Double.compare(this.im, o.im) == 0;
    }

    @Override
    public String toString() {
        return (re + " " + im);
    }

    public static void main(String[] args) {
        ObjectEqualAndToStringOverride c1 = new ObjectEqualAndToStringOverride(10, 15);
        ObjectEqualAndToStringOverride c2 = new ObjectEqualAndToStringOverride(10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
        System.out.println(c1);
        System.out.println(c2);
    }

}
