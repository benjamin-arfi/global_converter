
public class estvalide {
    public static boolean estvalide(String caracter) {
        for(char c: caracter.toCharArray()){ 
            // mettre tout les ellements en tableau (toCharArray)
            if(!Character.isLetterOrDigit(c) && c != ' '){
                return false;
            }
        }
        return true;
    }
}
