package Devoir;

public class Tournoi {
    private String designation;  // Désignation du tournoi
    private double dotation;     // Dotation du tournoi
    private static int nombre = 0;  // Nombre de tournois créés

    // Constructeur avec paramètres
    public Tournoi(String designation, double dotation) {
        this.designation = designation;
        this.dotation = dotation;
        nombre++;  // Incrémente le nombre de tournois créés
    }

    // Getters et Setters
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getDotation() {
        return dotation;
    }

    public void setDotation(double dotation) {
        this.dotation = dotation;
    }

    public static int getNombre() {
        return nombre;
    }

    public static void setNombre(int nombre) {
        Tournoi.nombre = nombre;
    }

    // Méthode affiche
    public void affiche() {
        System.out.println(designation + " / " + dotation);
    }

    // Méthode pour augmenter la dotation
    public void augmenterDotation(double somme) {
        dotation += somme;
    }

    public static void main(String[] args) {
        // Création de tournois
        Tournoi t1 = new Tournoi("Tournoi de Paris",10000);
        Tournoi t2 = new Tournoi("Tournoi de Lyon", 15000);

        // Affichage des tournois
        t1.affiche();
        t2.affiche();

        // Augmentation de la dotation
        t1.augmenterDotation(5000);
        t1.affiche();

        // Affichage du nombre de tournois créés
        System.out.println("Nombre de tournois créés : " + Tournoi.getNombre());
    }

}
