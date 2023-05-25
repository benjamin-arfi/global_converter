public class convertirenbinaire {
    public static String ConvertirEnBinaire(String caracter) {
        StringBuilder resultat = new StringBuilder("B");
        for (int i = 0; i < caracter.length(); i++) {
            char lettre = caracter.charAt(i);
            String binaire = convertirenbase.convertirEnBase(lettre,2);

            resultat.append(binaire).append(" ");
        }
        return resultat.toString();
    }
    
}