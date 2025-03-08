
public abstract class Personnage {
    protected String pseudo;
    protected int niveau;
    protected int vie;
    public Personnage(String pseudo,int niveau,int vie){
        this.pseudo = pseudo;
        this.niveau = niveau;
        this.vie = vie;
    }
    public void ajoutVie(int a){
        vie += a;
    }
    public  void retirerVie(int a){
        vie -= a;
    }
    public boolean estEnVie(){
        return vie > 0;
    }
    public void affichePersonnage(){
        System.out.println("Pseudo: "+pseudo+" Niveau: "+niveau+" Vie: "+vie);
    }
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}
