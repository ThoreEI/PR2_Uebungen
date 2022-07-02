package IO;

import java.io.*;

public class PrintWriterClass {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter;
        int readInt;
        try {
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));
            printWriter.println(1 == 1);
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
