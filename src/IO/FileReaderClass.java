package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader;
        int readInt;
        try {
            fileReader = new FileReader("C:\\Users\\UnknownUser\\IdeaProjects\\PR2_Uebungen\\data.txt");
            while ( (readInt = fileReader.read()) != -1)
                System.out.print((char) readInt);
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
