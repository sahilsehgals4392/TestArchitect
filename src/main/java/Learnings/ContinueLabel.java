package Learnings;

// Java code to illustrate
// using label and continue
// instead of goto

public class ContinueLabel {

    public static void main(String[] args) {

        // label for outer loop
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 1)
                    continue outer;
                System.out.println(" value of j = " + j);
            }
        }
    } // end of main()
} // end of class Main
