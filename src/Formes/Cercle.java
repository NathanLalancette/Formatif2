//        420-202 – TP1 – Traitement de données orienté objet
//        Groupe : 2
//        Nom : Lalancette
//        Prénom : Nathan
//        DA : 2236998
package Formes;

import exception.FormeException;

import java.util.Objects;

/**
 * Cette Classe est la classe qui définit un cercle
 */
public class Cercle {
    private int rayon;
    private String couleur;
    private final String nom = "Cercle";
    public final static String COULEUR_DEFAUT = "vert";
    public final static String[] LES_COULEURS = {"rouge", "vert"};
    public final static int MAX_VAL = 30;
    public final static int MIN_VAL = 1;
    public final static int RAYON_DEFAUT = 10;

    public Cercle(int rayon) {
        setRayon(rayon);
    }

    public int calculerPrimetre() {
        return (int) (2 * Math.PI * rayon);
    }

    public int getRayon() {
        return rayon;
    }
    public boolean couleurEstValide(String couleur){
        boolean reponse = false;
        for (int i = 0; i < LES_COULEURS.length && !reponse; i++) {
            if (Objects.equals(LES_COULEURS[i], couleur.trim().toLowerCase())){
                reponse = true;
            }
        }
        return reponse;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setRayon(int rayon) {
        if (estUneDroiteValide(rayon)){
            this.rayon = rayon;
        } else throw new FormeException("Le rayon est invalide");
    }
    public boolean rayonEstValide(){

    }
    public int calculerSurface() {
        return (int) (Math.pow(rayon, 2) * Math.PI);
    }
    @Override
    public String toString() {
        return super.toString() + " " + rayon;
    }
}
