package Learnings;

public class RemoveJunkCharactersFromString {
    public static void main(String[] args) {
        String a="$%&$ Hello ^%&%&^ w";
        System.out.println(a.replaceAll("[^\\w\\d\\s]","").trim());
    }
}
