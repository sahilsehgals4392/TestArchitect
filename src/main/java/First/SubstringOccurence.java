package First;

import java.util.HashMap;
import java.util.Map;

public class SubstringOccurence {

    public static void main(String[] args) {

        String str = "ababecdecdcdec";
        String split;
        Map<String, Integer> hmap = new HashMap<>();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                split = str.substring(i, j + 1);
                 for (int k = i+1; k < str.length() - split.length()+1; k++) {
                    if (split.equals(str.substring(k, k+split.length()))) {
                        if (hmap.containsKey(split))
                        {
                            hmap.put(split,hmap.get(split)+1);
                        }
                        else{
                            hmap.put(split,1);
                        }
                    }
                    }
                }
        }
        //Printing number of recurrence
        //{ab=1, cd=1, cdec=1, de=1, dec=1, cde=1, ecd=1, ec=1}
        System.out.println(hmap);

        }
    }
