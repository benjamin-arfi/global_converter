public class basevalide {
    public static boolean baseValide (String sorte) {
        return sorte.equalsIgnoreCase("octale") ||
               sorte.equalsIgnoreCase("hexadecimale") ||
               sorte.equalsIgnoreCase("binaire") ||
               sorte.equalsIgnoreCase("texte") ||
               sorte.equalsIgnoreCase("decimale") ;
    }
}
