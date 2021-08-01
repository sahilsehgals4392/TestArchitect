package Learnings;

public class BreakLabel {

        public static void main(String[] args)
        {

            boolean t = true;
            first : {
                second : {
                    third : {
                        System.out.println("Before the break");
                        if (t) // break out of second block
                            break second;
                    }
                    System.out.println("This won't execute");
                }
                System.out.println("This is after the second block");
            }
        }

}

//Second Example

class Label_Break2 {

    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 3; i++) // label
        {
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outer; // Exit both loops
                }
                System.out.print(j + " ");
            }
            System.out.println("This will not be printed");
        }
        System.out.println("Loops Complete.");
    }
}