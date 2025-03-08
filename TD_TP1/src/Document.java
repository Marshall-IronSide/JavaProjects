import java.util.Date;
public class Document {
    private String titre;
    private int numId;
    private int nbPages;
    private Date dateCreation;
    public Document(String titre, int numId, int nbPages) {
        this.titre = titre;
        this.numId = numId;
        this.nbPages = nbPages;
        this.dateCreation = new Date();
    }
    public void edition(){
        System.out.println("Titre: " + titre+ "\nNumero: " + numId + "\nPages: " + nbPages+ "\nDate de creation: " + dateCreation);
    }
}
