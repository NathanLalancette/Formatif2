//        420-202 – TP1 – Traitement de données orienté objet
//        Groupe : 2
//        Nom : Lalancette
//        Prénom : Nathan
//        DA : 2236998
package formes;

import exception.GrandeurFormeException;

/**
 * Cette Classe est la classe qui définit un rectangle
 */
public class Rectangle extends Forme {
    /**
     * Largeur d'un rectangle.
     */
    private int largeur;
    /**
     * Hauteur d'un rectangle.
     */
    private int hauteur;

    /**
     * Constructeur d'un rectangle. On specifie sa largeur et sa longueur.
     *
     * @param largeur Largeur du rectangle. Doit etre entre MAX_VAL et MIN_VAL.
     * @param hauteur Hauteur d'un rectangle. Doit etre entre MAX_VAL et MIN_VAL.
     */
    public Rectangle(int largeur, int hauteur) {
        setHauteur(hauteur);
        setLargeur(largeur);
        setCouleur(COULEUR_DEFAULT);
    }

    /**
     * Permet de recupere la largeur d'un rectangle.
     *
     * @return Retourne La largeur.
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Set la largeur d'un rectangle.
     *
     * @param largeur Largeur a valide.
     */
    public void setLargeur(int largeur) {
        if (estUneDroiteValide(largeur)) {
            this.largeur = largeur;
        } else throw new GrandeurFormeException("La largeur est invalide.");
    }

    /**
     * Recupere la hauteur d'un rectangle.
     *
     * @return Retourne la hauteur.
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * Set la hauteur d'un rectangle.
     *
     * @param hauteur Hauteur a valide.
     */
    public void setHauteur(int hauteur) {
        if (estUneDroiteValide(hauteur)) {
            this.hauteur = hauteur;
        } else throw new GrandeurFormeException("La largeur est invalide.");
    }

    @Override
    public int calculerPrimetre() {
        return hauteur * 2 + largeur * 2;
    }

    public int calculerSurface() {
        return getHauteur() * getLargeur();
    }
    @Override
    public String toString() {
        return super.toString() + " " + hauteur + ", " + largeur;
    }
}
