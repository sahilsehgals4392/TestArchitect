package Learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    static int arr[] = {10, 20, 15, 22, 35};

    //Method to binarysearch Array
    public static void binaryArraySearch() {
        Arrays.sort(arr);
        int key = 22;
        int res = Arrays.binarySearch(arr, key);

        if (res >= 0)
            System.out.println(key + " found at index = " + res);
        else
            System.out.println(key + " Not found");

        key = 40;
        res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " found at index = " + res);
        else
            System.out.println(key + " Not found");
    }

    //Method to binarysearch ArrayList
    public static void binaryArrayListSearch() {
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(15);
        al.add(10);
        al.add(20);

        // 10 is present at index 3.
        int key = 10;
        Collections.sort(al);
        int res = Collections.binarySearch(al, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        key = 15;
        res = Collections.binarySearch(al, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");
    }


    public static void main(String[] args) {
        binaryArraySearch();
        binaryArrayListSearch();

    }

}
