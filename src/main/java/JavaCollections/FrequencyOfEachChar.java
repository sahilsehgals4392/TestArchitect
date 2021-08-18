package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String text="Hello how are you";

        Map<Character,Integer> hmap=new HashMap<>();

        for (int i=0;i<text.length();i++)
        {
            if(hmap.containsKey(text.charAt(i)))
            hmap.put(text.charAt(i),hmap.get(text.charAt(i))+1);
            else {
                hmap.put(text.charAt(i),1);
            }

        }
        System.out.println(hmap);
        Set set=hmap.entrySet();
        Iterator iterator=set.iterator();

        while (iterator.hasNext())
        {
            Map.Entry hmapEntry=(Map.Entry) iterator.next();


            if (!hmapEntry.getValue().equals(1))
            {
                System.out.println(hmapEntry.getKey());
                System.out.println(hmapEntry.getValue());
            }

        }

    }
}
