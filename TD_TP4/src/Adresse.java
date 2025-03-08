public class Adresse {
    private int numero;
    private String nomRue;
    private int codePostal;
    private String localite;
    public Adresse(int numero, String nomRue, int codePostal, String localite)
    throws AdresseException{
        if (numero < 0){
            throw new AdresseException();
        }
        if (codePostal <1000 || codePostal > 4000){
            throw new AdresseException();
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
    public void setNumero(int numero) throws AdresseException{
        if (numero < 0){
            throw new AdresseException();
        }
        this.numero = numero;
    }
    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }
    public void setCodePostal(int codePostal) throws AdresseException{
        if (codePostal <1000 || codePostal > 4000){
            throw new AdresseException();
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
