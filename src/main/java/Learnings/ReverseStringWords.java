package Learnings;

public class ReverseStringWords {
    public static void main(String[] args) {
        String a="Hello this is a book";

        String reversedString="";
        String[] arraySplit=a.split(" ");
        for(int i=0;i<arraySplit.length;i++)
        {
            String splitString=arraySplit[i];
            String reversedWord="";
            for (int j=arraySplit[i].length()-1;j>=0;j--)
            {
                reversedWord=reversedWord+splitString.charAt(j);

            }
            reversedString=reversedString +" "+ reversedWord;
        }
        System.out.println(reversedString.trim());
    }
}
