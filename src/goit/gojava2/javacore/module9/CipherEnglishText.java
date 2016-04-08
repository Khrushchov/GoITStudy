package goit.gojava2.javacore.module9;

public class CipherEnglishText {
    private final int ALPHABET_CAPACITY = 26;
    private final char firstLetter = 'a';
    private final int KEY;


    public CipherEnglishText(int key) {
        KEY = key;
    }

    public int getKey() {
        return KEY;
    }

    public static void main(String[] args) {
        CipherEnglishText cipher = new CipherEnglishText(+57);
        char encryptLetter = cipher.encrypt('c');
        char decryptLetter = cipher.decrypt(encryptLetter);

        System.out.println(encryptLetter);
        System.out.println(decryptLetter);
    }

    private char encrypt(char letter) {
        char encryptLetter;
        if (KEY >= 0) {
            encryptLetter = (char) ((((letter - firstLetter) + KEY)
                    % ALPHABET_CAPACITY) + firstLetter);
        } else {
            encryptLetter = (char) ((((letter - firstLetter) + KEY)
                    % ALPHABET_CAPACITY) + ALPHABET_CAPACITY + firstLetter);
        }
        return encryptLetter;
    }

    private char decrypt(char letter) {
        char encryptLetter;
        if (KEY < 0) {
            encryptLetter = (char) ((((letter - firstLetter) - KEY)
                    % ALPHABET_CAPACITY) + firstLetter);
        } else {
            encryptLetter = (char) ((((letter - firstLetter) -KEY) % ALPHABET_CAPACITY) + ALPHABET_CAPACITY +   firstLetter);
        }
        return encryptLetter;
    }
}
