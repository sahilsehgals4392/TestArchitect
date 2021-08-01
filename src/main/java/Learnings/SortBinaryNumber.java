package Learnings;

import java.util.Arrays;

public class SortBinaryNumber {
    public static void main(String[] args) {
        String binaryString = "100110010";
        int binaryNumber = Integer.parseInt(binaryString);
       //Convert it into Integer Array
        int j = 0;
        int len = binaryString.length();
        int[] arr = new int[len];

        while (binaryNumber != 0) {
            arr[len - j - 1] = binaryNumber % 10;
            binaryNumber = binaryNumber / 10;
            j++;
        }
        Arrays.stream(arr).sorted().forEach(s->System.out.println(s));
    }
}

