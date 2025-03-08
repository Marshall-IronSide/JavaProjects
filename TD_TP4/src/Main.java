public class Main {
    public static void main(String[] args) {
        try {
            Adresse adresse1 = new Adresse(15, "Rue de Paris", 500, "Paris");
            System.out.println(adresse1.toString());
            System.out.println("Adresse dans Paris : " + adresse1.estDansLocalite("Paris"));
            System.out.println("Adresse dans Lyon : " + adresse1.estDansLocalite("Lyon"));
        }
        catch (AdresseException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}