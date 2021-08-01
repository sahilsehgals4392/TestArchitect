package Learnings;

public class ObjectSwap {

    // A Java program to demonstrate that we can use wrapper
// classes to swap to objects

    // A car with model and no.

        int model, no;

        // Constructor
        ObjectSwap(int model, int no)
        {
            this.model = model;
            this.no = no;
        }

        // Utility method to print object details
        void print()
        {
            System.out.println("no = " + no +
                    ", model = " + model);
        }
    }

    // A Wrapper over class that is used for swapping
    class CarWrapper
    {
        ObjectSwap c;

        // Constructor
        CarWrapper(ObjectSwap c) {this.c = c;}
    }

    // A Class that use ObjectSwap and swaps objects of ObjectSwap
// using CarWrapper
    class Main
    {
        // This method swaps car objects in wrappers
        // cw1 and cw2
        public static void swap(CarWrapper cw1,
                                CarWrapper cw2)
        {
            ObjectSwap temp = cw1.c;
            cw1.c = cw2.c;
            cw2.c = temp;
        }

        // Driver method
        public static void main(String[] args)
        {
            ObjectSwap c1 = new ObjectSwap(50, 2);
            ObjectSwap c2 = new ObjectSwap(52, 4);
            CarWrapper cw1 = new CarWrapper(c1);
            CarWrapper cw2 = new CarWrapper(c2);
            swap(cw1, cw2);
            cw1.c.print();
            cw2.c.print();
        }
    }
