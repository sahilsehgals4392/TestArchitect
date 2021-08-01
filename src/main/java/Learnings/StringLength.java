package Learnings;

public class StringLength {
    public static void main(String[] args) {
        String s = "This is a string";
        System.out.println(s.split("").length);
        int i = 0;

        try {
            while (true) {
                s.charAt(i);
                i++;
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println(i);
        }
        i = 0;
        //System.out.println(s.lastIndexOf(""));

        for (char c : s.toCharArray()) {
            i++;
        }
        System.out.println(i);
    }
}
