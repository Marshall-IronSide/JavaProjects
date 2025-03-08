public class TestEtablissement {
    public static void main(String[] args) {
        Etablissement restaurant = new Etablissement("Le Gourmet", "Paris");
        Hotel hotel1 = new Hotel("Hotel Luxe", "Paris", 5);
        Hotel hotel2 = new Hotel("Hotel Petit", "Lyon", 3);
        System.out.println("Informations des établissements :");
        restaurant.affiche();
        hotel1.affiche();
        hotel2.affiche();
        System.out.println("\nNombre d'établissements créés : " + Etablissement.getNbre());

    }
}
