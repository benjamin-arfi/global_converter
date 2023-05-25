public class hexadecimaletotext {
    public static String hexadecimalToText(String hexadecimal) {
        StringBuilder result = new StringBuilder();
        int length = hexadecimal.length();
        for (int i = 0; i < length; i++) {
            char c = hexadecimal.charAt(i);
            if (c == ' ' ) {
                continue; // Ignorer les espaces
            } else if (c == 'H') {
                continue;
            }
          
            String hexValue = hexadecimal.substring(i, Math.min(i + 2, length));
            int decimal = hexToDecimal(hexValue);
            result.append((char) decimal);
            i++; // Avancer de 2 caractères pour ignorer le prochain caractère hexadécimal
        }
        return result.toString();
    }
    

    public static int hexToDecimal(String hex) {
        int decimal = 0;
        int power = 0;
        int length = hex.length();
        for (int i = length - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else if (c >= 'a' && c <= 'f') {
                digit = c - 'a' + 10;
            } else {
                // Caractère invalide dans la chaîne hexadécimale
                throw new IllegalArgumentException("Caractère hexadécimal invalide: " + c);
            }
            decimal += digit * Math.pow(16, power);
            power++;
        }
        return decimal;
    }
}
