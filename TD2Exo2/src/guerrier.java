public class guerrier extends Personnage {
    private String arme;
    private boolean Acheval;

    public guerrier(String pseudo, int niveau, int vie,String arme, boolean Acheval) {
        super(pseudo, niveau, vie);
        this.Acheval = Acheval;
        this.arme = arme;
    }
    public String getArme() {
        return arme;
    }
    public void setArme(String arme) {
        this.arme = arme;
    }
    public boolean estAcheval() {
        return Acheval;
    }

    public void afficheGuerrier(){
        super.estEnVie();
        System.out.println("Pseudo = "+pseudo+"; Niveau: "+niveau+"; Vie :"+vie+" arme: "+arme+"; A cheval: "+(Acheval? "oui" : "non"));
    }

}
