public class Adresse {
    private int numero;
    private String nomRue;
    private int codePostal;
    private String localite;
    public Adresse(int numero, String nomRue, int codePostal, String localite)
    throws IllegalArgumentException{
        if (numero < 0){
            throw new IllegalArgumentException( "le numéro doit être un entier strictement positif");
        }
        if (codePostal <1000 || codePostal > 4000){
            throw new IllegalArgumentException("le code postal doit être positif et compris entre 1000 et 4000");
        }
        this.numero = numero;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.localite = localite;
    }
    public int getNumero() {
        return numero;
    }
    public String getNomRue() {
        return nomRue;
    }
    public int getCodePostal() {
        return codePostal;
    }
    public String getLocalite() {
        return localite;
    }
    public void setNumero(int numero) {
        if (numero < 0){
            throw new IllegalArgumentException("le numéro doit être un entier strictement positif");
        }
        this.numero = numero;
    }
    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }
    public void setCodePostal(int codePostal) {
        if (codePostal <1000 || codePostal > 4000){
            throw new IllegalArgumentException("le code postal doit être positif et compris entre 1000 et 4000");
        }
        this.codePostal = codePostal;
    }
    public void setLocalite(String localite) {
        this.localite = localite;
    }
    public String toString() {
        return (numero + "/" + nomRue + "/" + codePostal + "/" + localite);
    }
    public boolean estDansLocalite(String localite) {
        return localite.equals(this.localite);
    }
}
