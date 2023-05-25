public class decimaltotext {
    public static String decimalToText(String decimal) {
        StringBuilder result = new StringBuilder();
        String[] decimalArray = decimal.split(" ");
        for (String decimalValue : decimalArray) {
            int asciiValue = decimalToAscii(decimalValue);
            if (asciiValue >= 0 && asciiValue <= 127) {
                result.append((char) asciiValue);
            } else {
                result.append("?");
            }
        }
        return result.toString();
    }
    
    public static int decimalToAscii(String decimal) {
        int asciiValue = 0;
        int power = decimal.length() - 1;
        for (int i = 0; i < decimal.length(); i++) {
            char c = decimal.charAt(i);
            if (c == 'D') {
                power --;
                continue;
            }
            int digit = c - '0';  // Conversion du caractère en valeur numérique
            asciiValue += digit * Math.pow(10, power);
            power--;
        }
        return asciiValue;
    }
}
