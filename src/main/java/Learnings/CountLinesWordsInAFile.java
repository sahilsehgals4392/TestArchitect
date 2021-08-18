package Learnings;

import org.testng.annotations.Test;

import java.io.*;

public class CountLinesWordsInAFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\sahsehga1\\Documents\\TextReader.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 1;
        int whitespaceCount = 0;

        // Reading line by line from the
        // file until a null is returned
        while ((line = reader.readLine()) != null) {
            if (line.equals("")) {
                paragraphCount++;
            } else {
                characterCount += line.length();

                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");

                countWord += wordList.length;
                whitespaceCount += countWord - 1;

                // [!?.:]+ is the sentence delimiter in java
                String[] sentenceList = line.split("[!?.:]+");

                sentenceCount += sentenceList.length;
            }
        }

        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whitespaceCount);
    }

    @Test
    public static void test() throws IOException {
        File file = new File("C:\\Users\\sahsehga1\\Documents\\TextReader.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        int whiteSpaceCount = 0;
        int sentenceCount = 0;

        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("")) {
                paraCount = +1;
            } else {
                characterCount = +line.length();
                String words[] = line.split("\\s+");
                wordCount = +words.length;
                whiteSpaceCount = +wordCount - 1;
                String sentence[] = line.split("[!?.:]+");
                sentenceCount = +sentence.length;
            }

        }
        if(sentenceCount>=1)
        {paraCount++;}
        System.out.println("Total word count = " + wordCount);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paraCount);
        System.out.println("Total number of whitespaces = " + whiteSpaceCount);
    }
}
