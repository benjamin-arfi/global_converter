public class octaltotext {
    public static String octalToText(String octal) {
        StringBuilder result = new StringBuilder();
        int length = octal.length();
        int i = 0;
        while (i < length) {
            StringBuilder octalValue = new StringBuilder();
            while (i < length && octal.charAt(i) != ' ') {
                octalValue.append(octal.charAt(i));
                i++;
            }
            if (octalValue.length() > 0) {
                int decimal = octalToDecimal(octalValue.toString());
                if (decimal >= 0 && decimal <= 127) {
                    result.append((char) decimal);
                } else {
                    result.append("?");
                }
            }
            i++;
        }
        return result.toString();
    }
    
    
    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int power = 0;
        int length = octal.length();
        for (int i = length - 1; i >= 0; i--) {
            char c = octal.charAt(i);
            if (c == 'O') {
                continue;
            }
            int digit = c - '0';  // Conversion du caractère en valeur numérique
            decimal += digit * Math.pow(8, power);
            power++;
        }
        return decimal;
    }
}
