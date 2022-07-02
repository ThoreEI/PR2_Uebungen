package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {

        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        String myInput = "Ick bin net net schwul, ick bin eine Prinzessin";
        try {
                fileWriter = new FileWriter("myFirstFile.txt", true);
                bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < 100; i++) {
                bufferedWriter.write(myInput);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
