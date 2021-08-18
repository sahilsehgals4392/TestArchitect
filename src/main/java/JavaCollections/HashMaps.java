package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<Integer,String> hmap=new HashMap();

        hmap.put(1,"A");
        hmap.put(2,"B");
        hmap.put(3,"C");
        hmap.put(4,"D");
        hmap.put(5,"E");

        Set set=hmap.entrySet();

        Iterator it=set.iterator();
        while(it.hasNext())
        {
            Map.Entry hMapEntry=(Map.Entry) it.next();
            System.out.println("Key :" + hMapEntry.getKey() + " Value: "+ hMapEntry.getValue());
        }




        HashMap<Integer,String> hMap=new HashMap();
Thread thread=new Thread();
thread.start();
        hMap.put(1,"A");
        hMap.put(2,"B");
        hMap.put(3,"C");
        hMap.put(4,"D");
        hMap.put(5,"E");
        System.out.println("       ");
        System.out.println(hmap.get(2));
        System.out.println(hmap.remove(3));
        System.out.println(hmap.remove(3));
        System.out.println(hmap.put(3,"anyvalu"));

        System.out.println(hMap.keySet());
        System.out.println(hMap.values());

    }
}
