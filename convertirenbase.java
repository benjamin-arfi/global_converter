public class convertirenbase {
    public static String convertirEnBase(int decimal,int base) {
        StringBuilder result = new StringBuilder();
       while (decimal > 0) {
           int remainder = decimal % base;
           char baseChar;
           if (remainder < 10) {
               baseChar = (char) (remainder + '0');
           } else {
               baseChar = (char) (remainder - 10 + 'A');
           }
           result.insert(0, baseChar);
        //    decalement de mon chiffre base char 
           decimal /= base;
       }
       return result.toString();
   }
}
