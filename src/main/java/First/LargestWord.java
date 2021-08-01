package First;

import java.util.Arrays;

public class LargestWord {

    public static void main(String[] args) {
        String string="This is a sample string";
        String [] array=string.split(" ");
        Integer[] wLength=new Integer[array.length];

        for (int i=0;i<array.length;i++)
        {
            wLength[i]=array[i].length();
        }
        Arrays.sort(wLength);
        for (int i=0;i<array.length-1;i++)
        {
           if(array[i].length()==wLength[wLength.length-1])
           {
               System.out.println( " Largest "+array[i]);
           }
        }


    }
}
