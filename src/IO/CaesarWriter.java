package IO;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class CaesarWriter extends FilterWriter {
    private int countOfShifts;

    protected CaesarWriter(Writer out, int countOfShifts) {
        super(out);
        this.countOfShifts = countOfShifts;
    }

    @Override
    public void write(int c) throws IOException {

        c = computeNewChar(c);
        super.write(c);
    }

    private int computeNewChar(int c) {
        return c + countOfShifts;
    }

    public void write(char cbuf[], int off, int len) throws IOException {
        out.write(cbuf, off, len);
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        out.write(str, off, len);
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    public static void main(String[] args) throws IOException {
        CaesarWriter caesarWriter = new  CaesarWriter(new PrintWriter(new FileWriter("text.txt", true)), 5);
        caesarWriter.write(127);
    }


}
