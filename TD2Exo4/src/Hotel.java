public class Hotel extends Etablissement{
    private int etoiles;
    public Hotel(String nom, String ville, int etoiles) {
        super(nom, ville); // Appel du constructeur de la classe Etablissement
        this.etoiles=etoiles;
    }
    public void affiche() {
        // Affichage des informations de l'établissement et de l'hôtel
        super.affiche();
        System.out.println("Nombre d'étoiles: " + etoiles);
    }
    public int getEtoiles() {
        return etoiles;
    }
    public void setEtoiles(int etoiles) {
        this.etoiles = etoiles;
    }

}
