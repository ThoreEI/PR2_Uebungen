package IO;

import java.io.*;

public class LineNumberReaderClass  {
    public static void main(String[] args) throws FileNotFoundException {
        StringReader stringReader = null;
        LineNumberReader lineNumberReader = null;

        try {
            stringReader = new StringReader(" This is an example\n");
            lineNumberReader = new LineNumberReader(stringReader);
            int readInt;
            int count = 0;
            while (( readInt = lineNumberReader.read()) != -1) {
                System.out.println((char) readInt);
                count++;
            }
            System.out.println(" Read chars: " + lineNumberReader.getLineNumber());
            System.out.println(" Read lines: " + count);
            lineNumberReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
