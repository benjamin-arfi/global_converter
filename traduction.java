import java.util.Scanner;

public class traduction {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String caracter;
            do {
                System.out.println("Entrez votre chaine de caractere");
                caracter = scanner.nextLine();

                if (!estvalide.estvalide(caracter)) {
                    System.out.println("La chaine que vous avez saisi n'est pas valide veuillez n'ecrire que des chiffres et des lettres ");
                }
            } while (!estvalide.estvalide(caracter));

            String sorte;
            do {
                System.out.println("quelle sorte de traduction souhaitez vous ? (octale , hexadecimale, binaire, decimale ou texte)");
                sorte = scanner.nextLine();

                if (!basevalide.baseValide(sorte)) {
                    System.out.println("La base de traduction specifie n'est pas valide. reessayer.");
                }
            } while (!basevalide.baseValide(sorte));
            
            String chaineTraduite = "";
            switch (sorte.toLowerCase()) {
                //sert a ce que meme si mon utilisateur ecrit en majuscule (octale ou une case alors sa le remet en miniscule et ile detecte)
                case "octale":
                   chaineTraduite = convertirenoctal.ConvertirEnOctal(caracter);
                   System.out.println("Texte traduit : " + (chaineTraduite));
                    break;
                case "hexadecimale":
                    chaineTraduite = convertirenhexadecimal.ConvertirEnHexadecimal(caracter);
                    System.out.println("Texte traduit : " + (chaineTraduite));
                    break;
                case "binaire":
                    chaineTraduite = convertirenbinaire.ConvertirEnBinaire(caracter);
                    System.out.println("Texte traduit : " + (chaineTraduite));
                    break;
                case "texte":
                    
                     if (detectbasetype.detectBaseType(caracter) == "decimal") {
                         chaineTraduite = decimaltotext.decimalToText(caracter);
                     } else if (detectbasetype.detectBaseType(caracter) == "hexadecimal") {
                       chaineTraduite = hexadecimaletotext.hexadecimalToText(caracter);
                     } else if (detectbasetype.detectBaseType(caracter)== "octal") {
                         chaineTraduite = octaltotext.octalToText(caracter);
                     } else if (detectbasetype.detectBaseType(caracter) == "binary") {
                         chaineTraduite = binarytotext.binaryToText(caracter);
                     }
                    System.out.println("Texte traduit : " + (chaineTraduite));
                    break;
                    
                case "decimale":
                    chaineTraduite = convertirendecimal.ConvertirEnDecimal(caracter);
                    System.out.println("Texte traduit : " + (chaineTraduite));
                    break; 
                       
                default:
                    System.out.println("La sorte specifie n'est pas valide ");
                    break;
            }

            int key;
            do {
                System.out.println("Entrez la clé de chiffrement (un entier positif) :");
                while (!scanner.hasNextInt()) {
                    System.out.println("La clé de chiffrement doit être un entier positif. Réessayez :");
                    scanner.next();
                }
                key = scanner.nextInt();
                if (key <= 0) {
                    System.out.println("La clé de chiffrement doit être un entier positif. Réessayez :");
                }
            } while (key <= 0);

            String encryptedText = CesarCipher.encrypt(caracter, key);
            String decryptedText = CesarCipher.decrypt(encryptedText, key);

            System.out.println("Texte chiffré : " + encryptedText);
            System.out.println("Texte déchiffré : " + decryptedText);
        }
    } 
}

