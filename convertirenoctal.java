public class convertirenoctal {
    public static String ConvertirEnOctal(String caracter) {
        StringBuilder resultat = new StringBuilder("O");
        for (int i = 0; i < caracter.length(); i++) {
            char lettre = caracter.charAt(i);
            // on definit les emplacements de chaque ellements de ma chaine de caractere
            System.out.println(lettre);
            String octal = convertirenbase.convertirEnBase(lettre,8);
            resultat.append(octal).append(" ");
            // à la fin de chaque traduction on rajoute un espace
        }
        return resultat.toString();
    }
}
