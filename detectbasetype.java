public class detectbasetype {
    public static String detectBaseType(String input) {
        if (input.contains("H")) {
            return "hexadecimal";
        } else if (input.contains("O")) {
            return "octal";
        } else if (input.contains("B")) {
            return "binary";
        } else if (input.contains("D")) {
            return "decimal";
        }
        return null;
    }
}
