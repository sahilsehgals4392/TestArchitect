package Learnings;

import java.util.ArrayList;
import java.util.List;

public class LargestInt {

    public static void main(String[] args) {
        int a = 22;
        int b = 14;
        int c = 7;
        int d = 15;

        System.out.println("Ascending");

        List<Integer> intList = new ArrayList<>();
        intList.add(a);
        intList.add(b);
        intList.add(c);
        intList.add(d);
        for (int passes = 0; passes <= intList.size() / 2; passes++) {
            for (int i = 0; i < intList.size() - 1; i++) {
                if (intList.get(i) > intList.get(i + 1)) {
                    int temp = intList.get(i);
                    intList.set(i, intList.get(i + 1));
                    intList.set(i + 1, temp);
                }
            }
        }
        System.out.println(intList);
    }
}
