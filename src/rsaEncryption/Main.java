import rsaEncryption.RSAWriter;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws IOException {
        Writer rsaWriter = new RSAWriter(new FileWriter("encryptedMessage.txt"));

    }
}
