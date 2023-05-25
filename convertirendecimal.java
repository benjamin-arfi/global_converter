public class convertirendecimal {
    public static String ConvertirEnDecimal(String caracter) {
        StringBuilder resultat = new StringBuilder("D");
        
        for (int i = 0; i < caracter.length(); i++) {
            char lettre = caracter.charAt(i);
            String decimale = convertirenbase.convertirEnBase(lettre,10);

            resultat.append(decimale).append(" ");
        }
        return resultat.toString();
    }
}
