package IO;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class CharArrayWriterClass {

    public static void main(String[] args) {
        CharArrayWriter charArrayWriter;
        char[] chars;
        try {
           charArrayWriter = new CharArrayWriter();
            charArrayWriter.write("Hallo");
            charArrayWriter.close();
            chars = charArrayWriter.toCharArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Arrays.toString(chars));

    }
}
