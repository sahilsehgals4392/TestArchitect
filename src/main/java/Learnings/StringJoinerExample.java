package Learnings;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner(",","{","}");
        stringJoiner.add("Hello")
                .add("World")
                .add("String");
        System.out.println(stringJoiner.toString());
    }
}
