package Learnings;

import java.util.Arrays;
import java.util.List;

public class JavaStreamFilter_ForEach {


    public static void main(String[] args) {
        List<String> names= Arrays.asList("Peter","Sam","Greg","Ryan","Carlo");


        names.stream().filter(name-> isNotSam(name)).forEach(name-> System.out.println(name));
    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }
}
