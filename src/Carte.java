/*
420-126 – tp4 - Jeu de carte
Nom : Adjou
Prénom : Lounes
*/

public class Carte {
    public static final String[] couleursValides = {"pique", "trèfle", "carreau", "coeur"};
    private int valeur;
    private String couleur;


    public Carte(int valeur, String couleur) {   // Constructeur par defaut
        setValeur(valeur);
        setCouleur(couleur);
    }

    private void setValeur(int valeur) {
        if (!laValeurEstValide(valeur))
            throw new IllegalArgumentException("Valeur invalide: " + valeur);
        this.valeur = valeur;
    }

    private void setCouleur(String couleurCarte) {
        if (!laCouleurEstValide(couleur))
            throw new IllegalArgumentException("Couleur invalide: " + couleur);
        this.couleur = couleur;
    }

    public static boolean laValeurEstValide(int valeur) {
        boolean estValide;
        estValide = valeur >= 1 && valeur <= 13;
        return estValide;

    }

    public static boolean laCouleurEstValide(String couleurCarte) {
        boolean estValide = true;
        if (Util.trouverStr(couleurCarte, couleursValides) == -1) {
            estValide = false;
        }
        return estValide;

    }

    public Object getCouleur() {
    }

    public int getValeur() {
        return 0;
    }
}