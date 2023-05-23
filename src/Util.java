import java.util.Random;
import java.util.Scanner;

/*
420-126 – tp4 - Jeu de carte
Nom : Adjou
Prénom : Lounes
*/
public class Util {
    public Util() {
    }

    public static int trouverStr(String strTb1, String t1Str[]) {
        int indice = -1;
        for (int i = 0; i <= t1Str.length; i++) {
            if (strTb1.equalsIgnoreCase(t1Str[i])) {
                indice = i;
            }
        }
        return indice;
    }

    public static int getNombreAleatoireEntreBorne(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max doit être plus grand que min");
        }

        Random r = new Random(); //Instanciation de la classe Random
        return r.nextInt((max - min) + 1) + min;
    }

    public static int lireEntierValide(String question, int valeurMin, int valeurMax) {
        int reponseValide = 0;
        int reponse = 0;
        boolean estInvalide = true;

        do {
            reponse = lireEntier(question);


            if (valeurMin <= reponse && reponse <= valeurMax) {
                reponseValide = reponse;
                System.out.println(reponseValide);
                estInvalide = false;
            } else if (reponse < valeurMin) {
                System.out.println("Erreur: " + reponse + " est inférieur à 0.");
            } else {
                System.out.println("Erreur: " + reponse + " est supérieur à 100.");
            }
        } while (estInvalide);


        return reponseValide;

    }


    public static int lireEntier(String question) {
        int reponse = 0;
        String strReponse;

        strReponse = lireString(question);
        reponse = Integer.parseInt(strReponse);

        return reponse;
    }

    public static String lireString(String question) {
        String reponse;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println(question);
        reponse = sc.nextLine();

        return reponse;
    }
}
