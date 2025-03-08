public class Menuisier extends personne{
    public Menuisier(String nom) {
        super.nom = nom;
    }
    public void affiche(){
        System.out.println("Je suis "+nom+" le Menuisier");
    }
}
