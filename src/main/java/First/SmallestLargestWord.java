package First;

public class SmallestLargestWord {

    public static void main(String[] args) {
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        String word = "", small = "", large = "";
        String[] words = string.split(" ");
        int length = 0;

        //Add extra space after string to get the last word in the given string
        string = string + " ";


        //Initialize small and large with first word in the string
        small = large = words[0];

        //Determine smallest and largest word in the string
        for (int k = 0; k < words.length; k++) {

            //If length of small is greater than any word present in the string
            //Store value of word into small
            if (small.length() > words[k].length())
                small = words[k];

            //If length of large is less than any word present in the string
            //Store value of word into large
            if (large.length() < words[k].length())
                large = words[k];
        }
        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);
    }
}
