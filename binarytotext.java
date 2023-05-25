public class binarytotext {
    public static String binaryToText(String binary) {
        StringBuilder result = new StringBuilder();
        String[] binaryArray = binary.split(" ");
        for (String binaryValue : binaryArray) {
            int decimal = binaryToDecimal(binaryValue);
            result.append((char) decimal);
        }
        return result.toString();
    }
    
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char c = binary.charAt(i);
            if (c == 'B') {
                continue;
            }
            int digit = c - '0';  // Conversion du caractère en valeur numérique
            decimal += digit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }
}
