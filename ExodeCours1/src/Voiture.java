public class Voiture {
    private String numeroImarticulation;
    private String marque;
    private double puissance;
    public Voiture(String numeroImarticulation,String marque,double puissance){
        this.numeroImarticulation = numeroImarticulation;
        this.marque = marque;
        this.puissance = puissance;
    }
    public String getNumeroImarticulation(){
        return numeroImarticulation;
    }
    public void setNumeroImarticulation(String numeroImarticulation){
        this.numeroImarticulation = numeroImarticulation;
    }
    public String getMarque(){
        return marque;
    }
    public void setMarque(String marque){
        this.marque = marque;
    }
    public double getPuissance(){
        return puissance;
    }
    public void setPuissance(double puissance){
        this.puissance = puissance;
    }
    public void affiche(){
        System.out.println("Numero d'imatriculation = " +numeroImarticulation + " Marque = " + marque+ " puissance =" +puissance);
    }
}
