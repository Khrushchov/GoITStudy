package goit.gojava2.javacore.module9;

public class CipherCaesarEnglishText {
    private final int ALPHABET_CAPACITY = 26;
    private final char firstUpperLetter = 'A';
    private final char firstLowerLetter = 'a';
    private final int KEY;

    public CipherCaesarEnglishText(int key) {
        KEY = key;
    }

    public int getKey() {
        return KEY;
    }

    public static void main(String[] args) {
        CipherCaesarEnglishText cipher = new CipherCaesarEnglishText(2);
        String encodedWord = cipher.encryptWord("ABcdEf");
        String decodedWord = cipher.decryptWord(encodedWord);

        System.out.println(encodedWord);
        System.out.println(decodedWord);
    }

    private String encryptWord(String word) {
        StringBuilder mutableWord = new StringBuilder(word);
        for (int i = 0; i < mutableWord.length(); i++) {
            mutableWord.setCharAt(i, encryptChar(mutableWord.charAt(i)));
        }
        return mutableWord.toString();
    }

    private String decryptWord(String word) {
        StringBuilder mutableWord = new StringBuilder(word);
        for (int i = 0; i < mutableWord.length(); i++) {
            mutableWord.setCharAt(i, decryptChar(mutableWord.charAt(i)));
        }
        return mutableWord.toString();
    }

    private char encryptChar(char letter) {
        char firstLetter;
        if (Character.isLowerCase(letter)) {
            firstLetter = firstLowerLetter;
        } else {
            firstLetter = firstUpperLetter;
        }

        return (char) ((((letter - firstLetter) + KEY % ALPHABET_CAPACITY +
                ALPHABET_CAPACITY) % ALPHABET_CAPACITY) + firstLetter);
    }

    private char decryptChar(char letter) {
        char firstLetter;
        if (Character.isLowerCase(letter)) {
            firstLetter = firstLowerLetter;
        } else {
            firstLetter = firstUpperLetter;
        }

        return (char) ((((letter - firstLetter) - KEY % ALPHABET_CAPACITY +
                ALPHABET_CAPACITY) % ALPHABET_CAPACITY) + firstLetter);
    }
}
