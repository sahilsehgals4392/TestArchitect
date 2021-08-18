package Learnings;

public class FinalVariableAssignments {


    // i could be assigned a value here
    // or constructor or init block also.
    final int i;

    FinalVariableAssignments(int a) {
        i = a;
        System.out.println(i);
    }

    public static void main(String[] args) {
        FinalVariableAssignments obj = new FinalVariableAssignments(25);
        FinalVariableAssignments obj4 = new FinalVariableAssignments(40);
    }
    // other stuff in the class
}
