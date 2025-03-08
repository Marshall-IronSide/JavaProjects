public class Etablissement {
    private String nom;
    private String ville;

    private static int nbre = 0;

    public Etablissement(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
        nbre++;
    }
    public void affiche() {
        System.out.println("Nom: " + nom + ", Ville: " + ville);
    }
    public String getNom() {
        return nom;
    }
    public String getVille() {
        return ville;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public static int getNbre() {
        return nbre;
    }
}