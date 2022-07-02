package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader;
    String currentLine;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\UnknownUser\\IdeaProjects\\PR2_Uebungen\\data.txt"));
            while ( (currentLine = bufferedReader.readLine()) != null)
                System.out.print(currentLine);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
