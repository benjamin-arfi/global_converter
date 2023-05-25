public class convertirenhexadecimal {
    public static String ConvertirEnHexadecimal(String caracter) {
        StringBuilder resultat = new StringBuilder("H");
        for (int i = 0; i < caracter.length(); i++) {
            char lettre = caracter.charAt(i);
            String hexadecimale = convertirenbase.convertirEnBase(lettre,16);

            resultat.append(hexadecimale).append(" ");
        }
        return resultat.toString();
    }
}
