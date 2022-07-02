package rsaEncryption;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class RSAWriter extends FilterWriter {
    private final int[] PRIME_NUMBERS;
    private final int[] PUBLIC_KEY;
    private final int ENCRYPTED_MESSAGE;
    private final int NUMBER_OF_RELATIVELY_PRIMES;
    private static Scanner sc;

    public RSAWriter (Writer writer) {
        super(writer);
        sc = new Scanner(System.in);
        PRIME_NUMBERS = selectionPrimeNumbers();
        NUMBER_OF_RELATIVELY_PRIMES = (PRIME_NUMBERS[0] - 1) * (PRIME_NUMBERS[1] - 1); // number of co prime numbers
        PUBLIC_KEY = computePublicKey();
        ENCRYPTED_MESSAGE =  encryptMessage();
        int decryptedMessage = decryptMessage();
        System.out.println(decryptedMessage); // TODO Bug rest class!
        sc.close();
    }

    private int choseEncryptionValue() {
        System.out.println("Enter a number lower than " + PRIME_NUMBERS[0]);
        System.out.print(" > ");
        return Integer.parseInt(sc.nextLine());
    }

    private int encryptMessage() {
            return (int) Math.pow(choseEncryptionValue(), PUBLIC_KEY[1]) % PUBLIC_KEY[0];
    }

    private int decryptMessage() {
        int multiplicativeInverse = (int) Math.pow(PUBLIC_KEY[1], -1) % NUMBER_OF_RELATIVELY_PRIMES; // coprime
        return (int) Math.pow(ENCRYPTED_MESSAGE, multiplicativeInverse) % PUBLIC_KEY[0];
    }

    private int[] selectionPrimeNumbers() {
        System.out.println(" First prime: "); // TODO prime check!
        System.out.print(" > ");
        int firstPrime = Integer.parseInt(sc.nextLine());
        System.out.println(" Second prime: ");
        System.out.print(" > ");
       int secondPrime = Integer.parseInt(sc.nextLine());
       return new int[] {firstPrime, secondPrime};
    }

    private int[] computePublicKey() {
        int product = PRIME_NUMBERS[0] * PRIME_NUMBERS[1];
        int coprime =  selectCoprimeNumber();
        return new int[] {product, coprime};
    }

    private int selectCoprimeNumber() {
        System.out.println(" Enter a number which is prime to " + NUMBER_OF_RELATIVELY_PRIMES);
        System.out.print(" > ");
        int coprime = Integer.parseInt(sc.nextLine()); // a must be prime to m
        if (isValidPrimeProperty(coprime, NUMBER_OF_RELATIVELY_PRIMES))
            return coprime;
        else
            return selectCoprimeNumber(); // repeat
    }


    private boolean isValidPrimeProperty(int coprime, int numberOfRelativelyPrimes) {
        int largerNumber = Math.max(coprime, numberOfRelativelyPrimes);

        for (int divider = largerNumber-1; divider >= 2; divider--)
          if(coprime % divider == 0 && numberOfRelativelyPrimes % divider == 0)
                return false;
        return true;
    }

    @Override
    public void write(String message) throws IOException {
        this.close();
    }
}
