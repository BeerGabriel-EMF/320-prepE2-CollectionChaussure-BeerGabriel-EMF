package models;

public class Basket implements Comparable<Basket> {
    private String marque;
    private String nom;
    private int taille;
    private double prix;

    public Basket(String marque, String nom, int taille, double prix) {
        this.marque = marque;
        this.nom = nom;
        this.taille = taille;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "marque='" + marque + '\'' +
                ", nom='" + nom + '\'' +
                ", taille=" + taille +
                ", prix=" + prix +
                '}';
    }

    public String getMarque() {
        return marque;
    }

    public String getNom() {
        return nom;
    }

    public int getTaille() {
        return taille;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public int compareTo(Basket b) {
        int retour = 0;
        if (this.taille > b.taille) {
            retour = 1;
        } else if (this.taille < b.taille) {
            retour = -1;
        } else {
            if (this.prix > b.prix) {
                retour = 1;
            } else if (this.prix < b.prix) {
                retour = -1;
            }
        }

        return retour;
    }

}
