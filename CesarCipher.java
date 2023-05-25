public class CesarCipher {
    public static String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char encryptedChar = (char) (((c - base + key) % 26) + base);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }

    public static String decrypt(String encryptedText, int key) {
        return encrypt(encryptedText, -key);
    }
}
