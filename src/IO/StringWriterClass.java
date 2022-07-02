package IO;

import java.io.*;

public class StringWriterClass {

        public static void main(String[] args) {

            Writer stringWriter;
            String myInput = "Ick bin net net schwul, ick bin eine Prinzessin";
            try {
                stringWriter = new StringWriter();
                for (int i = 0; i < 100; i++) {
                    stringWriter.write(myInput);
                }
                System.out.println(stringWriter.toString());
                stringWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


