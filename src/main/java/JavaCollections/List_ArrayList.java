package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//https://beginnersbook.com/2013/12/java-arraylist/
public class List_ArrayList {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Faisal");
        arrayList.add("Ramesh");
        arrayList.add("Suresh");
        arrayList.add("Gamer");
        arrayList.add("Troy");

        System.out.println("Array List :" + arrayList);

        arrayList.add(4, "Boy");
        System.out.println();
        System.out.println("Array List after adding new element:" + arrayList);
        arrayList.set(4, "Girl");
        System.out.println("\n");
        System.out.println("Array List after changing element:" + arrayList);
        arrayList.remove("Troy");
        arrayList.remove(4);
    //Iterator
        Iterator it=arrayList.iterator();
        while (it.hasNext()) {
            System.out.println("Array List item - " + it.next());
        }
    //Streams
        System.out.println("Print with stream");
        arrayList.stream().forEach(System.out::println);

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.indexOf("Ramesh"));
        System.out.println(arrayList.size());

        System.out.println(sortArrayList(arrayList));
    }

    //Sprt Array List
    public static List<String> sortArrayList(List<String>al)
    {
        String temp;
        for (int i=0;i<al.size()-1;i++)
        {
            for (int j=i+1;j<al.size();j++)
            if(al.get(i).compareToIgnoreCase(al.get(j))>0)
            {
                temp=al.get(i);
                al.set(i,al.get(j));
                al.set(j,temp);
            }

        }
        return al;
    }
}
