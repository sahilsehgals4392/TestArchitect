package Learnings;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {

    public static void main(String[] args) {

//First way - Arrays.stream() -- Can be used only for Int log and Double
        int[] array = new int[]{3, 2, 5, 4, 1};
        String[] array2 = new String[]{"Text","A","B","C","D"};
        System.out.println("Array :" + array.toString());

        IntStream intStream = Arrays.stream(array);
        intStream.forEach(s -> System.out.println("Element :"+s));

        //Second way

        IntStream.of(array).forEach(s-> System.out.println("IntStream of Elements: "+s));
        Stream.of(array2).forEach(s-> System.out.println("Stream of Elements: "+s));

    }
}
