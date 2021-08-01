package Learnings;

import java.util.HashMap;
import java.util.Map;

public class StringOccurenceOfWord {


    public static void main(String[] args) {

        String str = "Hello this is a string";
        Map<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                if (hmap.containsKey(c)) {
                    hmap.put(c, hmap.get(c) + 1);
                } else {
                    hmap.put(c, 1);
                }
            }

        }
        System.out.println(hmap);
    }
}
