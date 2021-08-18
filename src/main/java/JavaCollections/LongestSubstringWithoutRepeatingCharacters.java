package JavaCollections;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int solution(String str) {
        int ans = 0;
        int i = -1;
        int j = -1;

        HashMap<Character, Integer> hmap = new HashMap<>();
        while (true) {
            boolean f1 = false;
            boolean f2 = false;

            while (i < str.length() - 1) {
                f1 = true;
                i++;
                char ch = str.charAt(i);
                hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
                if (hmap.get(ch) == 2) {
                    break;
                } else {
                    int length= i - j;
                    if(length>ans){
                        ans=length;
                    }
                }
            }

            while (j < i) {
                f2 = true;
                j++;
                char ch = str.charAt(j);
                hmap.put(ch, hmap.get(ch) - 1);

                if (hmap.get(ch) == 1) {
                    break;
                }
            }
            if (f1 == false && f2 == false) {
                break;

            }
        }
    return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
